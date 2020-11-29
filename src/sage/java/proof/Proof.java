package sage.java.proof;

import org.apache.commons.lang3.ArrayUtils;
import sage.java.nodes.base.Node;

import java.util.ArrayList;
import java.util.List;

public final class Proof extends ProofNode {
    private final List<Sentence> premises = new ArrayList<>();
    private final List<ProofNode> children = new ArrayList<>();

    private final boolean isRootProof;

    public Proof() {
        super(new int[] { 0 });
        isRootProof = true;
    }

    private Proof(int[] graphPosition) {
        super(graphPosition);
        isRootProof = false;
    }

    public Sentence addPremise(Node premiseNode) {
        var sentence = new Sentence(premiseNode);
        premises.add(sentence);
        return sentence;
    }

    public Conclusion addConclusion(Node conclusionNode, Rule rule) {
        var conclusion = new Conclusion(new Sentence(conclusionNode), rule, getNextGraphPosition());
        children.add(conclusion);
        return conclusion;
    }

    public Proof addChildProof() {
        var newProof = new Proof(getNextGraphPosition());
        children.add(newProof);
        return newProof;
    }

    public ProofNode[] getChildren() {
        return children.toArray(new ProofNode[0]);
    }

    private List<Line> buildLines(int depth) {
        List<Line> lines = new ArrayList<>();

        // Adding premise lines
        for(var premise : premises) {
            lines.add(new Line(depth, premise.toString(), depth == 0 ? "Premise" : "Assume"));
        }

        // Adding the line for the premise divider
        lines.add(new Line(depth));

        // Adding conclusion and subproof lines
        for(var child : children) {
            if(child instanceof Conclusion childConclusion) {
                lines.add(new Line(depth, childConclusion.getSentence().toString(), childConclusion.getRule().toString()));
            } else if(child instanceof Proof childProof) {
                lines.addAll(childProof.buildLines(depth + 1));
            }
        }

        return lines;
    }

    public List<String> getLines() {
        var lines = buildLines(0);
        String[] stringLines = new String[lines.size()];
        int longestSentenceLineLength = 0;
        int numSentences = 0;

        for(int i = 0; i < lines.size(); i++) {
            Line line = lines.get(i);
            if(line.lineType == Line.Type.SENTENCE) {
                stringLines[i] = "|" + "    |".repeat(line.depth) + " " + line.sentence;
                if(stringLines[i].length() > longestSentenceLineLength) {
                    longestSentenceLineLength = stringLines[i].length();
                }
                numSentences++;
            }
        }

        int maxDigits = Integer.toString(numSentences).length();

        for(int i = 0, lineCount = 1; i < lines.size(); i++) {
            Line line = lines.get(i);
            if(line.lineType == Line.Type.SENTENCE) {
                stringLines[i] += " ".repeat(longestSentenceLineLength - stringLines[i].length() + 2) + line.rule;
                stringLines[i] = String.format("%" + maxDigits + "d " + stringLines[i], lineCount++);
            } else {
                stringLines[i] = " ".repeat(maxDigits + 1) + "|" + "    |".repeat(lines.get(i).depth);
                stringLines[i] += "-".repeat(longestSentenceLineLength - stringLines[i].length() + 3);
            }

        }

        return List.of(stringLines);
    }

    public List<Sentence> getPremises() {
        return List.copyOf(premises);
    }

    private List<Sentence> getSentencesFromLineNums(List<Integer> sentenceLineNums) {
        List<Sentence> conclusions = new ArrayList<>();
        List<Sentence> orderedConclusions = getOrderedSentences();

        for(int lineNum : sentenceLineNums) {
            conclusions.add(orderedConclusions.get(lineNum));
        }

        return conclusions;
    }

    private List<Sentence> getOrderedSentences() {
        List<Sentence> orderedConclusions = new ArrayList<>(premises);
        children.forEach(child -> {
            if(child instanceof Proof childProof) {
                orderedConclusions.addAll(childProof.getOrderedSentences());
            } else if(child instanceof Conclusion childConclusion) {
                orderedConclusions.add(childConclusion.getSentence());
            }
        });
        return orderedConclusions;
    }

    private int[] getNextGraphPosition() {
        return ArrayUtils.add(getGraphPosition(), children.size());
    }

    private static class Line {
        private final int depth;
        private final String sentence;
        private final String rule;
        private final Type lineType;

        // Conclusion line:
        private Line(int depth, String sentence, String rule) {
            lineType = Type.SENTENCE;
            this.depth = depth;
            this.sentence = sentence;
            this.rule = rule;
        }

        // Premise end line:
        private Line(int depth) {
            lineType = Type.PREMISE_END;
            this.depth = depth;
            this.sentence = null;
            this.rule = null;
        }

        private enum Type {
            SENTENCE,
            PREMISE_END
        }
    }
}

package sage.java.proof;

import org.apache.commons.lang3.ArrayUtils;
import sage.java.nodes.base.Node;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

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

    public List<String> getLines() {
        List<String> lines = new ArrayList<>();

        int lastLineLength = 0;

        for(var premise : premises) {
            lines.add("| " + premise.sentenceString);
            lastLineLength = lines.get(lines.size() - 1).length();
        }

        lines.add("|" + "-".repeat(lastLineLength + 1));

        for(var child : children) {
            if(child instanceof Conclusion childConclusion) {
                lines.add("| " + childConclusion.getSentence().sentenceString);
            } else if(child instanceof Proof childProof) {
                var childLines = childProof.getLines().stream().map(line -> "|    " + line).collect(Collectors.toList());
                lines.addAll(childLines);
            }
        }

        return lines;
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
}

package sage.java.nodes.base;

import sage.java.graph.GraphInputs;
import sage.java.nodes.variables.BOOLEAN_VAR;

import java.util.*;
import java.util.stream.Collectors;

public abstract class Node {
    private String tag;
    private final Node[] children;

    public Node(Node... children) {
        this("", children);
    }

    public Node(String tag, Node... children) {
        for(var obj : children) {
            Objects.requireNonNull(obj);
        }

        this.tag = tag;
        this.children = children;
    }

    public final void setTag(String tag) {
        this.tag = tag == null ? "" : tag;
    }

    public String getTag() {
        return tag;
    }

    public final Node[] getChildren() {
        return children.clone();
    }

    public final boolean evaluate(GraphInputs inputs) {
        return _evaluate(children, inputs);
    }

    public final Boolean[] evaluate(GraphInputs[] inputs) {
        return Arrays.stream(inputs).map(this::evaluate).toArray(Boolean[]::new);
    }

    public final Map<Node, Boolean[]> evaluateEach(GraphInputs[] inputs) {
        Map<Node, Boolean[]> truthMap = new LinkedHashMap<>();

        for(var child : getChildren()) {
            truthMap.putAll(child.evaluateEach(inputs));
        }
        truthMap.put(this, evaluate(inputs));

        return truthMap;
    }

    protected abstract boolean _evaluate(Node[] children, GraphInputs inputs);

    public String[] variables() {
        if(this instanceof BOOLEAN_VAR) {
            return new String[] { tag };
        }

        Set<String> inputs = new HashSet<>();

        for(Node nextNode : getChildren()) {
            if(nextNode instanceof BOOLEAN_VAR var) {
                inputs.add(var.getTag());
            } else {
                inputs.addAll(Set.of(nextNode.variables()));
            }
        }

        return inputs.toArray(new String[0]);
    }

    public String generateBooleanTruthTable() {
        return generateBooleanTruthTable(true);
    }

    public String generateBooleanTruthTable(boolean mainConnectiveOnly) {
        String[] variables = variables();
        int numRows = variables.length == 0 ? 0 : (int)Math.pow(2, variables.length);
        GraphInputs[] inputs = new GraphInputs[numRows];

        // Generating all possible inputs
        for(int currInput = 0; currInput < numRows; currInput++) {
            var variableInputs = new GraphInputs.BooleanVariableMap();
            for(int varIdx = 0; varIdx < variables.length; varIdx++) {
                variableInputs.put(variables[varIdx], ((1 << varIdx) & currInput) > 0);
            }
            inputs[currInput] = new GraphInputs().setBooleanVariableMap(variableInputs);
        }

        // Obtaining truth map which will be used for generating the truth table
        Map<Node, Boolean[]> truthMap;
        if(mainConnectiveOnly) {
            truthMap = new LinkedHashMap<>();
            truthMap.put(this, evaluate(inputs));
        } else {
            truthMap = evaluateEach(inputs);
        }
        Node[] nodeArray = truthMap.keySet().stream()
                .filter(node -> !(node instanceof BOOLEAN_VAR))
                .toArray(Node[]::new);

        // --- All code following this comment is for generating the truth table string ---
        List<List<String>> truthTableStringMatrix = new ArrayList<>();
        truthTableStringMatrix.add(new ArrayList<>(Arrays.asList(variables)));
        truthTableStringMatrix.get(0).addAll(Arrays.stream(nodeArray).map(node -> node.tag).toList());

        for(int row = 0; row < numRows; row++) {
            truthTableStringMatrix.add(new ArrayList<>());
            var currRow = truthTableStringMatrix.get(row + 1);

            for(String var : variables) {
                assert inputs[row].getBooleanVariableMap().isPresent(); // Probably shouldn't be an assertion but whatevs
                currRow.add(inputs[row].getBooleanVariableMap().get().get(var) ? "1" : "0");
            }

            for(Node node : nodeArray) {
                currRow.add(truthMap.get(node)[row] ? "1" : "0");
            }
        }

        List<String> headerStringList = truthTableStringMatrix.get(0);
        String header = String.join(" | ", headerStringList);

        var stringTableBuilder = new StringBuilder()
                .append(header)
                .append("\n")
                .append(headerStringList.stream()
                        .map(colLabel -> "-".repeat(colLabel.length()))
                        .collect(Collectors.joining("-|-")))
                .append("\n");
        for(int rowIdx = 1; rowIdx < truthTableStringMatrix.size(); rowIdx++) {
            var headerRow = truthTableStringMatrix.get(0);
            var row = truthTableStringMatrix.get(rowIdx);
            List<String> rowStringList = new ArrayList<>();

            for(int colIdx = 0; colIdx < row.size(); colIdx++) {
                String entry = row.get(colIdx);
                int rowEntryLength = entry.length();
                int headerEntryLength = headerRow.get(colIdx).length();
                rowStringList.add(entry + " ".repeat(Math.max(0, headerEntryLength - rowEntryLength)));
            }

            stringTableBuilder
                    .append(String.join(" | ", rowStringList))
                    .append("\n");
        }

        return stringTableBuilder.toString();
    }

    @Override
    public String toString() {
        return tag;
    }
}

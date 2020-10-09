package sage.java.nodes.base;

import sage.java.graph.GraphInputs;
import sage.java.nodes.variables.BOOLEAN_VAR;

import java.util.*;
import java.util.stream.Collectors;

public abstract class Node {
    public final String tag;
    private final Node[] parents;

    public Node(Node... parents) {
        this("", parents);
    }

    public Node(String tag, Node... parents) {
        for(var obj : parents) {
            Objects.requireNonNull(obj);
        }

        this.tag = tag;
        this.parents = parents;
    }

    public final Node[] getParents() {
        return parents.clone();
    }

    public final boolean evaluate(GraphInputs inputs) {
        return _evaluate(parents, inputs);
    }

    protected abstract boolean _evaluate(Node[] parents, GraphInputs inputs);

    public String getTag() {
        return tag;
    }

    public String[] variables() {
        Set<String> inputs = new HashSet<>();

        for(Node nextNode : getParents()) {
            if(nextNode instanceof BOOLEAN_VAR var) {
                inputs.add(var.tag);
            } else {
                inputs.addAll(Set.of(nextNode.variables()));
            }
        }

        return inputs.toArray(new String[0]);
    }

    public String generateBooleanTruthTable() {
        String[] variables = variables();
        double numPermutations = variables.length == 0 ? 0 : Math.pow(2, variables.length);

        var truthTableString = new StringBuilder();
        truthTableString
                .append(String.join(" | ", List.of(variables)))
                .append(" | ")
                .append(tag)
                .append("\n")
                .append(Arrays.stream(variables)
                        .map(var -> "-".repeat(var.length()))
                        .collect(Collectors.joining("-|-")))
                .append("-|-")
                .append("-".repeat(tag.length()))
                .append("\n");

        for(short currPermutation = 0; currPermutation < numPermutations; currPermutation++) {
            // Setting up GraphInputs and evaluating graph:
            var variableInputs = new GraphInputs.BooleanVariableMap();
            for(short varIdx = 0; varIdx < variables.length; varIdx++) {
                variableInputs.put(variables[varIdx], ((1 << varIdx) & currPermutation) > 0);
            }

            boolean result = evaluate(new GraphInputs().setBooleanVariableMap(variableInputs));

            // Generating string for this row of the truth table:
            var currPermutationString = new StringBuilder(Integer.toString(currPermutation, 2));
            currPermutationString
                    .insert(0, "0".repeat(Math.max(0, variables.length - currPermutationString.length())));

            var bitsCharList = currPermutationString.reverse().toString().split("");
            for(int i = 0; i < bitsCharList.length; i++) {
                truthTableString
                        .append(bitsCharList[i])
                        .append(" ".repeat(variables[i].length() - 1))
                        .append(" | ");
            }

            truthTableString
                    .append(result)
                    .append("\n");
        }

        return truthTableString.toString();
    }

    @Override
    public String toString() {
        return tag;
    }
}

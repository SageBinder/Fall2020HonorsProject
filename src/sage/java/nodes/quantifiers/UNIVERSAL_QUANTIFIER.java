package sage.java.nodes.quantifiers;

import sage.java.exceptions.InvalidInputException;
import sage.java.graph.GraphInputs;
import sage.java.nodes.base.Node;
import sage.java.nodes.base.Node1;

public class UNIVERSAL_QUANTIFIER extends Node1 {
    private final String bindingVariable;

    public UNIVERSAL_QUANTIFIER(String tag, String bindingVariable, Node node) {
        super(tag, node);
        this.bindingVariable = bindingVariable;
    }

    @Override
    protected boolean _evaluate(Node parent, GraphInputs inputs) {
        var UD = inputs.getUD().orElseThrow(() ->
                new InvalidInputException("Error: EXISTENTIAL_QUANTIFIER node could not find any universe of discourse"));

        GraphInputs.BoundedVariableMap currentMap = inputs.getBoundedVariableMap().orElse(new GraphInputs.BoundedVariableMap());

        return UD.stream().allMatch(var -> {
            GraphInputs.BoundedVariableMap newMap = new GraphInputs.BoundedVariableMap(currentMap);
            newMap.put(bindingVariable, var);
            inputs.setBoundedVariableMap(newMap);

            return parent.evaluate(inputs);
        });
    }
}

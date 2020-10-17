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
    protected boolean _evaluate(Node child, GraphInputs inputs) {
        var UD = inputs.getUD().orElseThrow(() ->
                new InvalidInputException("Error: EXISTENTIAL_QUANTIFIER node could not find any universe of discourse"));
        var currentMap = inputs.getPredicateVariableMap().orElse(new GraphInputs.PredicateVariableMap());

        try {
            return UD.stream().allMatch(var -> {
                var newMap = new GraphInputs.PredicateVariableMap(currentMap);
                newMap.put(bindingVariable, var);
                inputs.setPredicateVariableMap(newMap);

                return child.evaluate(inputs);
            });
        } finally {
            inputs.setPredicateVariableMap(currentMap);
        }
    }
}

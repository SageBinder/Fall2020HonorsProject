package sage.java.nodes.variables;

import sage.java.exceptions.InvalidInputException;
import sage.java.graph.GraphInputs;
import sage.java.nodes.base.Node0;

import java.util.Map;

public class BOOLEAN_VAR extends Node0 {
    public BOOLEAN_VAR(String tag) {
        super(tag);
    }

    @Override
    protected boolean _evaluate(GraphInputs inputs) {
        var variableMapOptional = inputs.getBooleanVariableMap();

        if(variableMapOptional.isPresent()) {
            Map<String, Boolean> variableMap = variableMapOptional.get();
            if(variableMap.containsKey(getTag())) {
                return variableMap.get(getTag());
            } else {
                throw new InvalidInputException("Error: BOOLEAN_VAR node with the name of \""
                        + getTag()
                        + "\" could not find a matching input in the inputs map.");

            }
        } else {
            throw new InvalidInputException("Error: BOOLEAN_VAR node with the name of \""
                    + getTag()
                    + "\" could not find a variable map.");
        }
    }
}

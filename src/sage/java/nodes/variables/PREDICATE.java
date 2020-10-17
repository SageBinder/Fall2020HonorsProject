package sage.java.nodes.variables;

import sage.java.exceptions.InvalidInputException;
import sage.java.graph.GraphInputs;
import sage.java.nodes.base.Node0;

import java.util.List;

public class PREDICATE extends Node0 {
    private final List<String> inputVariables;
    private final String predicateName;

    public PREDICATE(String tag, String predicateName, List<String> inputVariables) {
        super(tag);
        this.predicateName = predicateName;
        this.inputVariables = inputVariables;
    }

    @Override
    protected boolean _evaluate(GraphInputs inputs) {
        var truthMap = inputs.getPredicateTruthMap().orElseThrow(() ->
                new InvalidInputException("Error: PREDICATE node could not find a predicate truth map."));

        if(truthMap.containsKey(predicateName)) {
            var truthEntries = truthMap.get(predicateName);
            var predicateVariableMapOptional = inputs.getPredicateVariableMap();
            if(predicateVariableMapOptional.isPresent()) {
                var predicateVariableMap = predicateVariableMapOptional.get();
                var mappedVariables = inputVariables.stream().map(var -> predicateVariableMap.getOrDefault(var, var));
                var thisEntry = new GraphInputs.PredicateTruthMap.TruthEntry(mappedVariables.toArray(String[]::new));

                return truthEntries.contains(thisEntry);
            } else {
                throw new InvalidInputException("Error: PREDICATE node \"" + predicateName + "\" could not find a predicate variable map");
            }
        } else {
            throw new InvalidInputException("Error: PREDICATE node \"" + predicateName + "\" could not find an associated truth-set entry in the predicate truth map.");
        }
    }
}

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
        var sentenceMap = inputs.getSentenceMap().orElseThrow(() ->
                new InvalidInputException("Error: PREDICATE node could not find a sentence variable map."));

        if(sentenceMap.containsKey(predicateName)) {
            var truthEntries = sentenceMap.get(predicateName);
            var boundedVariableMapOptional = inputs.getBoundedVariableMap();
            if(boundedVariableMapOptional.isPresent()) {
                var boundedVariableMap = boundedVariableMapOptional.get();
                var mappedVariables = inputVariables.stream().map(var -> boundedVariableMap.getOrDefault(var, var));
                var thisEntry = new GraphInputs.SentenceMap.TruthEntry(mappedVariables.toArray(String[]::new));

                return truthEntries.contains(thisEntry);
            } else {
                throw new InvalidInputException("Error: PREDICATE node could not find a bounded variable map");
            }
        } else {
            throw new InvalidInputException("Error: PREDICATE node could not find a truth-entry set within the sentence variable map");
        }
    }
}

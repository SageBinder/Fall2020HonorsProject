package sage.java.nodes.booleanoperators;

import sage.java.graph.GraphInputs;
import sage.java.nodes.base.Node;
import sage.java.nodes.base.Node2;

public class IF extends Node2 {
    public IF(Node antecedent, Node consequence) {
        this("", antecedent, consequence);
    }

    public IF(String tag, Node antecedent, Node consequent) {
        super(tag, antecedent, consequent);
    }

    @Override
    protected boolean _evaluate(Node antecedent, Node consequent, GraphInputs inputs) {
        return !antecedent.evaluate(inputs) || consequent.evaluate(inputs);
    }
}

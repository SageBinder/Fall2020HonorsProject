package sage.java.nodes.booleanoperators;

import sage.java.graph.GraphInputs;
import sage.java.nodes.base.Node;
import sage.java.nodes.base.Node2;

public class OR extends Node2 {
    public OR(Node parentNode1, Node parentNode2) {
        super(parentNode1, parentNode2);
    }

    public OR(String tag, Node parentNode1, Node parentNode2) {
        super(tag, parentNode1, parentNode2);
    }

    @Override
    protected boolean _evaluate(Node parent1, Node parent2, GraphInputs inputs) {
        return parent1.evaluate(inputs) | parent2.evaluate(inputs);
    }
}

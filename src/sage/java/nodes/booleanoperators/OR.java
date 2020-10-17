package sage.java.nodes.booleanoperators;

import sage.java.graph.GraphInputs;
import sage.java.nodes.base.Node;
import sage.java.nodes.base.Node2;

public class OR extends Node2 {
    public OR(Node child1, Node child2) {
        super(child1, child2);
    }

    public OR(String tag, Node child1, Node child2) {
        super(tag, child1, child2);
    }

    @Override
    protected boolean _evaluate(Node child1, Node child2, GraphInputs inputs) {
        return child1.evaluate(inputs) | child2.evaluate(inputs);
    }
}

package sage.java.nodes.booleanoperators;

import sage.java.graph.GraphInputs;
import sage.java.nodes.base.Node;
import sage.java.nodes.base.Node1;

public class NOT extends Node1 {
    public NOT(Node input) {
        super(input);
    }

    public NOT(String tag, Node input) {
        super(tag, input);
    }

    @Override
    protected boolean _evaluate(Node parent, GraphInputs inputs) {
        return !parent.evaluate(inputs);
    }
}

package sage.java.nodes.base;

import sage.java.graph.GraphInputs;

public abstract class Node0 extends Node {
    public Node0() {
        super();
    }

    public Node0(String tag) {
        super(tag);
    }

    @Override
    protected final boolean _evaluate(Node[] children, GraphInputs inputs) {
        return _evaluate(inputs);
    }

    protected abstract boolean _evaluate(GraphInputs inputs);
}

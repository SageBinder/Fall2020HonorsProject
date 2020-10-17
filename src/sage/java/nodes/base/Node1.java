package sage.java.nodes.base;

import sage.java.graph.GraphInputs;

public abstract class Node1 extends Node {
    public Node1(Node child) {
        super(child);
    }

    public Node1(String tag, Node child) {
        super(tag, child);
    }

    @Override
    protected final boolean _evaluate(Node[] children, GraphInputs inputs) {
        return _evaluate(children[0], inputs);
    }

    protected abstract boolean _evaluate(Node child, GraphInputs inputs);
}

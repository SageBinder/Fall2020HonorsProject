package sage.java.nodes.base;

import sage.java.graph.GraphInputs;

public abstract class Node2 extends Node {
    public Node2(Node child1, Node child2) {
        super(child1, child2);
    }

    public Node2(String tag, Node child1, Node child2) {
        super(tag, child1, child2);
    }

    @Override
    protected final boolean _evaluate(Node[] children, GraphInputs inputs) {
        return _evaluate(children[0], children[1], inputs);
    }

    protected abstract boolean _evaluate(Node child1, Node child2, GraphInputs inputs);
}

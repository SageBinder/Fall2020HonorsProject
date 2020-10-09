package sage.java.nodes.outputs;

import sage.java.graph.GraphInputs;
import sage.java.nodes.base.Node;
import sage.java.nodes.base.Node1;

public class OUTPUT extends Node1 {
    public OUTPUT(Node parent) {
        this("", parent);
    }

    public OUTPUT(String tag, Node parent) {
        super(tag, parent);
    }

    @Override
    public boolean _evaluate(Node parent, GraphInputs inputs) {
        return parent.evaluate(inputs);
    }
}

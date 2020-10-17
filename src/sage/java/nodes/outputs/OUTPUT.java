package sage.java.nodes.outputs;

import sage.java.graph.GraphInputs;
import sage.java.nodes.base.Node;
import sage.java.nodes.base.Node1;

public class OUTPUT extends Node1 {
    public OUTPUT(Node child) {
        this("", child);
    }

    public OUTPUT(String tag, Node child) {
        super(tag, child);
    }

    @Override
    public boolean _evaluate(Node child, GraphInputs inputs) {
        return child.evaluate(inputs);
    }
}

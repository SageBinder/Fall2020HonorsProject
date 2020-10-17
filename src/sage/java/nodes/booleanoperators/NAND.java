package sage.java.nodes.booleanoperators;

import sage.java.graph.GraphInputs;
import sage.java.nodes.base.Node;

public class NAND extends AND {
    public NAND(Node child1, Node child2) {
        super(child1, child2);
    }

    public NAND(String tag, Node child1, Node child2) {
        super(tag, child1, child2);
    }

    @Override
    protected boolean _evaluate(Node child1, Node child2, GraphInputs inputs) {
        return !super._evaluate(child1, child2, inputs);
    }
}

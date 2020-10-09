package sage.java.nodes.constants;

import sage.java.graph.GraphInputs;
import sage.java.nodes.base.Node0;

public class CONTRADICTION extends Node0 {
    public CONTRADICTION() {
        super();
    }

    public CONTRADICTION(String tag) {
        super(tag);
    }

    @Override
    protected boolean _evaluate(GraphInputs inputs) {
        return false;
    }
}

package sage.java.nodes.constants;

import sage.java.graph.GraphInputs;
import sage.java.nodes.base.Node0;

public class TAUTOLOGY extends Node0 {
    public TAUTOLOGY() {
        super();
    }

    public TAUTOLOGY(String tag) {
        super(tag);
    }

    @Override
    protected boolean _evaluate(GraphInputs inputs) {
        return true;
    }
}

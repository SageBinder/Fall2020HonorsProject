package sage.java.proof.operation;

import sage.java.nodes.base.Node;
import sage.java.proof.Sentence;

public abstract class LogicOperation {
    protected LogicOperation() {

    }

    public abstract Node doOperation(Sentence... inputSentences);
}

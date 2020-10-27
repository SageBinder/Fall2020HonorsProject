package sage.java.proof;

import sage.java.nodes.base.Node;

public final class Sentence {
    public final Node baseNode;
    public final String sentenceString;

    public Sentence(Node baseNode) {
        this.baseNode = baseNode;
        this.sentenceString = baseNode.tag;
    }
}

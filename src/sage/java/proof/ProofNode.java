package sage.java.proof;

import java.util.Arrays;

public abstract class ProofNode {
    private final int[] graphPosition;

    protected ProofNode(int[] graphPosition) {
        this.graphPosition = graphPosition;
    }

    public int[] getGraphPosition() {
        return Arrays.copyOf(graphPosition, graphPosition.length);
    }
}

package sage.java.proof;

import java.util.Arrays;

public abstract sealed class ProofNode permits Proof, Conclusion {
    private final int[] graphPosition;

    protected ProofNode(int[] graphPosition) {
        this.graphPosition = graphPosition;
    }

    public int[] getGraphPosition() {
        return Arrays.copyOf(graphPosition, graphPosition.length);
    }
}

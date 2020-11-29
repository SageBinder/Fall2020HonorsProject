package sage.java.proof;

public final class Conclusion extends ProofNode {
    private final Rule rule;
    private final Sentence sentence;

    public Conclusion(Sentence sentence, Rule rule, int[] graphPosition) {
        super(graphPosition);
        this.rule = rule;
        this.sentence = sentence;
    }

    public Sentence getSentence() {
        return sentence;
    }

    public Rule getRule() {
        return rule;
    }
}

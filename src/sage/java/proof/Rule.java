package sage.java.proof;

import sage.java.antlrparser.ProofParser;

public class Rule {
    public final RuleType type;

    public Rule(RuleType type) {
        this.type = type;
    }

    public static Rule from(ProofParser.LogicRuleContext ruleCtx) {
        return null; // TODO
    }
}

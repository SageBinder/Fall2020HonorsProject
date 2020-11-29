package sage.java.proof;

import sage.java.antlrparser.ProofParser;

import java.util.List;
import java.util.stream.Collectors;

public class Rule {
    public final RuleType type;
    private final List<Integer> lineNumbers;

    private final String ruleString;

    private Rule(RuleType type, List<Integer> lineNumbers, String ruleString) {
        this.type = type;
        this.lineNumbers = lineNumbers;
        this.ruleString = ruleString;
    }

    public static Rule fromRuleCtx(ProofParser.RuleExpressionContext ruleExpressionCtx) {
        var ruleType = RuleType.fromRuleCtx(ruleExpressionCtx);
        var lineNumbers = ruleExpressionCtx.lineNumbers.stream()
                .map(token -> Integer.parseInt(token.getText()))
                .collect(Collectors.toList());
        return new Rule(ruleType, lineNumbers, ruleExpressionCtx.getText());
    }

    @Override
    public String toString() {
        return ruleString;
    }
}

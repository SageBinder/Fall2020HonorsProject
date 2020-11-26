package sage.java.proof;

import sage.java.antlrparser.ProofParser;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Rule {
    public final RuleType type;
    private final List<Integer> lineNumbers;

    private Rule(RuleType type, List<Integer> lineNumbers) {
        this.type = type;
        this.lineNumbers = lineNumbers;
    }

    public static Rule fromRuleCtx(ProofParser.RuleExpressionContext ruleCtx) {
        var ruleType = RuleType.fromRuleCtx(ruleCtx);
        var lineNumbers = ruleCtx.lineNumbers.stream()
                .map(token -> Integer.parseInt(token.getText()))
                .collect(Collectors.toList());
        return new Rule(ruleType, lineNumbers);
    }
}

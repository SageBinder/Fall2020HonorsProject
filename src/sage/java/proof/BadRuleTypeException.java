package sage.java.proof;

import sage.java.antlrparser.ProofParser;

public class BadRuleTypeException extends RuntimeException {
    public BadRuleTypeException(ProofParser.RuleExpressionContext ctx) {
        super("Error: bad rule type \"" + ctx.ruleType().getText() + "\"");
    }
}

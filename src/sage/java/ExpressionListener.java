package sage.java;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;
import sage.java.antlrparser.ExpressionParser;
import sage.java.antlrparser.ExpressionParserBaseListener;
import sage.java.nodes.base.Node;
import sage.java.nodes.booleanoperators.*;
import sage.java.nodes.quantifiers.EXISTENTIAL_QUANTIFIER;
import sage.java.nodes.quantifiers.UNIVERSAL_QUANTIFIER;
import sage.java.nodes.variables.PREDICATE;
import sage.java.nodes.variables.BOOLEAN_VAR;

import java.util.stream.Collectors;

public class ExpressionListener extends ExpressionParserBaseListener {
    private ExpressionParser parser;

    public ExpressionListener(ExpressionParser parser) {
        this.parser = parser;
    }

    @Override
    public void exitBracketedExpression(ExpressionParser.BracketedExpressionContext ctx) {
        ctx.node = ctx.exp.node;
    }

    @Override
    public void exitBinaryOpExpression(ExpressionParser.BinaryOpExpressionContext ctx) {
        var parent1 = ctx.exp1.node;
        var parent2 = ctx.exp2.node;
        var tag = ctx.getText();

        if(ctx.op instanceof ExpressionParser.ANDContext) {
            ctx.node = new AND(tag, parent1, parent2);
        } else if(ctx.op instanceof ExpressionParser.NANDContext) {
            ctx.node = new NAND(tag, parent1, parent2);
        } else if(ctx.op instanceof ExpressionParser.ORContext) {
            ctx.node = new OR(tag, parent1, parent2);
        } else if(ctx.op instanceof ExpressionParser.IFContext) {
            ctx.node = new IF(tag, parent1, parent2);
        } else if(ctx.op instanceof ExpressionParser.IFFContext) {
            ctx.node = new IFF(tag, parent1, parent2);
        }
    }

    @Override
    public void exitRightOpExpression(ExpressionParser.RightOpExpressionContext ctx) {
        var parent = ctx.exp.node;
        var tag = ctx.getText();

        if(ctx.op instanceof ExpressionParser.NOTContext) {
            ctx.node = new NOT(tag, parent);
        } else if(ctx.op instanceof ExpressionParser.QUANTIFIERContext quantCtx) {
            var quantType = quantCtx.quantExpression.quantToken.getType();
            var variables = quantCtx.quantExpression.variables;

            if(variables.isEmpty()) {
                return;
            }

            interface QuantifierNodeSupplier {
                Node get(String tag, String bindingVariable, Node parent);
            }

            QuantifierNodeSupplier supplier;
            switch(quantType) {
                case ExpressionParser.U_QUANT -> supplier = UNIVERSAL_QUANTIFIER::new;
                case ExpressionParser.E_QUANT -> supplier = EXISTENTIAL_QUANTIFIER::new;
                default -> {
                    return;
                }
            }

            var lastParent = parent;
            for(Token var : variables) {
                lastParent = supplier.get(tag, var.getText(), lastParent);
            }
            ctx.node = lastParent;
        }
    }

    @Override
    public void exitBoolVarExpresion(ExpressionParser.BoolVarExpresionContext ctx) {
        ctx.node = new BOOLEAN_VAR(ctx.getText());
    }

    @Override
    public void exitPredicateExpression(ExpressionParser.PredicateExpressionContext ctx) {
        ctx.node = new PREDICATE(ctx.getText(),
                ctx.predicate().predicateName.getText(),
                ctx.predicate().predicateVars.stream().map(Token::getText).collect(Collectors.toList()));
    }
}

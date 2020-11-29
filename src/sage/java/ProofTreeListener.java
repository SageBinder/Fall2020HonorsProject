package sage.java;

import org.antlr.v4.runtime.Token;
import sage.java.antlrparser.ProofParser;
import sage.java.antlrparser.ProofParserBaseListener;
import sage.java.nodes.base.Node;
import sage.java.nodes.booleanoperators.*;
import sage.java.nodes.quantifiers.EXISTENTIAL_QUANTIFIER;
import sage.java.nodes.quantifiers.UNIVERSAL_QUANTIFIER;
import sage.java.nodes.variables.BOOLEAN_VAR;
import sage.java.nodes.variables.PREDICATE;
import sage.java.proof.Proof;
import sage.java.proof.Rule;

import java.util.Stack;
import java.util.stream.Collectors;

public class ProofTreeListener extends ProofParserBaseListener {
    private final Stack<Proof> proofStack = new Stack<>();

    // --- SENTENCE PARSING --- \\
    @Override
    public void exitBracketedExpression(ProofParser.BracketedExpressionContext ctx) {
        ctx.node = ctx.sentence().node;
        ctx.node.setTag("(" + ctx.node.getTag() + ")");
    }

    @Override
    public void exitBinaryOpExpression(ProofParser.BinaryOpExpressionContext ctx) {
        var child1 = ctx.sentence1.node;
        var child2 = ctx.sentence2.node;
        var tag = child1.getTag() + " " + ctx.binaryOp().getText() + " " + child2.getTag();

        if(ctx.binaryOp() instanceof ProofParser.ANDContext) {
            ctx.node = new AND(tag, child1, child2);
        } else if(ctx.binaryOp() instanceof ProofParser.NANDContext) {
            ctx.node = new NAND(tag, child1, child2);
        } else if(ctx.binaryOp() instanceof ProofParser.ORContext) {
            ctx.node = new OR(tag, child1, child2);
        } else if(ctx.binaryOp() instanceof ProofParser.IFContext) {
            ctx.node = new IF(tag, child1, child2);
        } else if(ctx.binaryOp() instanceof ProofParser.IFFContext) {
            ctx.node = new IFF(tag, child1, child2);
        }
    }

    @Override
    public void exitRightOpExpression(ProofParser.RightOpExpressionContext ctx) {
        var child = ctx.sentence().node;
        var tag = ctx.rightOp().getText() + child.getTag();

        if(ctx.rightOp() instanceof ProofParser.NOTContext) {
            ctx.node = new NOT(tag, child);
        } else if(ctx.rightOp() instanceof ProofParser.QUANTIFIERContext quantCtx) {
            var quantType = quantCtx.quantExpression.quantToken.getType();
            var variables = quantCtx.quantExpression.variables;

            if(variables.isEmpty()) {
                return;
            }

            interface QuantifierNodeSupplier {
                Node get(String tag, String bindingVariable, Node child);
            }

            QuantifierNodeSupplier supplier;
            switch(quantType) {
                case ProofParser.U_QUANT -> supplier = UNIVERSAL_QUANTIFIER::new;
                case ProofParser.E_QUANT -> supplier = EXISTENTIAL_QUANTIFIER::new;
                default -> {
                    return;
                }
            }

            var lastChild = child;
            for(Token var : variables) {
                lastChild = supplier.get(tag, var.getText(), lastChild);
            }
            ctx.node = lastChild;
        }
    }

    @Override
    public void exitBoolVarExpression(ProofParser.BoolVarExpressionContext ctx) {
        ctx.node = new BOOLEAN_VAR(ctx.getText());
    }

    @Override
    public void exitPredicateExpression(ProofParser.PredicateExpressionContext ctx) {
        ctx.node = new PREDICATE(ctx.getText(),
                ctx.predicate().predicateName.getText(),
                ctx.predicate().predicateVars.stream().map(Token::getText).collect(Collectors.toList()));
    }

    // --- PROOF PARSING --- \\
    @Override
    public void enterProofConstruct(ProofParser.ProofConstructContext ctx) {
        if(proofStack.isEmpty()) {
            proofStack.push(new Proof());
        } else {
            proofStack.push(proofStack.peek().addChildProof());
        }

    }

    @Override
    public void exitProofConstruct(ProofParser.ProofConstructContext ctx) {
        ctx.proofNode = proofStack.pop();
    }

    @Override
    public void exitConclusion(ProofParser.ConclusionContext ctx) {
        proofStack.peek().addConclusion(ctx.sentence().node, Rule.fromRuleCtx(ctx.ruleExpression()));
    }

    @Override
    public void exitPremise(ProofParser.PremiseContext ctx) {
        proofStack.peek().addPremise(ctx.sentence().node);
    }
}

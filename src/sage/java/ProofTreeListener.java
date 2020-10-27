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
    private ProofParser parser;

    private Stack<Proof> proofStack = new Stack<>();

    public ProofTreeListener(ProofParser parser) {
        this.parser = parser;
    }

    // --- SENTENCE PARSING --- \\
    @Override
    public void exitBracketedExpression(ProofParser.BracketedExpressionContext ctx) {
        ctx.node = ctx.exp.node;
    }

    @Override
    public void exitBinaryOpExpression(ProofParser.BinaryOpExpressionContext ctx) {
        var parent1 = ctx.exp1.node;
        var parent2 = ctx.exp2.node;
        var tag = ctx.getText();

        if(ctx.op instanceof ProofParser.ANDContext) {
            ctx.node = new AND(tag, parent1, parent2);
        } else if(ctx.op instanceof ProofParser.NANDContext) {
            ctx.node = new NAND(tag, parent1, parent2);
        } else if(ctx.op instanceof ProofParser.ORContext) {
            ctx.node = new OR(tag, parent1, parent2);
        } else if(ctx.op instanceof ProofParser.IFContext) {
            ctx.node = new IF(tag, parent1, parent2);
        } else if(ctx.op instanceof ProofParser.IFFContext) {
            ctx.node = new IFF(tag, parent1, parent2);
        }
    }

    @Override
    public void exitRightOpExpression(ProofParser.RightOpExpressionContext ctx) {
        var parent = ctx.exp.node;
        var tag = ctx.getText();

        if(ctx.op instanceof ProofParser.NOTContext) {
            ctx.node = new NOT(tag, parent);
        } else if(ctx.op instanceof ProofParser.QUANTIFIERContext quantCtx) {
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
                case ProofParser.U_QUANT -> supplier = UNIVERSAL_QUANTIFIER::new;
                case ProofParser.E_QUANT -> supplier = EXISTENTIAL_QUANTIFIER::new;
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
    public void exitBoolVarExpresion(ProofParser.BoolVarExpresionContext ctx) {
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
        proofStack.peek().addConclusion(ctx.sentence().node, Rule.from(ctx.logicRule()));
    }

    @Override
    public void exitPremise(ProofParser.PremiseContext ctx) {
        proofStack.peek().addPremise(ctx.sentence().node);
    }
}

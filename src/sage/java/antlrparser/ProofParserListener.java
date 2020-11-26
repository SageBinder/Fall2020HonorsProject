// Generated from C:/Users/Sage/IdeaProjects/Fall2020HonorsProject/src/sage/grammars\ProofParser.g4 by ANTLR 4.8
package sage.java.antlrparser;

import sage.java.nodes.base.Node;
import sage.java.proof.Proof;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ProofParser}.
 */
public interface ProofParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ProofParser#lbracket}.
	 * @param ctx the parse tree
	 */
	void enterLbracket(ProofParser.LbracketContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProofParser#lbracket}.
	 * @param ctx the parse tree
	 */
	void exitLbracket(ProofParser.LbracketContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProofParser#rbracket}.
	 * @param ctx the parse tree
	 */
	void enterRbracket(ProofParser.RbracketContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProofParser#rbracket}.
	 * @param ctx the parse tree
	 */
	void exitRbracket(ProofParser.RbracketContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AND}
	 * labeled alternative in {@link ProofParser#binaryOp}.
	 * @param ctx the parse tree
	 */
	void enterAND(ProofParser.ANDContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AND}
	 * labeled alternative in {@link ProofParser#binaryOp}.
	 * @param ctx the parse tree
	 */
	void exitAND(ProofParser.ANDContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NAND}
	 * labeled alternative in {@link ProofParser#binaryOp}.
	 * @param ctx the parse tree
	 */
	void enterNAND(ProofParser.NANDContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NAND}
	 * labeled alternative in {@link ProofParser#binaryOp}.
	 * @param ctx the parse tree
	 */
	void exitNAND(ProofParser.NANDContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OR}
	 * labeled alternative in {@link ProofParser#binaryOp}.
	 * @param ctx the parse tree
	 */
	void enterOR(ProofParser.ORContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OR}
	 * labeled alternative in {@link ProofParser#binaryOp}.
	 * @param ctx the parse tree
	 */
	void exitOR(ProofParser.ORContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IF}
	 * labeled alternative in {@link ProofParser#binaryOp}.
	 * @param ctx the parse tree
	 */
	void enterIF(ProofParser.IFContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IF}
	 * labeled alternative in {@link ProofParser#binaryOp}.
	 * @param ctx the parse tree
	 */
	void exitIF(ProofParser.IFContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IFF}
	 * labeled alternative in {@link ProofParser#binaryOp}.
	 * @param ctx the parse tree
	 */
	void enterIFF(ProofParser.IFFContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IFF}
	 * labeled alternative in {@link ProofParser#binaryOp}.
	 * @param ctx the parse tree
	 */
	void exitIFF(ProofParser.IFFContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NOT}
	 * labeled alternative in {@link ProofParser#rightOp}.
	 * @param ctx the parse tree
	 */
	void enterNOT(ProofParser.NOTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NOT}
	 * labeled alternative in {@link ProofParser#rightOp}.
	 * @param ctx the parse tree
	 */
	void exitNOT(ProofParser.NOTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code QUANTIFIER}
	 * labeled alternative in {@link ProofParser#rightOp}.
	 * @param ctx the parse tree
	 */
	void enterQUANTIFIER(ProofParser.QUANTIFIERContext ctx);
	/**
	 * Exit a parse tree produced by the {@code QUANTIFIER}
	 * labeled alternative in {@link ProofParser#rightOp}.
	 * @param ctx the parse tree
	 */
	void exitQUANTIFIER(ProofParser.QUANTIFIERContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProofParser#quant}.
	 * @param ctx the parse tree
	 */
	void enterQuant(ProofParser.QuantContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProofParser#quant}.
	 * @param ctx the parse tree
	 */
	void exitQuant(ProofParser.QuantContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProofParser#boolVar}.
	 * @param ctx the parse tree
	 */
	void enterBoolVar(ProofParser.BoolVarContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProofParser#boolVar}.
	 * @param ctx the parse tree
	 */
	void exitBoolVar(ProofParser.BoolVarContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProofParser#predicate}.
	 * @param ctx the parse tree
	 */
	void enterPredicate(ProofParser.PredicateContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProofParser#predicate}.
	 * @param ctx the parse tree
	 */
	void exitPredicate(ProofParser.PredicateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BinaryOpExpression}
	 * labeled alternative in {@link ProofParser#sentence}.
	 * @param ctx the parse tree
	 */
	void enterBinaryOpExpression(ProofParser.BinaryOpExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BinaryOpExpression}
	 * labeled alternative in {@link ProofParser#sentence}.
	 * @param ctx the parse tree
	 */
	void exitBinaryOpExpression(ProofParser.BinaryOpExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BracketedExpression}
	 * labeled alternative in {@link ProofParser#sentence}.
	 * @param ctx the parse tree
	 */
	void enterBracketedExpression(ProofParser.BracketedExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BracketedExpression}
	 * labeled alternative in {@link ProofParser#sentence}.
	 * @param ctx the parse tree
	 */
	void exitBracketedExpression(ProofParser.BracketedExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BoolVarExpresion}
	 * labeled alternative in {@link ProofParser#sentence}.
	 * @param ctx the parse tree
	 */
	void enterBoolVarExpresion(ProofParser.BoolVarExpresionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BoolVarExpresion}
	 * labeled alternative in {@link ProofParser#sentence}.
	 * @param ctx the parse tree
	 */
	void exitBoolVarExpresion(ProofParser.BoolVarExpresionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PredicateExpression}
	 * labeled alternative in {@link ProofParser#sentence}.
	 * @param ctx the parse tree
	 */
	void enterPredicateExpression(ProofParser.PredicateExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PredicateExpression}
	 * labeled alternative in {@link ProofParser#sentence}.
	 * @param ctx the parse tree
	 */
	void exitPredicateExpression(ProofParser.PredicateExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code RightOpExpression}
	 * labeled alternative in {@link ProofParser#sentence}.
	 * @param ctx the parse tree
	 */
	void enterRightOpExpression(ProofParser.RightOpExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RightOpExpression}
	 * labeled alternative in {@link ProofParser#sentence}.
	 * @param ctx the parse tree
	 */
	void exitRightOpExpression(ProofParser.RightOpExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProofParser#ruleType}.
	 * @param ctx the parse tree
	 */
	void enterRuleType(ProofParser.RuleTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProofParser#ruleType}.
	 * @param ctx the parse tree
	 */
	void exitRuleType(ProofParser.RuleTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProofParser#ruleExpression}.
	 * @param ctx the parse tree
	 */
	void enterRuleExpression(ProofParser.RuleExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProofParser#ruleExpression}.
	 * @param ctx the parse tree
	 */
	void exitRuleExpression(ProofParser.RuleExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProofParser#premise}.
	 * @param ctx the parse tree
	 */
	void enterPremise(ProofParser.PremiseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProofParser#premise}.
	 * @param ctx the parse tree
	 */
	void exitPremise(ProofParser.PremiseContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProofParser#conclusion}.
	 * @param ctx the parse tree
	 */
	void enterConclusion(ProofParser.ConclusionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProofParser#conclusion}.
	 * @param ctx the parse tree
	 */
	void exitConclusion(ProofParser.ConclusionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProofParser#proofConstruct}.
	 * @param ctx the parse tree
	 */
	void enterProofConstruct(ProofParser.ProofConstructContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProofParser#proofConstruct}.
	 * @param ctx the parse tree
	 */
	void exitProofConstruct(ProofParser.ProofConstructContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProofParser#assumption}.
	 * @param ctx the parse tree
	 */
	void enterAssumption(ProofParser.AssumptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProofParser#assumption}.
	 * @param ctx the parse tree
	 */
	void exitAssumption(ProofParser.AssumptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProofParser#proof}.
	 * @param ctx the parse tree
	 */
	void enterProof(ProofParser.ProofContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProofParser#proof}.
	 * @param ctx the parse tree
	 */
	void exitProof(ProofParser.ProofContext ctx);
}
// Generated from C:/Users/Sage/IdeaProjects/Fall2020HonorsProject/src/sage/grammars\ProofParser.g4 by ANTLR 4.8
package sage.java.antlrparser;

import sage.java.nodes.base.Node;
import sage.java.proof.Proof;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ProofParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ProofParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ProofParser#lbracket}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLbracket(ProofParser.LbracketContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProofParser#rbracket}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRbracket(ProofParser.RbracketContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AND}
	 * labeled alternative in {@link ProofParser#binaryOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAND(ProofParser.ANDContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NAND}
	 * labeled alternative in {@link ProofParser#binaryOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNAND(ProofParser.NANDContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OR}
	 * labeled alternative in {@link ProofParser#binaryOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOR(ProofParser.ORContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IF}
	 * labeled alternative in {@link ProofParser#binaryOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIF(ProofParser.IFContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IFF}
	 * labeled alternative in {@link ProofParser#binaryOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIFF(ProofParser.IFFContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NOT}
	 * labeled alternative in {@link ProofParser#rightOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNOT(ProofParser.NOTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code QUANTIFIER}
	 * labeled alternative in {@link ProofParser#rightOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQUANTIFIER(ProofParser.QUANTIFIERContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProofParser#quant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuant(ProofParser.QuantContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProofParser#boolVar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolVar(ProofParser.BoolVarContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProofParser#predicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPredicate(ProofParser.PredicateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BinaryOpExpression}
	 * labeled alternative in {@link ProofParser#sentence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinaryOpExpression(ProofParser.BinaryOpExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BracketedExpression}
	 * labeled alternative in {@link ProofParser#sentence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBracketedExpression(ProofParser.BracketedExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BoolVarExpresion}
	 * labeled alternative in {@link ProofParser#sentence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolVarExpresion(ProofParser.BoolVarExpresionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PredicateExpression}
	 * labeled alternative in {@link ProofParser#sentence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPredicateExpression(ProofParser.PredicateExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code RightOpExpression}
	 * labeled alternative in {@link ProofParser#sentence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRightOpExpression(ProofParser.RightOpExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProofParser#ruleType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRuleType(ProofParser.RuleTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProofParser#ruleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRuleExpression(ProofParser.RuleExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProofParser#premise}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPremise(ProofParser.PremiseContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProofParser#conclusion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConclusion(ProofParser.ConclusionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProofParser#proofConstruct}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProofConstruct(ProofParser.ProofConstructContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProofParser#assumption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssumption(ProofParser.AssumptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProofParser#proof}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProof(ProofParser.ProofContext ctx);
}
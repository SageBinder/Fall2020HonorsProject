// Generated from C:/Users/Sage/IdeaProjects/Fall2020HonorsProject/src/sage/grammars\ExpressionParser.g4 by ANTLR 4.8
package sage.java.antlrparser;

import sage.java.nodes.base.Node;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ExpressionParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ExpressionParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by the {@code AND}
	 * labeled alternative in {@link ExpressionParser#binaryOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAND(ExpressionParser.ANDContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NAND}
	 * labeled alternative in {@link ExpressionParser#binaryOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNAND(ExpressionParser.NANDContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OR}
	 * labeled alternative in {@link ExpressionParser#binaryOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOR(ExpressionParser.ORContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IF}
	 * labeled alternative in {@link ExpressionParser#binaryOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIF(ExpressionParser.IFContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IFF}
	 * labeled alternative in {@link ExpressionParser#binaryOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIFF(ExpressionParser.IFFContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NOT}
	 * labeled alternative in {@link ExpressionParser#rightOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNOT(ExpressionParser.NOTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code QUANTIFIER}
	 * labeled alternative in {@link ExpressionParser#rightOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQUANTIFIER(ExpressionParser.QUANTIFIERContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpressionParser#quant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuant(ExpressionParser.QuantContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpressionParser#boolVar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolVar(ExpressionParser.BoolVarContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpressionParser#predicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPredicate(ExpressionParser.PredicateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BinaryOpExpression}
	 * labeled alternative in {@link ExpressionParser#e}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinaryOpExpression(ExpressionParser.BinaryOpExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BracketedExpression}
	 * labeled alternative in {@link ExpressionParser#e}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBracketedExpression(ExpressionParser.BracketedExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BoolVarExpresion}
	 * labeled alternative in {@link ExpressionParser#e}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolVarExpresion(ExpressionParser.BoolVarExpresionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PredicateExpression}
	 * labeled alternative in {@link ExpressionParser#e}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPredicateExpression(ExpressionParser.PredicateExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code RightOpExpression}
	 * labeled alternative in {@link ExpressionParser#e}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRightOpExpression(ExpressionParser.RightOpExpressionContext ctx);
}
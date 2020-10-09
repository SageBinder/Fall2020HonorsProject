// Generated from C:/Users/Sage/IdeaProjects/Fall2020HonorsProject/src/sage/grammars\ExpressionParser.g4 by ANTLR 4.8
package sage.java.antlrparser;

import sage.java.nodes.base.Node;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ExpressionParser}.
 */
public interface ExpressionParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code AND}
	 * labeled alternative in {@link ExpressionParser#binaryOp}.
	 * @param ctx the parse tree
	 */
	void enterAND(ExpressionParser.ANDContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AND}
	 * labeled alternative in {@link ExpressionParser#binaryOp}.
	 * @param ctx the parse tree
	 */
	void exitAND(ExpressionParser.ANDContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NAND}
	 * labeled alternative in {@link ExpressionParser#binaryOp}.
	 * @param ctx the parse tree
	 */
	void enterNAND(ExpressionParser.NANDContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NAND}
	 * labeled alternative in {@link ExpressionParser#binaryOp}.
	 * @param ctx the parse tree
	 */
	void exitNAND(ExpressionParser.NANDContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OR}
	 * labeled alternative in {@link ExpressionParser#binaryOp}.
	 * @param ctx the parse tree
	 */
	void enterOR(ExpressionParser.ORContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OR}
	 * labeled alternative in {@link ExpressionParser#binaryOp}.
	 * @param ctx the parse tree
	 */
	void exitOR(ExpressionParser.ORContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IF}
	 * labeled alternative in {@link ExpressionParser#binaryOp}.
	 * @param ctx the parse tree
	 */
	void enterIF(ExpressionParser.IFContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IF}
	 * labeled alternative in {@link ExpressionParser#binaryOp}.
	 * @param ctx the parse tree
	 */
	void exitIF(ExpressionParser.IFContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IFF}
	 * labeled alternative in {@link ExpressionParser#binaryOp}.
	 * @param ctx the parse tree
	 */
	void enterIFF(ExpressionParser.IFFContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IFF}
	 * labeled alternative in {@link ExpressionParser#binaryOp}.
	 * @param ctx the parse tree
	 */
	void exitIFF(ExpressionParser.IFFContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NOT}
	 * labeled alternative in {@link ExpressionParser#rightOp}.
	 * @param ctx the parse tree
	 */
	void enterNOT(ExpressionParser.NOTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NOT}
	 * labeled alternative in {@link ExpressionParser#rightOp}.
	 * @param ctx the parse tree
	 */
	void exitNOT(ExpressionParser.NOTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code QUANTIFIER}
	 * labeled alternative in {@link ExpressionParser#rightOp}.
	 * @param ctx the parse tree
	 */
	void enterQUANTIFIER(ExpressionParser.QUANTIFIERContext ctx);
	/**
	 * Exit a parse tree produced by the {@code QUANTIFIER}
	 * labeled alternative in {@link ExpressionParser#rightOp}.
	 * @param ctx the parse tree
	 */
	void exitQUANTIFIER(ExpressionParser.QUANTIFIERContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionParser#quant}.
	 * @param ctx the parse tree
	 */
	void enterQuant(ExpressionParser.QuantContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionParser#quant}.
	 * @param ctx the parse tree
	 */
	void exitQuant(ExpressionParser.QuantContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionParser#boolVar}.
	 * @param ctx the parse tree
	 */
	void enterBoolVar(ExpressionParser.BoolVarContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionParser#boolVar}.
	 * @param ctx the parse tree
	 */
	void exitBoolVar(ExpressionParser.BoolVarContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionParser#predicate}.
	 * @param ctx the parse tree
	 */
	void enterPredicate(ExpressionParser.PredicateContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionParser#predicate}.
	 * @param ctx the parse tree
	 */
	void exitPredicate(ExpressionParser.PredicateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BinaryOpExpression}
	 * labeled alternative in {@link ExpressionParser#e}.
	 * @param ctx the parse tree
	 */
	void enterBinaryOpExpression(ExpressionParser.BinaryOpExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BinaryOpExpression}
	 * labeled alternative in {@link ExpressionParser#e}.
	 * @param ctx the parse tree
	 */
	void exitBinaryOpExpression(ExpressionParser.BinaryOpExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BracketedExpression}
	 * labeled alternative in {@link ExpressionParser#e}.
	 * @param ctx the parse tree
	 */
	void enterBracketedExpression(ExpressionParser.BracketedExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BracketedExpression}
	 * labeled alternative in {@link ExpressionParser#e}.
	 * @param ctx the parse tree
	 */
	void exitBracketedExpression(ExpressionParser.BracketedExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BoolVarExpresion}
	 * labeled alternative in {@link ExpressionParser#e}.
	 * @param ctx the parse tree
	 */
	void enterBoolVarExpresion(ExpressionParser.BoolVarExpresionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BoolVarExpresion}
	 * labeled alternative in {@link ExpressionParser#e}.
	 * @param ctx the parse tree
	 */
	void exitBoolVarExpresion(ExpressionParser.BoolVarExpresionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PredicateExpression}
	 * labeled alternative in {@link ExpressionParser#e}.
	 * @param ctx the parse tree
	 */
	void enterPredicateExpression(ExpressionParser.PredicateExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PredicateExpression}
	 * labeled alternative in {@link ExpressionParser#e}.
	 * @param ctx the parse tree
	 */
	void exitPredicateExpression(ExpressionParser.PredicateExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code RightOpExpression}
	 * labeled alternative in {@link ExpressionParser#e}.
	 * @param ctx the parse tree
	 */
	void enterRightOpExpression(ExpressionParser.RightOpExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RightOpExpression}
	 * labeled alternative in {@link ExpressionParser#e}.
	 * @param ctx the parse tree
	 */
	void exitRightOpExpression(ExpressionParser.RightOpExpressionContext ctx);
}
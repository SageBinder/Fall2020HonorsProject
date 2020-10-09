// Generated from C:/Users/Sage/IdeaProjects/Fall2020HonorsProject/src/sage/grammars\ExpressionParser.g4 by ANTLR 4.8
package sage.java.antlrparser;

import sage.java.nodes.base.Node;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ExpressionParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		LIST_DELIM=1, U_QUANT=2, E_QUANT=3, NOT=4, AND=5, NAND=6, OR=7, IF=8, 
		IFF=9, TAUTOLOGY=10, CONTRADICTION=11, RBRACKET=12, LBRACKET=13, IDENTIFIER=14, 
		UNICODE_WS=15;
	public static final int
		RULE_binaryOp = 0, RULE_rightOp = 1, RULE_quant = 2, RULE_boolVar = 3, 
		RULE_predicate = 4, RULE_e = 5;
	private static String[] makeRuleNames() {
		return new String[] {
			"binaryOp", "rightOp", "quant", "boolVar", "predicate", "e"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "','", null, null, null, null, "'.'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "LIST_DELIM", "U_QUANT", "E_QUANT", "NOT", "AND", "NAND", "OR", 
			"IF", "IFF", "TAUTOLOGY", "CONTRADICTION", "RBRACKET", "LBRACKET", "IDENTIFIER", 
			"UNICODE_WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "ExpressionParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ExpressionParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class BinaryOpContext extends ParserRuleContext {
		public BinaryOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binaryOp; }
	 
		public BinaryOpContext() { }
		public void copyFrom(BinaryOpContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ORContext extends BinaryOpContext {
		public TerminalNode OR() { return getToken(ExpressionParser.OR, 0); }
		public ORContext(BinaryOpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionParserListener ) ((ExpressionParserListener)listener).enterOR(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionParserListener ) ((ExpressionParserListener)listener).exitOR(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionParserVisitor ) return ((ExpressionParserVisitor<? extends T>)visitor).visitOR(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ANDContext extends BinaryOpContext {
		public TerminalNode AND() { return getToken(ExpressionParser.AND, 0); }
		public ANDContext(BinaryOpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionParserListener ) ((ExpressionParserListener)listener).enterAND(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionParserListener ) ((ExpressionParserListener)listener).exitAND(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionParserVisitor ) return ((ExpressionParserVisitor<? extends T>)visitor).visitAND(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IFFContext extends BinaryOpContext {
		public TerminalNode IFF() { return getToken(ExpressionParser.IFF, 0); }
		public IFFContext(BinaryOpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionParserListener ) ((ExpressionParserListener)listener).enterIFF(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionParserListener ) ((ExpressionParserListener)listener).exitIFF(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionParserVisitor ) return ((ExpressionParserVisitor<? extends T>)visitor).visitIFF(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NANDContext extends BinaryOpContext {
		public TerminalNode NAND() { return getToken(ExpressionParser.NAND, 0); }
		public NANDContext(BinaryOpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionParserListener ) ((ExpressionParserListener)listener).enterNAND(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionParserListener ) ((ExpressionParserListener)listener).exitNAND(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionParserVisitor ) return ((ExpressionParserVisitor<? extends T>)visitor).visitNAND(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IFContext extends BinaryOpContext {
		public TerminalNode IF() { return getToken(ExpressionParser.IF, 0); }
		public IFContext(BinaryOpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionParserListener ) ((ExpressionParserListener)listener).enterIF(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionParserListener ) ((ExpressionParserListener)listener).exitIF(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionParserVisitor ) return ((ExpressionParserVisitor<? extends T>)visitor).visitIF(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BinaryOpContext binaryOp() throws RecognitionException {
		BinaryOpContext _localctx = new BinaryOpContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_binaryOp);
		try {
			setState(17);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AND:
				_localctx = new ANDContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(12);
				match(AND);
				}
				break;
			case NAND:
				_localctx = new NANDContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(13);
				match(NAND);
				}
				break;
			case OR:
				_localctx = new ORContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(14);
				match(OR);
				}
				break;
			case IF:
				_localctx = new IFContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(15);
				match(IF);
				}
				break;
			case IFF:
				_localctx = new IFFContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(16);
				match(IFF);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RightOpContext extends ParserRuleContext {
		public RightOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rightOp; }
	 
		public RightOpContext() { }
		public void copyFrom(RightOpContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NOTContext extends RightOpContext {
		public Token opToken;
		public TerminalNode NOT() { return getToken(ExpressionParser.NOT, 0); }
		public NOTContext(RightOpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionParserListener ) ((ExpressionParserListener)listener).enterNOT(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionParserListener ) ((ExpressionParserListener)listener).exitNOT(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionParserVisitor ) return ((ExpressionParserVisitor<? extends T>)visitor).visitNOT(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class QUANTIFIERContext extends RightOpContext {
		public QuantContext quantExpression;
		public QuantContext quant() {
			return getRuleContext(QuantContext.class,0);
		}
		public QUANTIFIERContext(RightOpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionParserListener ) ((ExpressionParserListener)listener).enterQUANTIFIER(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionParserListener ) ((ExpressionParserListener)listener).exitQUANTIFIER(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionParserVisitor ) return ((ExpressionParserVisitor<? extends T>)visitor).visitQUANTIFIER(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RightOpContext rightOp() throws RecognitionException {
		RightOpContext _localctx = new RightOpContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_rightOp);
		try {
			setState(21);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NOT:
				_localctx = new NOTContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(19);
				((NOTContext)_localctx).opToken = match(NOT);
				}
				break;
			case LBRACKET:
				_localctx = new QUANTIFIERContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(20);
				((QUANTIFIERContext)_localctx).quantExpression = quant();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QuantContext extends ParserRuleContext {
		public Token quantToken;
		public Token IDENTIFIER;
		public List<Token> variables = new ArrayList<Token>();
		public List<TerminalNode> LBRACKET() { return getTokens(ExpressionParser.LBRACKET); }
		public TerminalNode LBRACKET(int i) {
			return getToken(ExpressionParser.LBRACKET, i);
		}
		public List<TerminalNode> RBRACKET() { return getTokens(ExpressionParser.RBRACKET); }
		public TerminalNode RBRACKET(int i) {
			return getToken(ExpressionParser.RBRACKET, i);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(ExpressionParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(ExpressionParser.IDENTIFIER, i);
		}
		public TerminalNode U_QUANT() { return getToken(ExpressionParser.U_QUANT, 0); }
		public TerminalNode E_QUANT() { return getToken(ExpressionParser.E_QUANT, 0); }
		public List<TerminalNode> LIST_DELIM() { return getTokens(ExpressionParser.LIST_DELIM); }
		public TerminalNode LIST_DELIM(int i) {
			return getToken(ExpressionParser.LIST_DELIM, i);
		}
		public QuantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_quant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionParserListener ) ((ExpressionParserListener)listener).enterQuant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionParserListener ) ((ExpressionParserListener)listener).exitQuant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionParserVisitor ) return ((ExpressionParserVisitor<? extends T>)visitor).visitQuant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QuantContext quant() throws RecognitionException {
		QuantContext _localctx = new QuantContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_quant);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(23);
			match(LBRACKET);
			setState(24);
			((QuantContext)_localctx).quantToken = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==U_QUANT || _la==E_QUANT) ) {
				((QuantContext)_localctx).quantToken = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(25);
			match(LBRACKET);
			setState(26);
			((QuantContext)_localctx).IDENTIFIER = match(IDENTIFIER);
			((QuantContext)_localctx).variables.add(((QuantContext)_localctx).IDENTIFIER);
			setState(31);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LIST_DELIM) {
				{
				{
				setState(27);
				match(LIST_DELIM);
				setState(28);
				((QuantContext)_localctx).IDENTIFIER = match(IDENTIFIER);
				((QuantContext)_localctx).variables.add(((QuantContext)_localctx).IDENTIFIER);
				}
				}
				setState(33);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(34);
			match(RBRACKET);
			setState(35);
			match(RBRACKET);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BoolVarContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(ExpressionParser.IDENTIFIER, 0); }
		public BoolVarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolVar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionParserListener ) ((ExpressionParserListener)listener).enterBoolVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionParserListener ) ((ExpressionParserListener)listener).exitBoolVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionParserVisitor ) return ((ExpressionParserVisitor<? extends T>)visitor).visitBoolVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoolVarContext boolVar() throws RecognitionException {
		BoolVarContext _localctx = new BoolVarContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_boolVar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(37);
			match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PredicateContext extends ParserRuleContext {
		public Token predicateName;
		public Token IDENTIFIER;
		public List<Token> predicateVars = new ArrayList<Token>();
		public TerminalNode LBRACKET() { return getToken(ExpressionParser.LBRACKET, 0); }
		public TerminalNode RBRACKET() { return getToken(ExpressionParser.RBRACKET, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(ExpressionParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(ExpressionParser.IDENTIFIER, i);
		}
		public List<TerminalNode> LIST_DELIM() { return getTokens(ExpressionParser.LIST_DELIM); }
		public TerminalNode LIST_DELIM(int i) {
			return getToken(ExpressionParser.LIST_DELIM, i);
		}
		public PredicateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_predicate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionParserListener ) ((ExpressionParserListener)listener).enterPredicate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionParserListener ) ((ExpressionParserListener)listener).exitPredicate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionParserVisitor ) return ((ExpressionParserVisitor<? extends T>)visitor).visitPredicate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PredicateContext predicate() throws RecognitionException {
		PredicateContext _localctx = new PredicateContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_predicate);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(39);
			((PredicateContext)_localctx).predicateName = match(IDENTIFIER);
			setState(40);
			match(LBRACKET);
			setState(41);
			((PredicateContext)_localctx).IDENTIFIER = match(IDENTIFIER);
			((PredicateContext)_localctx).predicateVars.add(((PredicateContext)_localctx).IDENTIFIER);
			setState(46);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LIST_DELIM) {
				{
				{
				setState(42);
				match(LIST_DELIM);
				setState(43);
				((PredicateContext)_localctx).IDENTIFIER = match(IDENTIFIER);
				((PredicateContext)_localctx).predicateVars.add(((PredicateContext)_localctx).IDENTIFIER);
				}
				}
				setState(48);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(49);
			match(RBRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EContext extends ParserRuleContext {
		public Node node;
		public EContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_e; }
	 
		public EContext() { }
		public void copyFrom(EContext ctx) {
			super.copyFrom(ctx);
			this.node = ctx.node;
		}
	}
	public static class BinaryOpExpressionContext extends EContext {
		public EContext exp1;
		public BinaryOpContext op;
		public EContext exp2;
		public List<EContext> e() {
			return getRuleContexts(EContext.class);
		}
		public EContext e(int i) {
			return getRuleContext(EContext.class,i);
		}
		public BinaryOpContext binaryOp() {
			return getRuleContext(BinaryOpContext.class,0);
		}
		public BinaryOpExpressionContext(EContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionParserListener ) ((ExpressionParserListener)listener).enterBinaryOpExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionParserListener ) ((ExpressionParserListener)listener).exitBinaryOpExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionParserVisitor ) return ((ExpressionParserVisitor<? extends T>)visitor).visitBinaryOpExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BracketedExpressionContext extends EContext {
		public EContext exp;
		public TerminalNode LBRACKET() { return getToken(ExpressionParser.LBRACKET, 0); }
		public TerminalNode RBRACKET() { return getToken(ExpressionParser.RBRACKET, 0); }
		public EContext e() {
			return getRuleContext(EContext.class,0);
		}
		public BracketedExpressionContext(EContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionParserListener ) ((ExpressionParserListener)listener).enterBracketedExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionParserListener ) ((ExpressionParserListener)listener).exitBracketedExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionParserVisitor ) return ((ExpressionParserVisitor<? extends T>)visitor).visitBracketedExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BoolVarExpresionContext extends EContext {
		public BoolVarContext boolVar() {
			return getRuleContext(BoolVarContext.class,0);
		}
		public BoolVarExpresionContext(EContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionParserListener ) ((ExpressionParserListener)listener).enterBoolVarExpresion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionParserListener ) ((ExpressionParserListener)listener).exitBoolVarExpresion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionParserVisitor ) return ((ExpressionParserVisitor<? extends T>)visitor).visitBoolVarExpresion(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PredicateExpressionContext extends EContext {
		public PredicateContext predicate() {
			return getRuleContext(PredicateContext.class,0);
		}
		public PredicateExpressionContext(EContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionParserListener ) ((ExpressionParserListener)listener).enterPredicateExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionParserListener ) ((ExpressionParserListener)listener).exitPredicateExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionParserVisitor ) return ((ExpressionParserVisitor<? extends T>)visitor).visitPredicateExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RightOpExpressionContext extends EContext {
		public RightOpContext op;
		public EContext exp;
		public RightOpContext rightOp() {
			return getRuleContext(RightOpContext.class,0);
		}
		public EContext e() {
			return getRuleContext(EContext.class,0);
		}
		public RightOpExpressionContext(EContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionParserListener ) ((ExpressionParserListener)listener).enterRightOpExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionParserListener ) ((ExpressionParserListener)listener).exitRightOpExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionParserVisitor ) return ((ExpressionParserVisitor<? extends T>)visitor).visitRightOpExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EContext e() throws RecognitionException {
		return e(0);
	}

	private EContext e(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		EContext _localctx = new EContext(_ctx, _parentState);
		EContext _prevctx = _localctx;
		int _startState = 10;
		enterRecursionRule(_localctx, 10, RULE_e, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				_localctx = new BracketedExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(52);
				match(LBRACKET);
				setState(53);
				((BracketedExpressionContext)_localctx).exp = e(0);
				setState(54);
				match(RBRACKET);
				}
				break;
			case 2:
				{
				_localctx = new RightOpExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(56);
				((RightOpExpressionContext)_localctx).op = rightOp();
				setState(57);
				((RightOpExpressionContext)_localctx).exp = e(4);
				}
				break;
			case 3:
				{
				_localctx = new BoolVarExpresionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(59);
				boolVar();
				}
				break;
			case 4:
				{
				_localctx = new PredicateExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(60);
				predicate();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(69);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new BinaryOpExpressionContext(new EContext(_parentctx, _parentState));
					((BinaryOpExpressionContext)_localctx).exp1 = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_e);
					setState(63);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(64);
					((BinaryOpExpressionContext)_localctx).op = binaryOp();
					setState(65);
					((BinaryOpExpressionContext)_localctx).exp2 = e(4);
					}
					} 
				}
				setState(71);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 5:
			return e_sempred((EContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean e_sempred(EContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\21K\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3\2\3\2\3\2\3\2\3\2\5\2\24\n\2\3\3"+
		"\3\3\5\3\30\n\3\3\4\3\4\3\4\3\4\3\4\3\4\7\4 \n\4\f\4\16\4#\13\4\3\4\3"+
		"\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6\3\6\7\6/\n\6\f\6\16\6\62\13\6\3\6\3\6\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7@\n\7\3\7\3\7\3\7\3\7\7\7F\n"+
		"\7\f\7\16\7I\13\7\3\7\2\3\f\b\2\4\6\b\n\f\2\3\3\2\4\5\2O\2\23\3\2\2\2"+
		"\4\27\3\2\2\2\6\31\3\2\2\2\b\'\3\2\2\2\n)\3\2\2\2\f?\3\2\2\2\16\24\7\7"+
		"\2\2\17\24\7\b\2\2\20\24\7\t\2\2\21\24\7\n\2\2\22\24\7\13\2\2\23\16\3"+
		"\2\2\2\23\17\3\2\2\2\23\20\3\2\2\2\23\21\3\2\2\2\23\22\3\2\2\2\24\3\3"+
		"\2\2\2\25\30\7\6\2\2\26\30\5\6\4\2\27\25\3\2\2\2\27\26\3\2\2\2\30\5\3"+
		"\2\2\2\31\32\7\17\2\2\32\33\t\2\2\2\33\34\7\17\2\2\34!\7\20\2\2\35\36"+
		"\7\3\2\2\36 \7\20\2\2\37\35\3\2\2\2 #\3\2\2\2!\37\3\2\2\2!\"\3\2\2\2\""+
		"$\3\2\2\2#!\3\2\2\2$%\7\16\2\2%&\7\16\2\2&\7\3\2\2\2\'(\7\20\2\2(\t\3"+
		"\2\2\2)*\7\20\2\2*+\7\17\2\2+\60\7\20\2\2,-\7\3\2\2-/\7\20\2\2.,\3\2\2"+
		"\2/\62\3\2\2\2\60.\3\2\2\2\60\61\3\2\2\2\61\63\3\2\2\2\62\60\3\2\2\2\63"+
		"\64\7\16\2\2\64\13\3\2\2\2\65\66\b\7\1\2\66\67\7\17\2\2\678\5\f\7\289"+
		"\7\16\2\29@\3\2\2\2:;\5\4\3\2;<\5\f\7\6<@\3\2\2\2=@\5\b\5\2>@\5\n\6\2"+
		"?\65\3\2\2\2?:\3\2\2\2?=\3\2\2\2?>\3\2\2\2@G\3\2\2\2AB\f\5\2\2BC\5\2\2"+
		"\2CD\5\f\7\6DF\3\2\2\2EA\3\2\2\2FI\3\2\2\2GE\3\2\2\2GH\3\2\2\2H\r\3\2"+
		"\2\2IG\3\2\2\2\b\23\27!\60?G";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
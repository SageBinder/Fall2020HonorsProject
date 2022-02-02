// Generated from C:/Users/Sage/IdeaProjects/Fall2020HonorsProject/src/sage/grammars\ProofParser.g4 by ANTLR 4.9.2
package sage.java.antlrparser;

import sage.java.nodes.base.Node;
import sage.java.proof.Proof;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ProofParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		LIST_DELIM=1, LINE_DELIM=2, U_QUANT=3, E_QUANT=4, NOT=5, AND=6, NAND=7, 
		OR=8, IF=9, IFF=10, TAUTOLOGY=11, CONTRADICTION=12, ASSUME=13, PREMISES=14, 
		R_PBRACKET=15, L_PBRACKET=16, R_SBRACKET=17, L_SBRACKET=18, R_CBRACKET=19, 
		L_CBRACKET=20, RULE_START=21, IDENTIFIER=22, UNICODE_WS=23, CONJ_INTRO=24, 
		CONJ_ELIM=25, DISJ_INTRO=26, DISJ_ELIM=27, COND_INTRO=28, COND_ELIM=29, 
		BICOND_INTRO=30, BICOND_ELIM=31, NEG_INTRO=32, NEG_ELIM=33, U_INTRO=34, 
		U_ELIM=35, E_INTRO=36, E_ELIM=37, AC=38, RD=39, W=40, DC=41, CD=42, DM=43, 
		CP=44, C=45, R=46, TC=47, NUMBER=48, RULE_END=49, RULE_UNICODE_WS=50;
	public static final int
		RULE_lbracket = 0, RULE_rbracket = 1, RULE_binaryOp = 2, RULE_rightOp = 3, 
		RULE_quant = 4, RULE_boolVar = 5, RULE_predicate = 6, RULE_sentence = 7, 
		RULE_ruleType = 8, RULE_ruleExpression = 9, RULE_premise = 10, RULE_conclusion = 11, 
		RULE_proofConstruct = 12, RULE_assumption = 13, RULE_proof = 14;
	private static String[] makeRuleNames() {
		return new String[] {
			"lbracket", "rbracket", "binaryOp", "rightOp", "quant", "boolVar", "predicate", 
			"sentence", "ruleType", "ruleExpression", "premise", "conclusion", "proofConstruct", 
			"assumption", "proof"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "','", "';'", null, null, null, null, "'@'", null, null, null, 
			null, null, "'assume'", "'premises'", "')'", "'('", "']'", "'['", "'}'", 
			"'{'", "'#'", null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, "'AC'", "'RD'", "'W'", "'DC'", "'CD'", 
			"'DM'", "'CP'", "'C'", "'R'", "'TC'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "LIST_DELIM", "LINE_DELIM", "U_QUANT", "E_QUANT", "NOT", "AND", 
			"NAND", "OR", "IF", "IFF", "TAUTOLOGY", "CONTRADICTION", "ASSUME", "PREMISES", 
			"R_PBRACKET", "L_PBRACKET", "R_SBRACKET", "L_SBRACKET", "R_CBRACKET", 
			"L_CBRACKET", "RULE_START", "IDENTIFIER", "UNICODE_WS", "CONJ_INTRO", 
			"CONJ_ELIM", "DISJ_INTRO", "DISJ_ELIM", "COND_INTRO", "COND_ELIM", "BICOND_INTRO", 
			"BICOND_ELIM", "NEG_INTRO", "NEG_ELIM", "U_INTRO", "U_ELIM", "E_INTRO", 
			"E_ELIM", "AC", "RD", "W", "DC", "CD", "DM", "CP", "C", "R", "TC", "NUMBER", 
			"RULE_END", "RULE_UNICODE_WS"
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
	public String getGrammarFileName() { return "ProofParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ProofParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class LbracketContext extends ParserRuleContext {
		public TerminalNode L_PBRACKET() { return getToken(ProofParser.L_PBRACKET, 0); }
		public TerminalNode L_SBRACKET() { return getToken(ProofParser.L_SBRACKET, 0); }
		public TerminalNode L_CBRACKET() { return getToken(ProofParser.L_CBRACKET, 0); }
		public LbracketContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lbracket; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProofParserListener ) ((ProofParserListener)listener).enterLbracket(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProofParserListener ) ((ProofParserListener)listener).exitLbracket(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProofParserVisitor ) return ((ProofParserVisitor<? extends T>)visitor).visitLbracket(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LbracketContext lbracket() throws RecognitionException {
		LbracketContext _localctx = new LbracketContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_lbracket);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(30);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << L_PBRACKET) | (1L << L_SBRACKET) | (1L << L_CBRACKET))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class RbracketContext extends ParserRuleContext {
		public TerminalNode R_PBRACKET() { return getToken(ProofParser.R_PBRACKET, 0); }
		public TerminalNode R_SBRACKET() { return getToken(ProofParser.R_SBRACKET, 0); }
		public TerminalNode R_CBRACKET() { return getToken(ProofParser.R_CBRACKET, 0); }
		public RbracketContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rbracket; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProofParserListener ) ((ProofParserListener)listener).enterRbracket(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProofParserListener ) ((ProofParserListener)listener).exitRbracket(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProofParserVisitor ) return ((ProofParserVisitor<? extends T>)visitor).visitRbracket(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RbracketContext rbracket() throws RecognitionException {
		RbracketContext _localctx = new RbracketContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_rbracket);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(32);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << R_PBRACKET) | (1L << R_SBRACKET) | (1L << R_CBRACKET))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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
		public TerminalNode OR() { return getToken(ProofParser.OR, 0); }
		public ORContext(BinaryOpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProofParserListener ) ((ProofParserListener)listener).enterOR(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProofParserListener ) ((ProofParserListener)listener).exitOR(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProofParserVisitor ) return ((ProofParserVisitor<? extends T>)visitor).visitOR(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ANDContext extends BinaryOpContext {
		public TerminalNode AND() { return getToken(ProofParser.AND, 0); }
		public ANDContext(BinaryOpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProofParserListener ) ((ProofParserListener)listener).enterAND(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProofParserListener ) ((ProofParserListener)listener).exitAND(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProofParserVisitor ) return ((ProofParserVisitor<? extends T>)visitor).visitAND(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IFFContext extends BinaryOpContext {
		public TerminalNode IFF() { return getToken(ProofParser.IFF, 0); }
		public IFFContext(BinaryOpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProofParserListener ) ((ProofParserListener)listener).enterIFF(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProofParserListener ) ((ProofParserListener)listener).exitIFF(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProofParserVisitor ) return ((ProofParserVisitor<? extends T>)visitor).visitIFF(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NANDContext extends BinaryOpContext {
		public TerminalNode NAND() { return getToken(ProofParser.NAND, 0); }
		public NANDContext(BinaryOpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProofParserListener ) ((ProofParserListener)listener).enterNAND(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProofParserListener ) ((ProofParserListener)listener).exitNAND(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProofParserVisitor ) return ((ProofParserVisitor<? extends T>)visitor).visitNAND(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IFContext extends BinaryOpContext {
		public TerminalNode IF() { return getToken(ProofParser.IF, 0); }
		public IFContext(BinaryOpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProofParserListener ) ((ProofParserListener)listener).enterIF(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProofParserListener ) ((ProofParserListener)listener).exitIF(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProofParserVisitor ) return ((ProofParserVisitor<? extends T>)visitor).visitIF(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BinaryOpContext binaryOp() throws RecognitionException {
		BinaryOpContext _localctx = new BinaryOpContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_binaryOp);
		try {
			setState(39);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AND:
				_localctx = new ANDContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(34);
				match(AND);
				}
				break;
			case NAND:
				_localctx = new NANDContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(35);
				match(NAND);
				}
				break;
			case OR:
				_localctx = new ORContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(36);
				match(OR);
				}
				break;
			case IF:
				_localctx = new IFContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(37);
				match(IF);
				}
				break;
			case IFF:
				_localctx = new IFFContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(38);
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
		public TerminalNode NOT() { return getToken(ProofParser.NOT, 0); }
		public NOTContext(RightOpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProofParserListener ) ((ProofParserListener)listener).enterNOT(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProofParserListener ) ((ProofParserListener)listener).exitNOT(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProofParserVisitor ) return ((ProofParserVisitor<? extends T>)visitor).visitNOT(this);
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
			if ( listener instanceof ProofParserListener ) ((ProofParserListener)listener).enterQUANTIFIER(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProofParserListener ) ((ProofParserListener)listener).exitQUANTIFIER(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProofParserVisitor ) return ((ProofParserVisitor<? extends T>)visitor).visitQUANTIFIER(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RightOpContext rightOp() throws RecognitionException {
		RightOpContext _localctx = new RightOpContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_rightOp);
		try {
			setState(43);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NOT:
				_localctx = new NOTContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(41);
				((NOTContext)_localctx).opToken = match(NOT);
				}
				break;
			case L_PBRACKET:
			case L_SBRACKET:
			case L_CBRACKET:
				_localctx = new QUANTIFIERContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(42);
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
		public LbracketContext lbracket() {
			return getRuleContext(LbracketContext.class,0);
		}
		public TerminalNode L_PBRACKET() { return getToken(ProofParser.L_PBRACKET, 0); }
		public TerminalNode R_PBRACKET() { return getToken(ProofParser.R_PBRACKET, 0); }
		public RbracketContext rbracket() {
			return getRuleContext(RbracketContext.class,0);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(ProofParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(ProofParser.IDENTIFIER, i);
		}
		public TerminalNode U_QUANT() { return getToken(ProofParser.U_QUANT, 0); }
		public TerminalNode E_QUANT() { return getToken(ProofParser.E_QUANT, 0); }
		public List<TerminalNode> LIST_DELIM() { return getTokens(ProofParser.LIST_DELIM); }
		public TerminalNode LIST_DELIM(int i) {
			return getToken(ProofParser.LIST_DELIM, i);
		}
		public QuantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_quant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProofParserListener ) ((ProofParserListener)listener).enterQuant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProofParserListener ) ((ProofParserListener)listener).exitQuant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProofParserVisitor ) return ((ProofParserVisitor<? extends T>)visitor).visitQuant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QuantContext quant() throws RecognitionException {
		QuantContext _localctx = new QuantContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_quant);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(45);
			lbracket();
			setState(46);
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
			setState(47);
			match(L_PBRACKET);
			setState(48);
			((QuantContext)_localctx).IDENTIFIER = match(IDENTIFIER);
			((QuantContext)_localctx).variables.add(((QuantContext)_localctx).IDENTIFIER);
			setState(53);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LIST_DELIM) {
				{
				{
				setState(49);
				match(LIST_DELIM);
				setState(50);
				((QuantContext)_localctx).IDENTIFIER = match(IDENTIFIER);
				((QuantContext)_localctx).variables.add(((QuantContext)_localctx).IDENTIFIER);
				}
				}
				setState(55);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(56);
			match(R_PBRACKET);
			setState(57);
			rbracket();
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
		public TerminalNode IDENTIFIER() { return getToken(ProofParser.IDENTIFIER, 0); }
		public BoolVarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolVar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProofParserListener ) ((ProofParserListener)listener).enterBoolVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProofParserListener ) ((ProofParserListener)listener).exitBoolVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProofParserVisitor ) return ((ProofParserVisitor<? extends T>)visitor).visitBoolVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoolVarContext boolVar() throws RecognitionException {
		BoolVarContext _localctx = new BoolVarContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_boolVar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
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
		public TerminalNode L_PBRACKET() { return getToken(ProofParser.L_PBRACKET, 0); }
		public TerminalNode R_PBRACKET() { return getToken(ProofParser.R_PBRACKET, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(ProofParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(ProofParser.IDENTIFIER, i);
		}
		public List<TerminalNode> LIST_DELIM() { return getTokens(ProofParser.LIST_DELIM); }
		public TerminalNode LIST_DELIM(int i) {
			return getToken(ProofParser.LIST_DELIM, i);
		}
		public PredicateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_predicate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProofParserListener ) ((ProofParserListener)listener).enterPredicate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProofParserListener ) ((ProofParserListener)listener).exitPredicate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProofParserVisitor ) return ((ProofParserVisitor<? extends T>)visitor).visitPredicate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PredicateContext predicate() throws RecognitionException {
		PredicateContext _localctx = new PredicateContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_predicate);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			((PredicateContext)_localctx).predicateName = match(IDENTIFIER);
			setState(62);
			match(L_PBRACKET);
			setState(63);
			((PredicateContext)_localctx).IDENTIFIER = match(IDENTIFIER);
			((PredicateContext)_localctx).predicateVars.add(((PredicateContext)_localctx).IDENTIFIER);
			setState(68);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LIST_DELIM) {
				{
				{
				setState(64);
				match(LIST_DELIM);
				setState(65);
				((PredicateContext)_localctx).IDENTIFIER = match(IDENTIFIER);
				((PredicateContext)_localctx).predicateVars.add(((PredicateContext)_localctx).IDENTIFIER);
				}
				}
				setState(70);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(71);
			match(R_PBRACKET);
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

	public static class SentenceContext extends ParserRuleContext {
		public Node node;
		public SentenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentence; }
	 
		public SentenceContext() { }
		public void copyFrom(SentenceContext ctx) {
			super.copyFrom(ctx);
			this.node = ctx.node;
		}
	}
	public static class BoolVarExpressionContext extends SentenceContext {
		public BoolVarContext boolVar() {
			return getRuleContext(BoolVarContext.class,0);
		}
		public BoolVarExpressionContext(SentenceContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProofParserListener ) ((ProofParserListener)listener).enterBoolVarExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProofParserListener ) ((ProofParserListener)listener).exitBoolVarExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProofParserVisitor ) return ((ProofParserVisitor<? extends T>)visitor).visitBoolVarExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BinaryOpExpressionContext extends SentenceContext {
		public SentenceContext sentence1;
		public SentenceContext sentence2;
		public BinaryOpContext binaryOp() {
			return getRuleContext(BinaryOpContext.class,0);
		}
		public List<SentenceContext> sentence() {
			return getRuleContexts(SentenceContext.class);
		}
		public SentenceContext sentence(int i) {
			return getRuleContext(SentenceContext.class,i);
		}
		public BinaryOpExpressionContext(SentenceContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProofParserListener ) ((ProofParserListener)listener).enterBinaryOpExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProofParserListener ) ((ProofParserListener)listener).exitBinaryOpExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProofParserVisitor ) return ((ProofParserVisitor<? extends T>)visitor).visitBinaryOpExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BracketedExpressionContext extends SentenceContext {
		public LbracketContext lbracket() {
			return getRuleContext(LbracketContext.class,0);
		}
		public SentenceContext sentence() {
			return getRuleContext(SentenceContext.class,0);
		}
		public RbracketContext rbracket() {
			return getRuleContext(RbracketContext.class,0);
		}
		public BracketedExpressionContext(SentenceContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProofParserListener ) ((ProofParserListener)listener).enterBracketedExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProofParserListener ) ((ProofParserListener)listener).exitBracketedExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProofParserVisitor ) return ((ProofParserVisitor<? extends T>)visitor).visitBracketedExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PredicateExpressionContext extends SentenceContext {
		public PredicateContext predicate() {
			return getRuleContext(PredicateContext.class,0);
		}
		public PredicateExpressionContext(SentenceContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProofParserListener ) ((ProofParserListener)listener).enterPredicateExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProofParserListener ) ((ProofParserListener)listener).exitPredicateExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProofParserVisitor ) return ((ProofParserVisitor<? extends T>)visitor).visitPredicateExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RightOpExpressionContext extends SentenceContext {
		public RightOpContext rightOp() {
			return getRuleContext(RightOpContext.class,0);
		}
		public SentenceContext sentence() {
			return getRuleContext(SentenceContext.class,0);
		}
		public RightOpExpressionContext(SentenceContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProofParserListener ) ((ProofParserListener)listener).enterRightOpExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProofParserListener ) ((ProofParserListener)listener).exitRightOpExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProofParserVisitor ) return ((ProofParserVisitor<? extends T>)visitor).visitRightOpExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SentenceContext sentence() throws RecognitionException {
		return sentence(0);
	}

	private SentenceContext sentence(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		SentenceContext _localctx = new SentenceContext(_ctx, _parentState);
		SentenceContext _prevctx = _localctx;
		int _startState = 14;
		enterRecursionRule(_localctx, 14, RULE_sentence, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				_localctx = new BracketedExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(74);
				lbracket();
				setState(75);
				sentence(0);
				setState(76);
				rbracket();
				}
				break;
			case 2:
				{
				_localctx = new RightOpExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(78);
				rightOp();
				setState(79);
				sentence(4);
				}
				break;
			case 3:
				{
				_localctx = new BoolVarExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(81);
				boolVar();
				}
				break;
			case 4:
				{
				_localctx = new PredicateExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(82);
				predicate();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(91);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new BinaryOpExpressionContext(new SentenceContext(_parentctx, _parentState));
					((BinaryOpExpressionContext)_localctx).sentence1 = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_sentence);
					setState(85);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(86);
					binaryOp();
					setState(87);
					((BinaryOpExpressionContext)_localctx).sentence2 = sentence(4);
					}
					} 
				}
				setState(93);
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

	public static class RuleTypeContext extends ParserRuleContext {
		public Token token;
		public TerminalNode CONJ_INTRO() { return getToken(ProofParser.CONJ_INTRO, 0); }
		public TerminalNode CONJ_ELIM() { return getToken(ProofParser.CONJ_ELIM, 0); }
		public TerminalNode DISJ_INTRO() { return getToken(ProofParser.DISJ_INTRO, 0); }
		public TerminalNode DISJ_ELIM() { return getToken(ProofParser.DISJ_ELIM, 0); }
		public TerminalNode COND_INTRO() { return getToken(ProofParser.COND_INTRO, 0); }
		public TerminalNode COND_ELIM() { return getToken(ProofParser.COND_ELIM, 0); }
		public TerminalNode BICOND_INTRO() { return getToken(ProofParser.BICOND_INTRO, 0); }
		public TerminalNode BICOND_ELIM() { return getToken(ProofParser.BICOND_ELIM, 0); }
		public TerminalNode NEG_INTRO() { return getToken(ProofParser.NEG_INTRO, 0); }
		public TerminalNode NEG_ELIM() { return getToken(ProofParser.NEG_ELIM, 0); }
		public TerminalNode U_INTRO() { return getToken(ProofParser.U_INTRO, 0); }
		public TerminalNode U_ELIM() { return getToken(ProofParser.U_ELIM, 0); }
		public TerminalNode E_INTRO() { return getToken(ProofParser.E_INTRO, 0); }
		public TerminalNode E_ELIM() { return getToken(ProofParser.E_ELIM, 0); }
		public TerminalNode AC() { return getToken(ProofParser.AC, 0); }
		public TerminalNode RD() { return getToken(ProofParser.RD, 0); }
		public TerminalNode W() { return getToken(ProofParser.W, 0); }
		public TerminalNode DC() { return getToken(ProofParser.DC, 0); }
		public TerminalNode CD() { return getToken(ProofParser.CD, 0); }
		public TerminalNode DM() { return getToken(ProofParser.DM, 0); }
		public TerminalNode CP() { return getToken(ProofParser.CP, 0); }
		public TerminalNode C() { return getToken(ProofParser.C, 0); }
		public TerminalNode R() { return getToken(ProofParser.R, 0); }
		public TerminalNode TC() { return getToken(ProofParser.TC, 0); }
		public RuleTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProofParserListener ) ((ProofParserListener)listener).enterRuleType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProofParserListener ) ((ProofParserListener)listener).exitRuleType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProofParserVisitor ) return ((ProofParserVisitor<? extends T>)visitor).visitRuleType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RuleTypeContext ruleType() throws RecognitionException {
		RuleTypeContext _localctx = new RuleTypeContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_ruleType);
		try {
			setState(118);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CONJ_INTRO:
				enterOuterAlt(_localctx, 1);
				{
				setState(94);
				((RuleTypeContext)_localctx).token = match(CONJ_INTRO);
				}
				break;
			case CONJ_ELIM:
				enterOuterAlt(_localctx, 2);
				{
				setState(95);
				((RuleTypeContext)_localctx).token = match(CONJ_ELIM);
				}
				break;
			case DISJ_INTRO:
				enterOuterAlt(_localctx, 3);
				{
				setState(96);
				((RuleTypeContext)_localctx).token = match(DISJ_INTRO);
				}
				break;
			case DISJ_ELIM:
				enterOuterAlt(_localctx, 4);
				{
				setState(97);
				((RuleTypeContext)_localctx).token = match(DISJ_ELIM);
				}
				break;
			case COND_INTRO:
				enterOuterAlt(_localctx, 5);
				{
				setState(98);
				((RuleTypeContext)_localctx).token = match(COND_INTRO);
				}
				break;
			case COND_ELIM:
				enterOuterAlt(_localctx, 6);
				{
				setState(99);
				((RuleTypeContext)_localctx).token = match(COND_ELIM);
				}
				break;
			case BICOND_INTRO:
				enterOuterAlt(_localctx, 7);
				{
				setState(100);
				((RuleTypeContext)_localctx).token = match(BICOND_INTRO);
				}
				break;
			case BICOND_ELIM:
				enterOuterAlt(_localctx, 8);
				{
				setState(101);
				((RuleTypeContext)_localctx).token = match(BICOND_ELIM);
				}
				break;
			case NEG_INTRO:
				enterOuterAlt(_localctx, 9);
				{
				setState(102);
				((RuleTypeContext)_localctx).token = match(NEG_INTRO);
				}
				break;
			case NEG_ELIM:
				enterOuterAlt(_localctx, 10);
				{
				setState(103);
				((RuleTypeContext)_localctx).token = match(NEG_ELIM);
				}
				break;
			case U_INTRO:
				enterOuterAlt(_localctx, 11);
				{
				setState(104);
				((RuleTypeContext)_localctx).token = match(U_INTRO);
				}
				break;
			case U_ELIM:
				enterOuterAlt(_localctx, 12);
				{
				setState(105);
				((RuleTypeContext)_localctx).token = match(U_ELIM);
				}
				break;
			case E_INTRO:
				enterOuterAlt(_localctx, 13);
				{
				setState(106);
				((RuleTypeContext)_localctx).token = match(E_INTRO);
				}
				break;
			case E_ELIM:
				enterOuterAlt(_localctx, 14);
				{
				setState(107);
				((RuleTypeContext)_localctx).token = match(E_ELIM);
				}
				break;
			case AC:
				enterOuterAlt(_localctx, 15);
				{
				setState(108);
				((RuleTypeContext)_localctx).token = match(AC);
				}
				break;
			case RD:
				enterOuterAlt(_localctx, 16);
				{
				setState(109);
				((RuleTypeContext)_localctx).token = match(RD);
				}
				break;
			case W:
				enterOuterAlt(_localctx, 17);
				{
				setState(110);
				((RuleTypeContext)_localctx).token = match(W);
				}
				break;
			case DC:
				enterOuterAlt(_localctx, 18);
				{
				setState(111);
				((RuleTypeContext)_localctx).token = match(DC);
				}
				break;
			case CD:
				enterOuterAlt(_localctx, 19);
				{
				setState(112);
				((RuleTypeContext)_localctx).token = match(CD);
				}
				break;
			case DM:
				enterOuterAlt(_localctx, 20);
				{
				setState(113);
				((RuleTypeContext)_localctx).token = match(DM);
				}
				break;
			case CP:
				enterOuterAlt(_localctx, 21);
				{
				setState(114);
				((RuleTypeContext)_localctx).token = match(CP);
				}
				break;
			case C:
				enterOuterAlt(_localctx, 22);
				{
				setState(115);
				((RuleTypeContext)_localctx).token = match(C);
				}
				break;
			case R:
				enterOuterAlt(_localctx, 23);
				{
				setState(116);
				((RuleTypeContext)_localctx).token = match(R);
				}
				break;
			case TC:
				enterOuterAlt(_localctx, 24);
				{
				setState(117);
				((RuleTypeContext)_localctx).token = match(TC);
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

	public static class RuleExpressionContext extends ParserRuleContext {
		public Token NUMBER;
		public List<Token> lineNumbers = new ArrayList<Token>();
		public RuleTypeContext ruleType() {
			return getRuleContext(RuleTypeContext.class,0);
		}
		public List<TerminalNode> LIST_DELIM() { return getTokens(ProofParser.LIST_DELIM); }
		public TerminalNode LIST_DELIM(int i) {
			return getToken(ProofParser.LIST_DELIM, i);
		}
		public List<TerminalNode> NUMBER() { return getTokens(ProofParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(ProofParser.NUMBER, i);
		}
		public RuleExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProofParserListener ) ((ProofParserListener)listener).enterRuleExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProofParserListener ) ((ProofParserListener)listener).exitRuleExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProofParserVisitor ) return ((ProofParserVisitor<? extends T>)visitor).visitRuleExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RuleExpressionContext ruleExpression() throws RecognitionException {
		RuleExpressionContext _localctx = new RuleExpressionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_ruleExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			ruleType();
			setState(125);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LIST_DELIM) {
				{
				{
				setState(121);
				match(LIST_DELIM);
				setState(122);
				((RuleExpressionContext)_localctx).NUMBER = match(NUMBER);
				((RuleExpressionContext)_localctx).lineNumbers.add(((RuleExpressionContext)_localctx).NUMBER);
				}
				}
				setState(127);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class PremiseContext extends ParserRuleContext {
		public SentenceContext sentence() {
			return getRuleContext(SentenceContext.class,0);
		}
		public TerminalNode LINE_DELIM() { return getToken(ProofParser.LINE_DELIM, 0); }
		public PremiseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_premise; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProofParserListener ) ((ProofParserListener)listener).enterPremise(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProofParserListener ) ((ProofParserListener)listener).exitPremise(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProofParserVisitor ) return ((ProofParserVisitor<? extends T>)visitor).visitPremise(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PremiseContext premise() throws RecognitionException {
		PremiseContext _localctx = new PremiseContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_premise);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			sentence(0);
			setState(129);
			match(LINE_DELIM);
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

	public static class ConclusionContext extends ParserRuleContext {
		public SentenceContext sentence() {
			return getRuleContext(SentenceContext.class,0);
		}
		public TerminalNode RULE_START() { return getToken(ProofParser.RULE_START, 0); }
		public RuleExpressionContext ruleExpression() {
			return getRuleContext(RuleExpressionContext.class,0);
		}
		public TerminalNode RULE_END() { return getToken(ProofParser.RULE_END, 0); }
		public ConclusionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conclusion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProofParserListener ) ((ProofParserListener)listener).enterConclusion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProofParserListener ) ((ProofParserListener)listener).exitConclusion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProofParserVisitor ) return ((ProofParserVisitor<? extends T>)visitor).visitConclusion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConclusionContext conclusion() throws RecognitionException {
		ConclusionContext _localctx = new ConclusionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_conclusion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			sentence(0);
			setState(132);
			match(RULE_START);
			setState(133);
			ruleExpression();
			setState(134);
			match(RULE_END);
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

	public static class ProofConstructContext extends ParserRuleContext {
		public Proof proofNode;
		public TerminalNode L_SBRACKET() { return getToken(ProofParser.L_SBRACKET, 0); }
		public TerminalNode R_SBRACKET() { return getToken(ProofParser.R_SBRACKET, 0); }
		public TerminalNode L_CBRACKET() { return getToken(ProofParser.L_CBRACKET, 0); }
		public TerminalNode R_CBRACKET() { return getToken(ProofParser.R_CBRACKET, 0); }
		public List<PremiseContext> premise() {
			return getRuleContexts(PremiseContext.class);
		}
		public PremiseContext premise(int i) {
			return getRuleContext(PremiseContext.class,i);
		}
		public List<ConclusionContext> conclusion() {
			return getRuleContexts(ConclusionContext.class);
		}
		public ConclusionContext conclusion(int i) {
			return getRuleContext(ConclusionContext.class,i);
		}
		public List<AssumptionContext> assumption() {
			return getRuleContexts(AssumptionContext.class);
		}
		public AssumptionContext assumption(int i) {
			return getRuleContext(AssumptionContext.class,i);
		}
		public ProofConstructContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_proofConstruct; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProofParserListener ) ((ProofParserListener)listener).enterProofConstruct(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProofParserListener ) ((ProofParserListener)listener).exitProofConstruct(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProofParserVisitor ) return ((ProofParserVisitor<? extends T>)visitor).visitProofConstruct(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProofConstructContext proofConstruct() throws RecognitionException {
		ProofConstructContext _localctx = new ProofConstructContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_proofConstruct);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			match(L_SBRACKET);
			setState(138); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(137);
				premise();
				}
				}
				setState(140); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NOT) | (1L << L_PBRACKET) | (1L << L_SBRACKET) | (1L << L_CBRACKET) | (1L << IDENTIFIER))) != 0) );
			setState(142);
			match(R_SBRACKET);
			setState(143);
			match(L_CBRACKET);
			setState(146); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(146);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case NOT:
				case L_PBRACKET:
				case L_SBRACKET:
				case L_CBRACKET:
				case IDENTIFIER:
					{
					setState(144);
					conclusion();
					}
					break;
				case ASSUME:
					{
					setState(145);
					assumption();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(148); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NOT) | (1L << ASSUME) | (1L << L_PBRACKET) | (1L << L_SBRACKET) | (1L << L_CBRACKET) | (1L << IDENTIFIER))) != 0) );
			setState(150);
			match(R_CBRACKET);
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

	public static class AssumptionContext extends ParserRuleContext {
		public TerminalNode ASSUME() { return getToken(ProofParser.ASSUME, 0); }
		public ProofConstructContext proofConstruct() {
			return getRuleContext(ProofConstructContext.class,0);
		}
		public AssumptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assumption; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProofParserListener ) ((ProofParserListener)listener).enterAssumption(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProofParserListener ) ((ProofParserListener)listener).exitAssumption(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProofParserVisitor ) return ((ProofParserVisitor<? extends T>)visitor).visitAssumption(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssumptionContext assumption() throws RecognitionException {
		AssumptionContext _localctx = new AssumptionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_assumption);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			match(ASSUME);
			setState(153);
			proofConstruct();
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

	public static class ProofContext extends ParserRuleContext {
		public TerminalNode PREMISES() { return getToken(ProofParser.PREMISES, 0); }
		public ProofConstructContext proofConstruct() {
			return getRuleContext(ProofConstructContext.class,0);
		}
		public ProofContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_proof; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProofParserListener ) ((ProofParserListener)listener).enterProof(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProofParserListener ) ((ProofParserListener)listener).exitProof(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProofParserVisitor ) return ((ProofParserVisitor<? extends T>)visitor).visitProof(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProofContext proof() throws RecognitionException {
		ProofContext _localctx = new ProofContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_proof);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			match(PREMISES);
			setState(156);
			proofConstruct();
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 7:
			return sentence_sempred((SentenceContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean sentence_sempred(SentenceContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\64\u00a1\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\3\2\3\3\3\3\3"+
		"\4\3\4\3\4\3\4\3\4\5\4*\n\4\3\5\3\5\5\5.\n\5\3\6\3\6\3\6\3\6\3\6\3\6\7"+
		"\6\66\n\6\f\6\16\69\13\6\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\b\3\b\7\bE"+
		"\n\b\f\b\16\bH\13\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5"+
		"\tV\n\t\3\t\3\t\3\t\3\t\7\t\\\n\t\f\t\16\t_\13\t\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\5\ny\n\n\3\13\3\13\3\13\7\13~\n\13\f\13\16\13\u0081\13\13\3\f\3\f"+
		"\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\6\16\u008d\n\16\r\16\16\16\u008e\3"+
		"\16\3\16\3\16\3\16\6\16\u0095\n\16\r\16\16\16\u0096\3\16\3\16\3\17\3\17"+
		"\3\17\3\20\3\20\3\20\3\20\2\3\20\21\2\4\6\b\n\f\16\20\22\24\26\30\32\34"+
		"\36\2\5\5\2\22\22\24\24\26\26\5\2\21\21\23\23\25\25\3\2\5\6\2\u00b7\2"+
		" \3\2\2\2\4\"\3\2\2\2\6)\3\2\2\2\b-\3\2\2\2\n/\3\2\2\2\f=\3\2\2\2\16?"+
		"\3\2\2\2\20U\3\2\2\2\22x\3\2\2\2\24z\3\2\2\2\26\u0082\3\2\2\2\30\u0085"+
		"\3\2\2\2\32\u008a\3\2\2\2\34\u009a\3\2\2\2\36\u009d\3\2\2\2 !\t\2\2\2"+
		"!\3\3\2\2\2\"#\t\3\2\2#\5\3\2\2\2$*\7\b\2\2%*\7\t\2\2&*\7\n\2\2\'*\7\13"+
		"\2\2(*\7\f\2\2)$\3\2\2\2)%\3\2\2\2)&\3\2\2\2)\'\3\2\2\2)(\3\2\2\2*\7\3"+
		"\2\2\2+.\7\7\2\2,.\5\n\6\2-+\3\2\2\2-,\3\2\2\2.\t\3\2\2\2/\60\5\2\2\2"+
		"\60\61\t\4\2\2\61\62\7\22\2\2\62\67\7\30\2\2\63\64\7\3\2\2\64\66\7\30"+
		"\2\2\65\63\3\2\2\2\669\3\2\2\2\67\65\3\2\2\2\678\3\2\2\28:\3\2\2\29\67"+
		"\3\2\2\2:;\7\21\2\2;<\5\4\3\2<\13\3\2\2\2=>\7\30\2\2>\r\3\2\2\2?@\7\30"+
		"\2\2@A\7\22\2\2AF\7\30\2\2BC\7\3\2\2CE\7\30\2\2DB\3\2\2\2EH\3\2\2\2FD"+
		"\3\2\2\2FG\3\2\2\2GI\3\2\2\2HF\3\2\2\2IJ\7\21\2\2J\17\3\2\2\2KL\b\t\1"+
		"\2LM\5\2\2\2MN\5\20\t\2NO\5\4\3\2OV\3\2\2\2PQ\5\b\5\2QR\5\20\t\6RV\3\2"+
		"\2\2SV\5\f\7\2TV\5\16\b\2UK\3\2\2\2UP\3\2\2\2US\3\2\2\2UT\3\2\2\2V]\3"+
		"\2\2\2WX\f\5\2\2XY\5\6\4\2YZ\5\20\t\6Z\\\3\2\2\2[W\3\2\2\2\\_\3\2\2\2"+
		"][\3\2\2\2]^\3\2\2\2^\21\3\2\2\2_]\3\2\2\2`y\7\32\2\2ay\7\33\2\2by\7\34"+
		"\2\2cy\7\35\2\2dy\7\36\2\2ey\7\37\2\2fy\7 \2\2gy\7!\2\2hy\7\"\2\2iy\7"+
		"#\2\2jy\7$\2\2ky\7%\2\2ly\7&\2\2my\7\'\2\2ny\7(\2\2oy\7)\2\2py\7*\2\2"+
		"qy\7+\2\2ry\7,\2\2sy\7-\2\2ty\7.\2\2uy\7/\2\2vy\7\60\2\2wy\7\61\2\2x`"+
		"\3\2\2\2xa\3\2\2\2xb\3\2\2\2xc\3\2\2\2xd\3\2\2\2xe\3\2\2\2xf\3\2\2\2x"+
		"g\3\2\2\2xh\3\2\2\2xi\3\2\2\2xj\3\2\2\2xk\3\2\2\2xl\3\2\2\2xm\3\2\2\2"+
		"xn\3\2\2\2xo\3\2\2\2xp\3\2\2\2xq\3\2\2\2xr\3\2\2\2xs\3\2\2\2xt\3\2\2\2"+
		"xu\3\2\2\2xv\3\2\2\2xw\3\2\2\2y\23\3\2\2\2z\177\5\22\n\2{|\7\3\2\2|~\7"+
		"\62\2\2}{\3\2\2\2~\u0081\3\2\2\2\177}\3\2\2\2\177\u0080\3\2\2\2\u0080"+
		"\25\3\2\2\2\u0081\177\3\2\2\2\u0082\u0083\5\20\t\2\u0083\u0084\7\4\2\2"+
		"\u0084\27\3\2\2\2\u0085\u0086\5\20\t\2\u0086\u0087\7\27\2\2\u0087\u0088"+
		"\5\24\13\2\u0088\u0089\7\63\2\2\u0089\31\3\2\2\2\u008a\u008c\7\24\2\2"+
		"\u008b\u008d\5\26\f\2\u008c\u008b\3\2\2\2\u008d\u008e\3\2\2\2\u008e\u008c"+
		"\3\2\2\2\u008e\u008f\3\2\2\2\u008f\u0090\3\2\2\2\u0090\u0091\7\23\2\2"+
		"\u0091\u0094\7\26\2\2\u0092\u0095\5\30\r\2\u0093\u0095\5\34\17\2\u0094"+
		"\u0092\3\2\2\2\u0094\u0093\3\2\2\2\u0095\u0096\3\2\2\2\u0096\u0094\3\2"+
		"\2\2\u0096\u0097\3\2\2\2\u0097\u0098\3\2\2\2\u0098\u0099\7\25\2\2\u0099"+
		"\33\3\2\2\2\u009a\u009b\7\17\2\2\u009b\u009c\5\32\16\2\u009c\35\3\2\2"+
		"\2\u009d\u009e\7\20\2\2\u009e\u009f\5\32\16\2\u009f\37\3\2\2\2\r)-\67"+
		"FU]x\177\u008e\u0094\u0096";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
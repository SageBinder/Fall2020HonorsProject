// Generated from C:/Users/Sage/IdeaProjects/Fall2020HonorsProject/src/sage/grammars\ProofParser.g4 by ANTLR 4.8
package sage.java.antlrparser;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.ParserATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;
import org.antlr.v4.runtime.tree.TerminalNode;
import sage.java.nodes.base.Node;
import sage.java.proof.Proof;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ProofParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		RULE=1, LIST_DELIM=2, LINE_DELIM=3, U_QUANT=4, E_QUANT=5, NOT=6, AND=7, 
		NAND=8, OR=9, IF=10, IFF=11, TAUTOLOGY=12, CONTRADICTION=13, ASSUME=14, 
		PREMISES=15, R_PBRACKET=16, L_PBRACKET=17, R_SBRACKET=18, L_SBRACKET=19, 
		R_CBRACKET=20, L_CBRACKET=21, IDENTIFIER=22, NUMBER=23, UNICODE_WS=24;
	public static final int
		RULE_lbracket = 0, RULE_rbracket = 1, RULE_binaryOp = 2, RULE_rightOp = 3, 
		RULE_quant = 4, RULE_boolVar = 5, RULE_predicate = 6, RULE_sentence = 7, 
		RULE_logicRule = 8, RULE_premise = 9, RULE_conclusion = 10, RULE_proofConstruct = 11, 
		RULE_assumption = 12, RULE_proof = 13;
	private static String[] makeRuleNames() {
		return new String[] {
			"lbracket", "rbracket", "binaryOp", "rightOp", "quant", "boolVar", "predicate", 
			"sentence", "logicRule", "premise", "conclusion", "proofConstruct", "assumption", 
			"proof"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'DC'", "','", "';'", null, null, null, null, "'.'", null, null, 
			null, null, null, "'assume'", "'premises'", "')'", "'('", "']'", "'['", 
			"'}'", "'{'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "RULE", "LIST_DELIM", "LINE_DELIM", "U_QUANT", "E_QUANT", "NOT", 
			"AND", "NAND", "OR", "IF", "IFF", "TAUTOLOGY", "CONTRADICTION", "ASSUME", 
			"PREMISES", "R_PBRACKET", "L_PBRACKET", "R_SBRACKET", "L_SBRACKET", "R_CBRACKET", 
			"L_CBRACKET", "IDENTIFIER", "NUMBER", "UNICODE_WS"
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
			setState(28);
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
			setState(30);
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
			setState(37);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AND:
				_localctx = new ANDContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(32);
				match(AND);
				}
				break;
			case NAND:
				_localctx = new NANDContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(33);
				match(NAND);
				}
				break;
			case OR:
				_localctx = new ORContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(34);
				match(OR);
				}
				break;
			case IF:
				_localctx = new IFContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(35);
				match(IF);
				}
				break;
			case IFF:
				_localctx = new IFFContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(36);
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
			setState(41);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NOT:
				_localctx = new NOTContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(39);
				((NOTContext)_localctx).opToken = match(NOT);
				}
				break;
			case L_PBRACKET:
			case L_SBRACKET:
			case L_CBRACKET:
				_localctx = new QUANTIFIERContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(40);
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
			setState(43);
			lbracket();
			setState(44);
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
			setState(45);
			match(L_PBRACKET);
			setState(46);
			((QuantContext)_localctx).IDENTIFIER = match(IDENTIFIER);
			((QuantContext)_localctx).variables.add(((QuantContext)_localctx).IDENTIFIER);
			setState(51);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LIST_DELIM) {
				{
				{
				setState(47);
				match(LIST_DELIM);
				setState(48);
				((QuantContext)_localctx).IDENTIFIER = match(IDENTIFIER);
				((QuantContext)_localctx).variables.add(((QuantContext)_localctx).IDENTIFIER);
				}
				}
				setState(53);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(54);
			match(R_PBRACKET);
			setState(55);
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
			setState(57);
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
			setState(59);
			((PredicateContext)_localctx).predicateName = match(IDENTIFIER);
			setState(60);
			match(L_PBRACKET);
			setState(61);
			((PredicateContext)_localctx).IDENTIFIER = match(IDENTIFIER);
			((PredicateContext)_localctx).predicateVars.add(((PredicateContext)_localctx).IDENTIFIER);
			setState(66);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LIST_DELIM) {
				{
				{
				setState(62);
				match(LIST_DELIM);
				setState(63);
				((PredicateContext)_localctx).IDENTIFIER = match(IDENTIFIER);
				((PredicateContext)_localctx).predicateVars.add(((PredicateContext)_localctx).IDENTIFIER);
				}
				}
				setState(68);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(69);
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
	public static class BinaryOpExpressionContext extends SentenceContext {
		public SentenceContext exp1;
		public BinaryOpContext op;
		public SentenceContext exp2;
		public List<SentenceContext> sentence() {
			return getRuleContexts(SentenceContext.class);
		}
		public SentenceContext sentence(int i) {
			return getRuleContext(SentenceContext.class,i);
		}
		public BinaryOpContext binaryOp() {
			return getRuleContext(BinaryOpContext.class,0);
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
		public SentenceContext exp;
		public LbracketContext lbracket() {
			return getRuleContext(LbracketContext.class,0);
		}
		public RbracketContext rbracket() {
			return getRuleContext(RbracketContext.class,0);
		}
		public SentenceContext sentence() {
			return getRuleContext(SentenceContext.class,0);
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
	public static class BoolVarExpresionContext extends SentenceContext {
		public BoolVarContext boolVar() {
			return getRuleContext(BoolVarContext.class,0);
		}
		public BoolVarExpresionContext(SentenceContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProofParserListener ) ((ProofParserListener)listener).enterBoolVarExpresion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProofParserListener ) ((ProofParserListener)listener).exitBoolVarExpresion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProofParserVisitor ) return ((ProofParserVisitor<? extends T>)visitor).visitBoolVarExpresion(this);
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
		public RightOpContext op;
		public SentenceContext exp;
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
			setState(81);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				_localctx = new BracketedExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(72);
				lbracket();
				setState(73);
				((BracketedExpressionContext)_localctx).exp = sentence(0);
				setState(74);
				rbracket();
				}
				break;
			case 2:
				{
				_localctx = new RightOpExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(76);
				((RightOpExpressionContext)_localctx).op = rightOp();
				setState(77);
				((RightOpExpressionContext)_localctx).exp = sentence(4);
				}
				break;
			case 3:
				{
				_localctx = new BoolVarExpresionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(79);
				boolVar();
				}
				break;
			case 4:
				{
				_localctx = new PredicateExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(80);
				predicate();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(89);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new BinaryOpExpressionContext(new SentenceContext(_parentctx, _parentState));
					((BinaryOpExpressionContext)_localctx).exp1 = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_sentence);
					setState(83);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(84);
					((BinaryOpExpressionContext)_localctx).op = binaryOp();
					setState(85);
					((BinaryOpExpressionContext)_localctx).exp2 = sentence(4);
					}
					} 
				}
				setState(91);
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

	public static class LogicRuleContext extends ParserRuleContext {
		public TerminalNode RULE() { return getToken(ProofParser.RULE, 0); }
		public LogicRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProofParserListener ) ((ProofParserListener)listener).enterLogicRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProofParserListener ) ((ProofParserListener)listener).exitLogicRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProofParserVisitor ) return ((ProofParserVisitor<? extends T>)visitor).visitLogicRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicRuleContext logicRule() throws RecognitionException {
		LogicRuleContext _localctx = new LogicRuleContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_logicRule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			match(RULE);
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
		enterRule(_localctx, 18, RULE_premise);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			sentence(0);
			setState(95);
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
		public List<TerminalNode> LINE_DELIM() { return getTokens(ProofParser.LINE_DELIM); }
		public TerminalNode LINE_DELIM(int i) {
			return getToken(ProofParser.LINE_DELIM, i);
		}
		public LogicRuleContext logicRule() {
			return getRuleContext(LogicRuleContext.class,0);
		}
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
		enterRule(_localctx, 20, RULE_conclusion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			sentence(0);
			setState(98);
			match(LINE_DELIM);
			setState(99);
			logicRule();
			setState(100);
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
		enterRule(_localctx, 22, RULE_proofConstruct);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			match(L_SBRACKET);
			setState(104); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(103);
				premise();
				}
				}
				setState(106); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NOT) | (1L << L_PBRACKET) | (1L << L_SBRACKET) | (1L << L_CBRACKET) | (1L << IDENTIFIER))) != 0) );
			setState(108);
			match(R_SBRACKET);
			setState(109);
			match(L_CBRACKET);
			setState(112); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(112);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case NOT:
				case L_PBRACKET:
				case L_SBRACKET:
				case L_CBRACKET:
				case IDENTIFIER:
					{
					setState(110);
					conclusion();
					}
					break;
				case ASSUME:
					{
					setState(111);
					assumption();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(114); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NOT) | (1L << ASSUME) | (1L << L_PBRACKET) | (1L << L_SBRACKET) | (1L << L_CBRACKET) | (1L << IDENTIFIER))) != 0) );
			setState(116);
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
		enterRule(_localctx, 24, RULE_assumption);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			match(ASSUME);
			setState(119);
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
		enterRule(_localctx, 26, RULE_proof);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			match(PREMISES);
			setState(122);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\32\177\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3"+
		"\4\3\4\5\4(\n\4\3\5\3\5\5\5,\n\5\3\6\3\6\3\6\3\6\3\6\3\6\7\6\64\n\6\f"+
		"\6\16\6\67\13\6\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\b\3\b\7\bC\n\b\f\b\16"+
		"\bF\13\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\tT\n\t\3\t"+
		"\3\t\3\t\3\t\7\tZ\n\t\f\t\16\t]\13\t\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3"+
		"\f\3\f\3\f\3\r\3\r\6\rk\n\r\r\r\16\rl\3\r\3\r\3\r\3\r\6\rs\n\r\r\r\16"+
		"\rt\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17\3\17\2\3\20\20\2\4\6\b\n\f\16"+
		"\20\22\24\26\30\32\34\2\5\5\2\23\23\25\25\27\27\5\2\22\22\24\24\26\26"+
		"\3\2\6\7\2~\2\36\3\2\2\2\4 \3\2\2\2\6\'\3\2\2\2\b+\3\2\2\2\n-\3\2\2\2"+
		"\f;\3\2\2\2\16=\3\2\2\2\20S\3\2\2\2\22^\3\2\2\2\24`\3\2\2\2\26c\3\2\2"+
		"\2\30h\3\2\2\2\32x\3\2\2\2\34{\3\2\2\2\36\37\t\2\2\2\37\3\3\2\2\2 !\t"+
		"\3\2\2!\5\3\2\2\2\"(\7\t\2\2#(\7\n\2\2$(\7\13\2\2%(\7\f\2\2&(\7\r\2\2"+
		"\'\"\3\2\2\2\'#\3\2\2\2\'$\3\2\2\2\'%\3\2\2\2\'&\3\2\2\2(\7\3\2\2\2),"+
		"\7\b\2\2*,\5\n\6\2+)\3\2\2\2+*\3\2\2\2,\t\3\2\2\2-.\5\2\2\2./\t\4\2\2"+
		"/\60\7\23\2\2\60\65\7\30\2\2\61\62\7\4\2\2\62\64\7\30\2\2\63\61\3\2\2"+
		"\2\64\67\3\2\2\2\65\63\3\2\2\2\65\66\3\2\2\2\668\3\2\2\2\67\65\3\2\2\2"+
		"89\7\22\2\29:\5\4\3\2:\13\3\2\2\2;<\7\30\2\2<\r\3\2\2\2=>\7\30\2\2>?\7"+
		"\23\2\2?D\7\30\2\2@A\7\4\2\2AC\7\30\2\2B@\3\2\2\2CF\3\2\2\2DB\3\2\2\2"+
		"DE\3\2\2\2EG\3\2\2\2FD\3\2\2\2GH\7\22\2\2H\17\3\2\2\2IJ\b\t\1\2JK\5\2"+
		"\2\2KL\5\20\t\2LM\5\4\3\2MT\3\2\2\2NO\5\b\5\2OP\5\20\t\6PT\3\2\2\2QT\5"+
		"\f\7\2RT\5\16\b\2SI\3\2\2\2SN\3\2\2\2SQ\3\2\2\2SR\3\2\2\2T[\3\2\2\2UV"+
		"\f\5\2\2VW\5\6\4\2WX\5\20\t\6XZ\3\2\2\2YU\3\2\2\2Z]\3\2\2\2[Y\3\2\2\2"+
		"[\\\3\2\2\2\\\21\3\2\2\2][\3\2\2\2^_\7\3\2\2_\23\3\2\2\2`a\5\20\t\2ab"+
		"\7\5\2\2b\25\3\2\2\2cd\5\20\t\2de\7\5\2\2ef\5\22\n\2fg\7\5\2\2g\27\3\2"+
		"\2\2hj\7\25\2\2ik\5\24\13\2ji\3\2\2\2kl\3\2\2\2lj\3\2\2\2lm\3\2\2\2mn"+
		"\3\2\2\2no\7\24\2\2or\7\27\2\2ps\5\26\f\2qs\5\32\16\2rp\3\2\2\2rq\3\2"+
		"\2\2st\3\2\2\2tr\3\2\2\2tu\3\2\2\2uv\3\2\2\2vw\7\26\2\2w\31\3\2\2\2xy"+
		"\7\20\2\2yz\5\30\r\2z\33\3\2\2\2{|\7\21\2\2|}\5\30\r\2}\35\3\2\2\2\13"+
		"\'+\65DS[lrt";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
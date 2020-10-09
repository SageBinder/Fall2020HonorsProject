// Generated from C:/Users/Sage/IdeaProjects/Fall2020HonorsProject/src/sage/grammars\ExpressionLexer.g4 by ANTLR 4.8
package sage.grammars;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ExpressionLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		LIST_DELIM=1, U_QUANT=2, E_QUANT=3, NOT=4, AND=5, NAND=6, OR=7, IF=8, 
		IFF=9, TAUTOLOGY=10, CONTRADICTION=11, RBRACKET=12, LBRACKET=13, IDENTIFIER=14, 
		UNICODE_WS=15;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"LIST_DELIM", "U_QUANT", "E_QUANT", "NOT", "AND", "NAND", "OR", "IF", 
			"IFF", "TAUTOLOGY", "CONTRADICTION", "RBRACKET", "LBRACKET", "IDENTIFIER", 
			"UNICODE_WS"
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


	public ExpressionLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "ExpressionLexer.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\21V\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\3\2\3\3\3\3\3\4"+
		"\3\4\3\5\3\5\3\6\3\6\3\6\5\6-\n\6\3\7\3\7\3\b\3\b\3\b\5\b\64\n\b\3\t\3"+
		"\t\3\t\5\t9\n\t\3\n\3\n\3\n\5\n>\n\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3"+
		"\16\3\17\6\17I\n\17\r\17\16\17J\3\17\7\17N\n\17\f\17\16\17Q\13\17\3\20"+
		"\3\20\3\20\3\20\2\2\21\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27"+
		"\r\31\16\33\17\35\20\37\21\3\2\20\6\2,,\u00e4\u00e4\u02c8\u02c8\u20ae"+
		"\u20ae\6\2--\u00e4\u00e4\u0194\u0194\u02c8\u02c8\b\2##\u0080\u0080\u00ae"+
		"\u00ae\u00c4\u00c4\u00cd\u00cd\u0155\u0155\6\2((\u00a9\u00a9\u00e4\u00e4"+
		"\u02c8\u02c8\b\2--~~\u00a7\u00a7\u00aa\u00aa\u00e4\u00e4\u02c8\u02c8\b"+
		"\2@@\u00e4\u00e4\u0162\u0162\u0194\u0194\u201b\u201b\u2022\u2023\b\2?"+
		"?\u00a3\u00a3\u00e4\u00e4\u201f\u201f\u2022\u2023\u2032\u2032\6\2\63\63"+
		"\u00a6\u00a6\u00e4\u00e4\u0162\u0162\6\2\62\62\u00a7\u00a7\u00e4\u00e4"+
		"\u0162\u0162\5\2++__\177\177\5\2**]]}}\5\2C\\aac|\6\2\62;C\\aac|\f\2\13"+
		"\17\"\"\u0087\u0087\u00a2\u00a2\u1682\u1682\u2002\u200c\u202a\u202b\u2031"+
		"\u2031\u2061\u2061\u3002\u3002\2[\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2"+
		"\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3"+
		"\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2"+
		"\2\2\37\3\2\2\2\3!\3\2\2\2\5#\3\2\2\2\7%\3\2\2\2\t\'\3\2\2\2\13,\3\2\2"+
		"\2\r.\3\2\2\2\17\63\3\2\2\2\218\3\2\2\2\23=\3\2\2\2\25?\3\2\2\2\27A\3"+
		"\2\2\2\31C\3\2\2\2\33E\3\2\2\2\35H\3\2\2\2\37R\3\2\2\2!\"\7.\2\2\"\4\3"+
		"\2\2\2#$\t\2\2\2$\6\3\2\2\2%&\t\3\2\2&\b\3\2\2\2\'(\t\4\2\2(\n\3\2\2\2"+
		")-\t\5\2\2*+\7(\2\2+-\7(\2\2,)\3\2\2\2,*\3\2\2\2-\f\3\2\2\2./\7\60\2\2"+
		"/\16\3\2\2\2\60\64\t\6\2\2\61\62\7~\2\2\62\64\7~\2\2\63\60\3\2\2\2\63"+
		"\61\3\2\2\2\64\20\3\2\2\2\659\t\7\2\2\66\67\7/\2\2\679\7@\2\28\65\3\2"+
		"\2\28\66\3\2\2\29\22\3\2\2\2:>\t\b\2\2;<\7?\2\2<>\7?\2\2=:\3\2\2\2=;\3"+
		"\2\2\2>\24\3\2\2\2?@\t\t\2\2@\26\3\2\2\2AB\t\n\2\2B\30\3\2\2\2CD\t\13"+
		"\2\2D\32\3\2\2\2EF\t\f\2\2F\34\3\2\2\2GI\t\r\2\2HG\3\2\2\2IJ\3\2\2\2J"+
		"H\3\2\2\2JK\3\2\2\2KO\3\2\2\2LN\t\16\2\2ML\3\2\2\2NQ\3\2\2\2OM\3\2\2\2"+
		"OP\3\2\2\2P\36\3\2\2\2QO\3\2\2\2RS\t\17\2\2ST\3\2\2\2TU\b\20\2\2U \3\2"+
		"\2\2\t\2,\638=JO\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
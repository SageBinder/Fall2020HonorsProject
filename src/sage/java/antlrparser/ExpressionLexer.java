// Generated from C:/Users/Sage/IdeaProjects/Fall2020HonorsProject/src/sage/grammars\ExpressionLexer.g4 by ANTLR 4.8
package sage.java.antlrparser;
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\21^\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\3\2\3\3\3\3\3\4"+
		"\3\4\3\5\3\5\3\6\3\6\3\6\5\6-\n\6\3\7\3\7\3\b\3\b\3\b\5\b\64\n\b\3\t\3"+
		"\t\3\t\3\t\3\t\5\t;\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\nF\n\n\3"+
		"\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\6\17Q\n\17\r\17\16\17R\3\17\7"+
		"\17V\n\17\f\17\16\17Y\13\17\3\20\3\20\3\20\3\20\2\2\21\3\3\5\4\7\5\t\6"+
		"\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21\3\2\20\4\2"+
		",,\u2202\u2202\4\2--\u2205\u2205\6\2##\u0080\u0080\u00ae\u00ae\u02de\u02de"+
		"\4\2((\u2229\u2229\6\2--~~\u2227\u2227\u222a\u222a\6\2@@\u2194\u2194\u21d4"+
		"\u21d4\u2285\u2285\6\2??\u2196\u2196\u21d6\u21d6\u2263\u2263\4\2\63\63"+
		"\u22a6\u22a6\4\2\62\62\u22a7\u22a7\5\2++__\177\177\5\2**]]}}\5\2C\\aa"+
		"c|\6\2\62;C\\aac|\f\2\13\17\"\"\u0087\u0087\u00a2\u00a2\u1682\u1682\u2002"+
		"\u200c\u202a\u202b\u2031\u2031\u2061\u2061\u3002\u3002\2f\2\3\3\2\2\2"+
		"\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2"+
		"\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2"+
		"\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\3!\3\2\2\2\5#\3\2\2\2\7%\3\2\2"+
		"\2\t\'\3\2\2\2\13,\3\2\2\2\r.\3\2\2\2\17\63\3\2\2\2\21:\3\2\2\2\23E\3"+
		"\2\2\2\25G\3\2\2\2\27I\3\2\2\2\31K\3\2\2\2\33M\3\2\2\2\35P\3\2\2\2\37"+
		"Z\3\2\2\2!\"\7.\2\2\"\4\3\2\2\2#$\t\2\2\2$\6\3\2\2\2%&\t\3\2\2&\b\3\2"+
		"\2\2\'(\t\4\2\2(\n\3\2\2\2)-\t\5\2\2*+\7(\2\2+-\7(\2\2,)\3\2\2\2,*\3\2"+
		"\2\2-\f\3\2\2\2./\7\60\2\2/\16\3\2\2\2\60\64\t\6\2\2\61\62\7~\2\2\62\64"+
		"\7~\2\2\63\60\3\2\2\2\63\61\3\2\2\2\64\20\3\2\2\2\65;\t\7\2\2\66\67\7"+
		"/\2\2\67;\7@\2\289\7?\2\29;\7@\2\2:\65\3\2\2\2:\66\3\2\2\2:8\3\2\2\2;"+
		"\22\3\2\2\2<F\t\b\2\2=>\7?\2\2>F\7?\2\2?@\7>\2\2@A\7?\2\2AF\7@\2\2BC\7"+
		">\2\2CD\7/\2\2DF\7@\2\2E<\3\2\2\2E=\3\2\2\2E?\3\2\2\2EB\3\2\2\2F\24\3"+
		"\2\2\2GH\t\t\2\2H\26\3\2\2\2IJ\t\n\2\2J\30\3\2\2\2KL\t\13\2\2L\32\3\2"+
		"\2\2MN\t\f\2\2N\34\3\2\2\2OQ\t\r\2\2PO\3\2\2\2QR\3\2\2\2RP\3\2\2\2RS\3"+
		"\2\2\2SW\3\2\2\2TV\t\16\2\2UT\3\2\2\2VY\3\2\2\2WU\3\2\2\2WX\3\2\2\2X\36"+
		"\3\2\2\2YW\3\2\2\2Z[\t\17\2\2[\\\3\2\2\2\\]\b\20\2\2] \3\2\2\2\t\2,\63"+
		":ERW\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
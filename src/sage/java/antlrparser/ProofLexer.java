// Generated from C:/Users/Sage/IdeaProjects/Fall2020HonorsProject/src/sage/grammars\ProofLexer.g4 by ANTLR 4.8
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
public class ProofLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		RULE=1, LIST_DELIM=2, LINE_DELIM=3, U_QUANT=4, E_QUANT=5, NOT=6, AND=7, 
		NAND=8, OR=9, IF=10, IFF=11, TAUTOLOGY=12, CONTRADICTION=13, ASSUME=14, 
		PREMISES=15, R_PBRACKET=16, L_PBRACKET=17, R_SBRACKET=18, L_SBRACKET=19, 
		R_CBRACKET=20, L_CBRACKET=21, IDENTIFIER=22, NUMBER=23, UNICODE_WS=24;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"RULE", "LIST_DELIM", "LINE_DELIM", "U_QUANT", "E_QUANT", "NOT", "AND", 
			"NAND", "OR", "IF", "IFF", "TAUTOLOGY", "CONTRADICTION", "ASSUME", "PREMISES", 
			"R_PBRACKET", "L_PBRACKET", "R_SBRACKET", "L_SBRACKET", "R_CBRACKET", 
			"L_CBRACKET", "IDENTIFIER", "NUMBER", "UNICODE_WS"
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


	public ProofLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "ProofLexer.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\32\u0092\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b"+
		"\5\bD\n\b\3\t\3\t\3\n\3\n\3\n\5\nK\n\n\3\13\3\13\3\13\3\13\3\13\5\13R"+
		"\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f]\n\f\3\r\3\r\3\16\3\16\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3"+
		"\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3"+
		"\27\6\27\u0080\n\27\r\27\16\27\u0081\3\27\7\27\u0085\n\27\f\27\16\27\u0088"+
		"\13\27\3\30\6\30\u008b\n\30\r\30\16\30\u008c\3\31\3\31\3\31\3\31\2\2\32"+
		"\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20"+
		"\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\3\2\17\6\2,,\u00e4\u00e4"+
		"\u02c8\u02c8\u20ae\u20ae\6\2--\u00e4\u00e4\u0194\u0194\u02c8\u02c8\b\2"+
		"##\u0080\u0080\u00ae\u00ae\u00c4\u00c4\u00cd\u00cd\u0155\u0155\6\2((\u00a9"+
		"\u00a9\u00e4\u00e4\u02c8\u02c8\7\2~~\u00a7\u00a7\u00aa\u00aa\u00e4\u00e4"+
		"\u02c8\u02c8\b\2@@\u00e4\u00e4\u0162\u0162\u0194\u0194\u201b\u201b\u2022"+
		"\u2023\b\2??\u00a3\u00a3\u00e4\u00e4\u201f\u201f\u2022\u2023\u2032\u2032"+
		"\6\2\63\63\u00a6\u00a6\u00e4\u00e4\u0162\u0162\6\2\62\62\u00a7\u00a7\u00e4"+
		"\u00e4\u0162\u0162\5\2C\\aac|\6\2\62;C\\aac|\3\2\62;\f\2\13\17\"\"\u0087"+
		"\u0087\u00a2\u00a2\u1682\u1682\u2002\u200c\u202a\u202b\u2031\u2031\u2061"+
		"\u2061\u3002\u3002\2\u009b\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2"+
		"\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2"+
		"\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3"+
		"\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2"+
		"\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\3\63\3\2\2\2\5\66\3\2\2\2\78\3"+
		"\2\2\2\t:\3\2\2\2\13<\3\2\2\2\r>\3\2\2\2\17C\3\2\2\2\21E\3\2\2\2\23J\3"+
		"\2\2\2\25Q\3\2\2\2\27\\\3\2\2\2\31^\3\2\2\2\33`\3\2\2\2\35b\3\2\2\2\37"+
		"i\3\2\2\2!r\3\2\2\2#t\3\2\2\2%v\3\2\2\2\'x\3\2\2\2)z\3\2\2\2+|\3\2\2\2"+
		"-\177\3\2\2\2/\u008a\3\2\2\2\61\u008e\3\2\2\2\63\64\7F\2\2\64\65\7E\2"+
		"\2\65\4\3\2\2\2\66\67\7.\2\2\67\6\3\2\2\289\7=\2\29\b\3\2\2\2:;\t\2\2"+
		"\2;\n\3\2\2\2<=\t\3\2\2=\f\3\2\2\2>?\t\4\2\2?\16\3\2\2\2@D\t\5\2\2AB\7"+
		"(\2\2BD\7(\2\2C@\3\2\2\2CA\3\2\2\2D\20\3\2\2\2EF\7\60\2\2F\22\3\2\2\2"+
		"GK\t\6\2\2HI\7~\2\2IK\7~\2\2JG\3\2\2\2JH\3\2\2\2K\24\3\2\2\2LR\t\7\2\2"+
		"MN\7/\2\2NR\7@\2\2OP\7?\2\2PR\7@\2\2QL\3\2\2\2QM\3\2\2\2QO\3\2\2\2R\26"+
		"\3\2\2\2S]\t\b\2\2TU\7?\2\2U]\7?\2\2VW\7>\2\2WX\7?\2\2X]\7@\2\2YZ\7>\2"+
		"\2Z[\7/\2\2[]\7@\2\2\\S\3\2\2\2\\T\3\2\2\2\\V\3\2\2\2\\Y\3\2\2\2]\30\3"+
		"\2\2\2^_\t\t\2\2_\32\3\2\2\2`a\t\n\2\2a\34\3\2\2\2bc\7c\2\2cd\7u\2\2d"+
		"e\7u\2\2ef\7w\2\2fg\7o\2\2gh\7g\2\2h\36\3\2\2\2ij\7r\2\2jk\7t\2\2kl\7"+
		"g\2\2lm\7o\2\2mn\7k\2\2no\7u\2\2op\7g\2\2pq\7u\2\2q \3\2\2\2rs\7+\2\2"+
		"s\"\3\2\2\2tu\7*\2\2u$\3\2\2\2vw\7_\2\2w&\3\2\2\2xy\7]\2\2y(\3\2\2\2z"+
		"{\7\177\2\2{*\3\2\2\2|}\7}\2\2},\3\2\2\2~\u0080\t\13\2\2\177~\3\2\2\2"+
		"\u0080\u0081\3\2\2\2\u0081\177\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u0086"+
		"\3\2\2\2\u0083\u0085\t\f\2\2\u0084\u0083\3\2\2\2\u0085\u0088\3\2\2\2\u0086"+
		"\u0084\3\2\2\2\u0086\u0087\3\2\2\2\u0087.\3\2\2\2\u0088\u0086\3\2\2\2"+
		"\u0089\u008b\t\r\2\2\u008a\u0089\3\2\2\2\u008b\u008c\3\2\2\2\u008c\u008a"+
		"\3\2\2\2\u008c\u008d\3\2\2\2\u008d\60\3\2\2\2\u008e\u008f\t\16\2\2\u008f"+
		"\u0090\3\2\2\2\u0090\u0091\b\31\2\2\u0091\62\3\2\2\2\n\2CJQ\\\u0081\u0086"+
		"\u008c\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
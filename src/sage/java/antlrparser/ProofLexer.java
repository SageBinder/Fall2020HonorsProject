// Generated from C:/Users/Sage/IdeaProjects/Fall2020HonorsProject/src/sage/grammars\ProofLexer.g4 by ANTLR 4.9.2
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
		RULE_MODE=1;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE", "RULE_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"LIST_DELIM", "LINE_DELIM", "U_QUANT", "E_QUANT", "NOT", "AND", "NAND", 
			"OR", "IF", "IFF", "TAUTOLOGY", "CONTRADICTION", "ASSUME", "PREMISES", 
			"R_PBRACKET", "L_PBRACKET", "R_SBRACKET", "L_SBRACKET", "R_CBRACKET", 
			"L_CBRACKET", "RULE_START", "IDENTIFIER", "UNICODE_WS", "CONJ_INTRO", 
			"CONJ_ELIM", "DISJ_INTRO", "DISJ_ELIM", "COND_INTRO", "COND_ELIM", "BICOND_INTRO", 
			"BICOND_ELIM", "NEG_INTRO", "NEG_ELIM", "U_INTRO", "U_ELIM", "E_INTRO", 
			"E_ELIM", "AC", "RD", "W", "DC", "CD", "DM", "CP", "C", "R", "TC", "NUMBER", 
			"RULE_LIST_DELIM", "RULE_END", "RULE_UNICODE_WS"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\64\u012d\b\1\b\1"+
		"\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t"+
		"\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4"+
		"\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4"+
		"\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4"+
		" \t \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4"+
		"+\t+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4"+
		"\64\t\64\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\5\6t\n\6\3\7\3\7\3\7\3\7"+
		"\5\7z\n\7\3\b\3\b\3\t\3\t\3\t\3\t\5\t\u0082\n\t\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\5\n\u008a\n\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\5\13\u0098\n\13\3\f\3\f\3\f\3\f\3\f\5\f\u009f\n\f\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\5\r\u00a7\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23"+
		"\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\26\3\26\3\27\6\27\u00ca\n\27\r\27"+
		"\16\27\u00cb\3\27\7\27\u00cf\n\27\f\27\16\27\u00d2\13\27\3\30\3\30\3\30"+
		"\3\30\3\31\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3\33\3\34\3\34\3\34\3\35"+
		"\3\35\3\35\3\36\3\36\3\36\3\37\3\37\3\37\3 \3 \3 \3!\3!\3!\3\"\3\"\3\""+
		"\3#\3#\3#\3$\3$\3$\3%\3%\3%\3&\3&\3&\3\'\3\'\3\'\3(\3(\3(\3)\3)\3*\3*"+
		"\3*\3+\3+\3+\3,\3,\3,\3-\3-\3-\3.\3.\3/\3/\3\60\3\60\3\60\3\61\6\61\u011e"+
		"\n\61\r\61\16\61\u011f\3\62\3\62\3\62\3\62\3\63\3\63\3\63\3\63\3\64\3"+
		"\64\3\64\3\64\2\2\65\4\3\6\4\b\5\n\6\f\7\16\b\20\t\22\n\24\13\26\f\30"+
		"\r\32\16\34\17\36\20 \21\"\22$\23&\24(\25*\26,\27.\30\60\31\62\32\64\33"+
		"\66\348\35:\36<\37> @!B\"D#F$H%J&L\'N(P)R*T+V,X-Z.\\/^\60`\61b\62d\2f"+
		"\63h\64\4\2\3\r\4\2,,\u2202\u2202\4\2--\u2205\u2205\6\2##\u0080\u0080"+
		"\u00ae\u00ae\u02de\u02de\4\2\60\60\u2229\u2229\4\2\u2227\u2227\u222a\u222a"+
		"\5\2\u2194\u2194\u21d4\u21d4\u2285\u2285\5\2\u2196\u2196\u21d6\u21d6\u2263"+
		"\u2263\5\2C\\aac|\6\2\62;C\\aac|\f\2\13\17\"\"\u0087\u0087\u00a2\u00a2"+
		"\u1682\u1682\u2002\u200c\u202a\u202b\u2031\u2031\u2061\u2061\u3002\u3002"+
		"\3\2\62;\2\u013c\2\4\3\2\2\2\2\6\3\2\2\2\2\b\3\2\2\2\2\n\3\2\2\2\2\f\3"+
		"\2\2\2\2\16\3\2\2\2\2\20\3\2\2\2\2\22\3\2\2\2\2\24\3\2\2\2\2\26\3\2\2"+
		"\2\2\30\3\2\2\2\2\32\3\2\2\2\2\34\3\2\2\2\2\36\3\2\2\2\2 \3\2\2\2\2\""+
		"\3\2\2\2\2$\3\2\2\2\2&\3\2\2\2\2(\3\2\2\2\2*\3\2\2\2\2,\3\2\2\2\2.\3\2"+
		"\2\2\2\60\3\2\2\2\3\62\3\2\2\2\3\64\3\2\2\2\3\66\3\2\2\2\38\3\2\2\2\3"+
		":\3\2\2\2\3<\3\2\2\2\3>\3\2\2\2\3@\3\2\2\2\3B\3\2\2\2\3D\3\2\2\2\3F\3"+
		"\2\2\2\3H\3\2\2\2\3J\3\2\2\2\3L\3\2\2\2\3N\3\2\2\2\3P\3\2\2\2\3R\3\2\2"+
		"\2\3T\3\2\2\2\3V\3\2\2\2\3X\3\2\2\2\3Z\3\2\2\2\3\\\3\2\2\2\3^\3\2\2\2"+
		"\3`\3\2\2\2\3b\3\2\2\2\3d\3\2\2\2\3f\3\2\2\2\3h\3\2\2\2\4j\3\2\2\2\6l"+
		"\3\2\2\2\bn\3\2\2\2\np\3\2\2\2\fs\3\2\2\2\16y\3\2\2\2\20{\3\2\2\2\22\u0081"+
		"\3\2\2\2\24\u0089\3\2\2\2\26\u0097\3\2\2\2\30\u009e\3\2\2\2\32\u00a6\3"+
		"\2\2\2\34\u00a8\3\2\2\2\36\u00af\3\2\2\2 \u00b8\3\2\2\2\"\u00ba\3\2\2"+
		"\2$\u00bc\3\2\2\2&\u00be\3\2\2\2(\u00c0\3\2\2\2*\u00c2\3\2\2\2,\u00c4"+
		"\3\2\2\2.\u00c9\3\2\2\2\60\u00d3\3\2\2\2\62\u00d7\3\2\2\2\64\u00da\3\2"+
		"\2\2\66\u00dd\3\2\2\28\u00e0\3\2\2\2:\u00e3\3\2\2\2<\u00e6\3\2\2\2>\u00e9"+
		"\3\2\2\2@\u00ec\3\2\2\2B\u00ef\3\2\2\2D\u00f2\3\2\2\2F\u00f5\3\2\2\2H"+
		"\u00f8\3\2\2\2J\u00fb\3\2\2\2L\u00fe\3\2\2\2N\u0101\3\2\2\2P\u0104\3\2"+
		"\2\2R\u0107\3\2\2\2T\u0109\3\2\2\2V\u010c\3\2\2\2X\u010f\3\2\2\2Z\u0112"+
		"\3\2\2\2\\\u0115\3\2\2\2^\u0117\3\2\2\2`\u0119\3\2\2\2b\u011d\3\2\2\2"+
		"d\u0121\3\2\2\2f\u0125\3\2\2\2h\u0129\3\2\2\2jk\7.\2\2k\5\3\2\2\2lm\7"+
		"=\2\2m\7\3\2\2\2no\t\2\2\2o\t\3\2\2\2pq\t\3\2\2q\13\3\2\2\2rt\t\4\2\2"+
		"sr\3\2\2\2t\r\3\2\2\2uz\7(\2\2vw\7(\2\2wz\7(\2\2xz\t\5\2\2yu\3\2\2\2y"+
		"v\3\2\2\2yx\3\2\2\2z\17\3\2\2\2{|\7B\2\2|\21\3\2\2\2}\u0082\7~\2\2~\177"+
		"\7~\2\2\177\u0082\7~\2\2\u0080\u0082\t\6\2\2\u0081}\3\2\2\2\u0081~\3\2"+
		"\2\2\u0081\u0080\3\2\2\2\u0082\23\3\2\2\2\u0083\u008a\7@\2\2\u0084\u0085"+
		"\7/\2\2\u0085\u008a\7@\2\2\u0086\u0087\7?\2\2\u0087\u008a\7@\2\2\u0088"+
		"\u008a\t\7\2\2\u0089\u0083\3\2\2\2\u0089\u0084\3\2\2\2\u0089\u0086\3\2"+
		"\2\2\u0089\u0088\3\2\2\2\u008a\25\3\2\2\2\u008b\u0098\7?\2\2\u008c\u008d"+
		"\7?\2\2\u008d\u0098\7?\2\2\u008e\u008f\7>\2\2\u008f\u0090\7?\2\2\u0090"+
		"\u0098\7@\2\2\u0091\u0092\7>\2\2\u0092\u0093\7/\2\2\u0093\u0098\7@\2\2"+
		"\u0094\u0095\7>\2\2\u0095\u0098\7@\2\2\u0096\u0098\t\b\2\2\u0097\u008b"+
		"\3\2\2\2\u0097\u008c\3\2\2\2\u0097\u008e\3\2\2\2\u0097\u0091\3\2\2\2\u0097"+
		"\u0094\3\2\2\2\u0097\u0096\3\2\2\2\u0098\27\3\2\2\2\u0099\u009f\7\u22a6"+
		"\2\2\u009a\u009b\7v\2\2\u009b\u009c\7t\2\2\u009c\u009d\7w\2\2\u009d\u009f"+
		"\7g\2\2\u009e\u0099\3\2\2\2\u009e\u009a\3\2\2\2\u009f\31\3\2\2\2\u00a0"+
		"\u00a7\7\u22a7\2\2\u00a1\u00a2\7h\2\2\u00a2\u00a3\7c\2\2\u00a3\u00a4\7"+
		"n\2\2\u00a4\u00a5\7u\2\2\u00a5\u00a7\7g\2\2\u00a6\u00a0\3\2\2\2\u00a6"+
		"\u00a1\3\2\2\2\u00a7\33\3\2\2\2\u00a8\u00a9\7c\2\2\u00a9\u00aa\7u\2\2"+
		"\u00aa\u00ab\7u\2\2\u00ab\u00ac\7w\2\2\u00ac\u00ad\7o\2\2\u00ad\u00ae"+
		"\7g\2\2\u00ae\35\3\2\2\2\u00af\u00b0\7r\2\2\u00b0\u00b1\7t\2\2\u00b1\u00b2"+
		"\7g\2\2\u00b2\u00b3\7o\2\2\u00b3\u00b4\7k\2\2\u00b4\u00b5\7u\2\2\u00b5"+
		"\u00b6\7g\2\2\u00b6\u00b7\7u\2\2\u00b7\37\3\2\2\2\u00b8\u00b9\7+\2\2\u00b9"+
		"!\3\2\2\2\u00ba\u00bb\7*\2\2\u00bb#\3\2\2\2\u00bc\u00bd\7_\2\2\u00bd%"+
		"\3\2\2\2\u00be\u00bf\7]\2\2\u00bf\'\3\2\2\2\u00c0\u00c1\7\177\2\2\u00c1"+
		")\3\2\2\2\u00c2\u00c3\7}\2\2\u00c3+\3\2\2\2\u00c4\u00c5\7%\2\2\u00c5\u00c6"+
		"\3\2\2\2\u00c6\u00c7\b\26\2\2\u00c7-\3\2\2\2\u00c8\u00ca\t\t\2\2\u00c9"+
		"\u00c8\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cb\u00cc\3\2"+
		"\2\2\u00cc\u00d0\3\2\2\2\u00cd\u00cf\t\n\2\2\u00ce\u00cd\3\2\2\2\u00cf"+
		"\u00d2\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1/\3\2\2\2"+
		"\u00d2\u00d0\3\2\2\2\u00d3\u00d4\t\13\2\2\u00d4\u00d5\3\2\2\2\u00d5\u00d6"+
		"\b\30\3\2\u00d6\61\3\2\2\2\u00d7\u00d8\5\16\7\2\u00d8\u00d9\7K\2\2\u00d9"+
		"\63\3\2\2\2\u00da\u00db\5\16\7\2\u00db\u00dc\7G\2\2\u00dc\65\3\2\2\2\u00dd"+
		"\u00de\5\22\t\2\u00de\u00df\7K\2\2\u00df\67\3\2\2\2\u00e0\u00e1\5\22\t"+
		"\2\u00e1\u00e2\7G\2\2\u00e29\3\2\2\2\u00e3\u00e4\5\24\n\2\u00e4\u00e5"+
		"\7K\2\2\u00e5;\3\2\2\2\u00e6\u00e7\5\24\n\2\u00e7\u00e8\7G\2\2\u00e8="+
		"\3\2\2\2\u00e9\u00ea\5\26\13\2\u00ea\u00eb\7K\2\2\u00eb?\3\2\2\2\u00ec"+
		"\u00ed\5\26\13\2\u00ed\u00ee\7G\2\2\u00eeA\3\2\2\2\u00ef\u00f0\5\f\6\2"+
		"\u00f0\u00f1\7K\2\2\u00f1C\3\2\2\2\u00f2\u00f3\5\f\6\2\u00f3\u00f4\7G"+
		"\2\2\u00f4E\3\2\2\2\u00f5\u00f6\5\b\4\2\u00f6\u00f7\7K\2\2\u00f7G\3\2"+
		"\2\2\u00f8\u00f9\5\b\4\2\u00f9\u00fa\7G\2\2\u00faI\3\2\2\2\u00fb\u00fc"+
		"\5\n\5\2\u00fc\u00fd\7K\2\2\u00fdK\3\2\2\2\u00fe\u00ff\5\n\5\2\u00ff\u0100"+
		"\7G\2\2\u0100M\3\2\2\2\u0101\u0102\7C\2\2\u0102\u0103\7E\2\2\u0103O\3"+
		"\2\2\2\u0104\u0105\7T\2\2\u0105\u0106\7F\2\2\u0106Q\3\2\2\2\u0107\u0108"+
		"\7Y\2\2\u0108S\3\2\2\2\u0109\u010a\7F\2\2\u010a\u010b\7E\2\2\u010bU\3"+
		"\2\2\2\u010c\u010d\7E\2\2\u010d\u010e\7F\2\2\u010eW\3\2\2\2\u010f\u0110"+
		"\7F\2\2\u0110\u0111\7O\2\2\u0111Y\3\2\2\2\u0112\u0113\7E\2\2\u0113\u0114"+
		"\7R\2\2\u0114[\3\2\2\2\u0115\u0116\7E\2\2\u0116]\3\2\2\2\u0117\u0118\7"+
		"T\2\2\u0118_\3\2\2\2\u0119\u011a\7V\2\2\u011a\u011b\7E\2\2\u011ba\3\2"+
		"\2\2\u011c\u011e\t\f\2\2\u011d\u011c\3\2\2\2\u011e\u011f\3\2\2\2\u011f"+
		"\u011d\3\2\2\2\u011f\u0120\3\2\2\2\u0120c\3\2\2\2\u0121\u0122\5\4\2\2"+
		"\u0122\u0123\3\2\2\2\u0123\u0124\b\62\4\2\u0124e\3\2\2\2\u0125\u0126\5"+
		"\6\3\2\u0126\u0127\3\2\2\2\u0127\u0128\b\63\5\2\u0128g\3\2\2\2\u0129\u012a"+
		"\5\60\30\2\u012a\u012b\3\2\2\2\u012b\u012c\b\64\3\2\u012ci\3\2\2\2\16"+
		"\2\3sy\u0081\u0089\u0097\u009e\u00a6\u00cb\u00d0\u011f\6\4\3\2\b\2\2\t"+
		"\3\2\4\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
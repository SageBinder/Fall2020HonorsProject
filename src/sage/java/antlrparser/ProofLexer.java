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
			null, "','", "';'", null, null, null, null, "'.'", null, null, null, 
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\64\u012c\b\1\b\1"+
		"\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t"+
		"\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4"+
		"\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4"+
		"\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4"+
		" \t \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4"+
		"+\t+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4"+
		"\64\t\64\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\7\5\7x\n\7"+
		"\3\b\3\b\3\t\3\t\3\t\5\t\177\n\t\3\n\3\n\3\n\3\n\3\n\5\n\u0086\n\n\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u0093\n\13\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u009c\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\5\r\u00a6\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24"+
		"\3\24\3\25\3\25\3\26\3\26\3\26\3\26\3\27\6\27\u00c9\n\27\r\27\16\27\u00ca"+
		"\3\27\7\27\u00ce\n\27\f\27\16\27\u00d1\13\27\3\30\3\30\3\30\3\30\3\31"+
		"\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3\33\3\34\3\34\3\34\3\35\3\35\3\35"+
		"\3\36\3\36\3\36\3\37\3\37\3\37\3 \3 \3 \3!\3!\3!\3\"\3\"\3\"\3#\3#\3#"+
		"\3$\3$\3$\3%\3%\3%\3&\3&\3&\3\'\3\'\3\'\3(\3(\3(\3)\3)\3*\3*\3*\3+\3+"+
		"\3+\3,\3,\3,\3-\3-\3-\3.\3.\3/\3/\3\60\3\60\3\60\3\61\6\61\u011d\n\61"+
		"\r\61\16\61\u011e\3\62\3\62\3\62\3\62\3\63\3\63\3\63\3\63\3\64\3\64\3"+
		"\64\3\64\2\2\65\4\3\6\4\b\5\n\6\f\7\16\b\20\t\22\n\24\13\26\f\30\r\32"+
		"\16\34\17\36\20 \21\"\22$\23&\24(\25*\26,\27.\30\60\31\62\32\64\33\66"+
		"\348\35:\36<\37> @!B\"D#F$H%J&L\'N(P)R*T+V,X-Z.\\/^\60`\61b\62d\2f\63"+
		"h\64\4\2\3\r\6\2,,\u00e4\u00e4\u02c8\u02c8\u20ae\u20ae\6\2--\u00e4\u00e4"+
		"\u0194\u0194\u02c8\u02c8\b\2##\u0080\u0080\u00ae\u00ae\u00c4\u00c4\u00cd"+
		"\u00cd\u0155\u0155\6\2((\u00a9\u00a9\u00e4\u00e4\u02c8\u02c8\7\2~~\u00a7"+
		"\u00a7\u00aa\u00aa\u00e4\u00e4\u02c8\u02c8\b\2@@\u00e4\u00e4\u0162\u0162"+
		"\u0194\u0194\u201b\u201b\u2022\u2023\b\2??\u00a3\u00a3\u00e4\u00e4\u201f"+
		"\u201f\u2022\u2023\u2032\u2032\5\2C\\aac|\6\2\62;C\\aac|\f\2\13\17\"\""+
		"\u0087\u0087\u00a2\u00a2\u1682\u1682\u2002\u200c\u202a\u202b\u2031\u2031"+
		"\u2061\u2061\u3002\u3002\3\2\62;\2\u0137\2\4\3\2\2\2\2\6\3\2\2\2\2\b\3"+
		"\2\2\2\2\n\3\2\2\2\2\f\3\2\2\2\2\16\3\2\2\2\2\20\3\2\2\2\2\22\3\2\2\2"+
		"\2\24\3\2\2\2\2\26\3\2\2\2\2\30\3\2\2\2\2\32\3\2\2\2\2\34\3\2\2\2\2\36"+
		"\3\2\2\2\2 \3\2\2\2\2\"\3\2\2\2\2$\3\2\2\2\2&\3\2\2\2\2(\3\2\2\2\2*\3"+
		"\2\2\2\2,\3\2\2\2\2.\3\2\2\2\2\60\3\2\2\2\3\62\3\2\2\2\3\64\3\2\2\2\3"+
		"\66\3\2\2\2\38\3\2\2\2\3:\3\2\2\2\3<\3\2\2\2\3>\3\2\2\2\3@\3\2\2\2\3B"+
		"\3\2\2\2\3D\3\2\2\2\3F\3\2\2\2\3H\3\2\2\2\3J\3\2\2\2\3L\3\2\2\2\3N\3\2"+
		"\2\2\3P\3\2\2\2\3R\3\2\2\2\3T\3\2\2\2\3V\3\2\2\2\3X\3\2\2\2\3Z\3\2\2\2"+
		"\3\\\3\2\2\2\3^\3\2\2\2\3`\3\2\2\2\3b\3\2\2\2\3d\3\2\2\2\3f\3\2\2\2\3"+
		"h\3\2\2\2\4j\3\2\2\2\6l\3\2\2\2\bn\3\2\2\2\np\3\2\2\2\fr\3\2\2\2\16w\3"+
		"\2\2\2\20y\3\2\2\2\22~\3\2\2\2\24\u0085\3\2\2\2\26\u0092\3\2\2\2\30\u009b"+
		"\3\2\2\2\32\u00a5\3\2\2\2\34\u00a7\3\2\2\2\36\u00ae\3\2\2\2 \u00b7\3\2"+
		"\2\2\"\u00b9\3\2\2\2$\u00bb\3\2\2\2&\u00bd\3\2\2\2(\u00bf\3\2\2\2*\u00c1"+
		"\3\2\2\2,\u00c3\3\2\2\2.\u00c8\3\2\2\2\60\u00d2\3\2\2\2\62\u00d6\3\2\2"+
		"\2\64\u00d9\3\2\2\2\66\u00dc\3\2\2\28\u00df\3\2\2\2:\u00e2\3\2\2\2<\u00e5"+
		"\3\2\2\2>\u00e8\3\2\2\2@\u00eb\3\2\2\2B\u00ee\3\2\2\2D\u00f1\3\2\2\2F"+
		"\u00f4\3\2\2\2H\u00f7\3\2\2\2J\u00fa\3\2\2\2L\u00fd\3\2\2\2N\u0100\3\2"+
		"\2\2P\u0103\3\2\2\2R\u0106\3\2\2\2T\u0108\3\2\2\2V\u010b\3\2\2\2X\u010e"+
		"\3\2\2\2Z\u0111\3\2\2\2\\\u0114\3\2\2\2^\u0116\3\2\2\2`\u0118\3\2\2\2"+
		"b\u011c\3\2\2\2d\u0120\3\2\2\2f\u0124\3\2\2\2h\u0128\3\2\2\2jk\7.\2\2"+
		"k\5\3\2\2\2lm\7=\2\2m\7\3\2\2\2no\t\2\2\2o\t\3\2\2\2pq\t\3\2\2q\13\3\2"+
		"\2\2rs\t\4\2\2s\r\3\2\2\2tx\t\5\2\2uv\7(\2\2vx\7(\2\2wt\3\2\2\2wu\3\2"+
		"\2\2x\17\3\2\2\2yz\7\60\2\2z\21\3\2\2\2{\177\t\6\2\2|}\7~\2\2}\177\7~"+
		"\2\2~{\3\2\2\2~|\3\2\2\2\177\23\3\2\2\2\u0080\u0086\t\7\2\2\u0081\u0082"+
		"\7/\2\2\u0082\u0086\7@\2\2\u0083\u0084\7?\2\2\u0084\u0086\7@\2\2\u0085"+
		"\u0080\3\2\2\2\u0085\u0081\3\2\2\2\u0085\u0083\3\2\2\2\u0086\25\3\2\2"+
		"\2\u0087\u0093\t\b\2\2\u0088\u0089\7?\2\2\u0089\u0093\7?\2\2\u008a\u008b"+
		"\7>\2\2\u008b\u008c\7?\2\2\u008c\u0093\7@\2\2\u008d\u008e\7>\2\2\u008e"+
		"\u008f\7/\2\2\u008f\u0093\7@\2\2\u0090\u0091\7>\2\2\u0091\u0093\7@\2\2"+
		"\u0092\u0087\3\2\2\2\u0092\u0088\3\2\2\2\u0092\u008a\3\2\2\2\u0092\u008d"+
		"\3\2\2\2\u0092\u0090\3\2\2\2\u0093\27\3\2\2\2\u0094\u0095\7\u00e4\2\2"+
		"\u0095\u0096\7\u0162\2\2\u0096\u009c\7\u00a6\2\2\u0097\u0098\7v\2\2\u0098"+
		"\u0099\7t\2\2\u0099\u009a\7w\2\2\u009a\u009c\7g\2\2\u009b\u0094\3\2\2"+
		"\2\u009b\u0097\3\2\2\2\u009c\31\3\2\2\2\u009d\u009e\7\u00e4\2\2\u009e"+
		"\u009f\7\u0162\2\2\u009f\u00a6\7\u00a7\2\2\u00a0\u00a1\7h\2\2\u00a1\u00a2"+
		"\7c\2\2\u00a2\u00a3\7n\2\2\u00a3\u00a4\7u\2\2\u00a4\u00a6\7g\2\2\u00a5"+
		"\u009d\3\2\2\2\u00a5\u00a0\3\2\2\2\u00a6\33\3\2\2\2\u00a7\u00a8\7c\2\2"+
		"\u00a8\u00a9\7u\2\2\u00a9\u00aa\7u\2\2\u00aa\u00ab\7w\2\2\u00ab\u00ac"+
		"\7o\2\2\u00ac\u00ad\7g\2\2\u00ad\35\3\2\2\2\u00ae\u00af\7r\2\2\u00af\u00b0"+
		"\7t\2\2\u00b0\u00b1\7g\2\2\u00b1\u00b2\7o\2\2\u00b2\u00b3\7k\2\2\u00b3"+
		"\u00b4\7u\2\2\u00b4\u00b5\7g\2\2\u00b5\u00b6\7u\2\2\u00b6\37\3\2\2\2\u00b7"+
		"\u00b8\7+\2\2\u00b8!\3\2\2\2\u00b9\u00ba\7*\2\2\u00ba#\3\2\2\2\u00bb\u00bc"+
		"\7_\2\2\u00bc%\3\2\2\2\u00bd\u00be\7]\2\2\u00be\'\3\2\2\2\u00bf\u00c0"+
		"\7\177\2\2\u00c0)\3\2\2\2\u00c1\u00c2\7}\2\2\u00c2+\3\2\2\2\u00c3\u00c4"+
		"\7%\2\2\u00c4\u00c5\3\2\2\2\u00c5\u00c6\b\26\2\2\u00c6-\3\2\2\2\u00c7"+
		"\u00c9\t\t\2\2\u00c8\u00c7\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00c8\3\2"+
		"\2\2\u00ca\u00cb\3\2\2\2\u00cb\u00cf\3\2\2\2\u00cc\u00ce\t\n\2\2\u00cd"+
		"\u00cc\3\2\2\2\u00ce\u00d1\3\2\2\2\u00cf\u00cd\3\2\2\2\u00cf\u00d0\3\2"+
		"\2\2\u00d0/\3\2\2\2\u00d1\u00cf\3\2\2\2\u00d2\u00d3\t\13\2\2\u00d3\u00d4"+
		"\3\2\2\2\u00d4\u00d5\b\30\3\2\u00d5\61\3\2\2\2\u00d6\u00d7\5\16\7\2\u00d7"+
		"\u00d8\7K\2\2\u00d8\63\3\2\2\2\u00d9\u00da\5\16\7\2\u00da\u00db\7G\2\2"+
		"\u00db\65\3\2\2\2\u00dc\u00dd\5\22\t\2\u00dd\u00de\7K\2\2\u00de\67\3\2"+
		"\2\2\u00df\u00e0\5\22\t\2\u00e0\u00e1\7G\2\2\u00e19\3\2\2\2\u00e2\u00e3"+
		"\5\24\n\2\u00e3\u00e4\7K\2\2\u00e4;\3\2\2\2\u00e5\u00e6\5\24\n\2\u00e6"+
		"\u00e7\7G\2\2\u00e7=\3\2\2\2\u00e8\u00e9\5\26\13\2\u00e9\u00ea\7K\2\2"+
		"\u00ea?\3\2\2\2\u00eb\u00ec\5\26\13\2\u00ec\u00ed\7G\2\2\u00edA\3\2\2"+
		"\2\u00ee\u00ef\5\f\6\2\u00ef\u00f0\7K\2\2\u00f0C\3\2\2\2\u00f1\u00f2\5"+
		"\f\6\2\u00f2\u00f3\7G\2\2\u00f3E\3\2\2\2\u00f4\u00f5\5\b\4\2\u00f5\u00f6"+
		"\7K\2\2\u00f6G\3\2\2\2\u00f7\u00f8\5\b\4\2\u00f8\u00f9\7G\2\2\u00f9I\3"+
		"\2\2\2\u00fa\u00fb\5\n\5\2\u00fb\u00fc\7K\2\2\u00fcK\3\2\2\2\u00fd\u00fe"+
		"\5\n\5\2\u00fe\u00ff\7G\2\2\u00ffM\3\2\2\2\u0100\u0101\7C\2\2\u0101\u0102"+
		"\7E\2\2\u0102O\3\2\2\2\u0103\u0104\7T\2\2\u0104\u0105\7F\2\2\u0105Q\3"+
		"\2\2\2\u0106\u0107\7Y\2\2\u0107S\3\2\2\2\u0108\u0109\7F\2\2\u0109\u010a"+
		"\7E\2\2\u010aU\3\2\2\2\u010b\u010c\7E\2\2\u010c\u010d\7F\2\2\u010dW\3"+
		"\2\2\2\u010e\u010f\7F\2\2\u010f\u0110\7O\2\2\u0110Y\3\2\2\2\u0111\u0112"+
		"\7E\2\2\u0112\u0113\7R\2\2\u0113[\3\2\2\2\u0114\u0115\7E\2\2\u0115]\3"+
		"\2\2\2\u0116\u0117\7T\2\2\u0117_\3\2\2\2\u0118\u0119\7V\2\2\u0119\u011a"+
		"\7E\2\2\u011aa\3\2\2\2\u011b\u011d\t\f\2\2\u011c\u011b\3\2\2\2\u011d\u011e"+
		"\3\2\2\2\u011e\u011c\3\2\2\2\u011e\u011f\3\2\2\2\u011fc\3\2\2\2\u0120"+
		"\u0121\5\4\2\2\u0121\u0122\3\2\2\2\u0122\u0123\b\62\4\2\u0123e\3\2\2\2"+
		"\u0124\u0125\5\6\3\2\u0125\u0126\3\2\2\2\u0126\u0127\b\63\5\2\u0127g\3"+
		"\2\2\2\u0128\u0129\5\60\30\2\u0129\u012a\3\2\2\2\u012a\u012b\b\64\3\2"+
		"\u012bi\3\2\2\2\r\2\3w~\u0085\u0092\u009b\u00a5\u00ca\u00cf\u011e\6\4"+
		"\3\2\b\2\2\t\3\2\4\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
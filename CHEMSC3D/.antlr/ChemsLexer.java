// Generated from d:\Documentos\Academico\USAC\Practicas finales\Compiladores 2 - S1\Laboratorio\S1OLC2-D\CHEMSC3D\ChemsLexer.g4 by ANTLR 4.8
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ChemsLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		CONSOLE=1, LOG=2, P_NUMBER=3, P_STRING=4, P_IF=5, P_WHILE=6, P_STRUCT=7, 
		NUMBER=8, STRING=9, ID=10, PUNTO=11, PTCOMA=12, COMA=13, DOSPT=14, DIFERENTE=15, 
		IGUAL=16, MAYORIGUAL=17, MENORIGUAL=18, MAYOR=19, MENOR=20, MUL=21, DIV=22, 
		ADD=23, SUB=24, PARIZQ=25, PARDER=26, LLAVEIZQ=27, LLAVEDER=28, CORIZQ=29, 
		CORDER=30, WHITESPACE=31;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"CONSOLE", "LOG", "P_NUMBER", "P_STRING", "P_IF", "P_WHILE", "P_STRUCT", 
			"NUMBER", "STRING", "ID", "PUNTO", "PTCOMA", "COMA", "DOSPT", "DIFERENTE", 
			"IGUAL", "MAYORIGUAL", "MENORIGUAL", "MAYOR", "MENOR", "MUL", "DIV", 
			"ADD", "SUB", "PARIZQ", "PARDER", "LLAVEIZQ", "LLAVEDER", "CORIZQ", "CORDER", 
			"WHITESPACE", "ESC_SEQ"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'console'", "'log'", "'number'", "'string'", "'if'", "'while'", 
			"'struct'", null, null, null, "'.'", "';'", "','", "':'", "'!'", "'='", 
			"'>='", "'<='", "'>'", "'<'", "'*'", "'/'", "'+'", "'-'", "'('", "')'", 
			"'{'", "'}'", "'['", "']'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "CONSOLE", "LOG", "P_NUMBER", "P_STRING", "P_IF", "P_WHILE", "P_STRUCT", 
			"NUMBER", "STRING", "ID", "PUNTO", "PTCOMA", "COMA", "DOSPT", "DIFERENTE", 
			"IGUAL", "MAYORIGUAL", "MENORIGUAL", "MAYOR", "MENOR", "MUL", "DIV", 
			"ADD", "SUB", "PARIZQ", "PARDER", "LLAVEIZQ", "LLAVEDER", "CORIZQ", "CORDER", 
			"WHITESPACE"
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


	public ChemsLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "ChemsLexer.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2!\u00b6\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\6\to\n\t\r\t\16\tp\3\n\3\n\7\nu\n"+
		"\n\f\n\16\nx\13\n\3\n\3\n\3\13\3\13\7\13~\n\13\f\13\16\13\u0081\13\13"+
		"\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\22"+
		"\3\23\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31"+
		"\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \6"+
		" \u00ae\n \r \16 \u00af\3 \3 \3!\3!\3!\2\2\"\3\3\5\4\7\5\t\6\13\7\r\b"+
		"\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26"+
		"+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\2\3\2\b\3\2\62;\3\2"+
		"$$\5\2C\\aac|\6\2\62;C\\aac|\6\2\13\f\17\17\"\"^^\t\2\"#%%--/\60<<BB]"+
		"_\2\u00b8\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2"+
		"\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27"+
		"\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2"+
		"\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2"+
		"\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2"+
		"\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\3C\3\2\2\2\5K\3\2\2\2\7O\3\2\2\2"+
		"\tV\3\2\2\2\13]\3\2\2\2\r`\3\2\2\2\17f\3\2\2\2\21n\3\2\2\2\23r\3\2\2\2"+
		"\25{\3\2\2\2\27\u0082\3\2\2\2\31\u0084\3\2\2\2\33\u0086\3\2\2\2\35\u0088"+
		"\3\2\2\2\37\u008a\3\2\2\2!\u008c\3\2\2\2#\u008e\3\2\2\2%\u0091\3\2\2\2"+
		"\'\u0094\3\2\2\2)\u0096\3\2\2\2+\u0098\3\2\2\2-\u009a\3\2\2\2/\u009c\3"+
		"\2\2\2\61\u009e\3\2\2\2\63\u00a0\3\2\2\2\65\u00a2\3\2\2\2\67\u00a4\3\2"+
		"\2\29\u00a6\3\2\2\2;\u00a8\3\2\2\2=\u00aa\3\2\2\2?\u00ad\3\2\2\2A\u00b3"+
		"\3\2\2\2CD\7e\2\2DE\7q\2\2EF\7p\2\2FG\7u\2\2GH\7q\2\2HI\7n\2\2IJ\7g\2"+
		"\2J\4\3\2\2\2KL\7n\2\2LM\7q\2\2MN\7i\2\2N\6\3\2\2\2OP\7p\2\2PQ\7w\2\2"+
		"QR\7o\2\2RS\7d\2\2ST\7g\2\2TU\7t\2\2U\b\3\2\2\2VW\7u\2\2WX\7v\2\2XY\7"+
		"t\2\2YZ\7k\2\2Z[\7p\2\2[\\\7i\2\2\\\n\3\2\2\2]^\7k\2\2^_\7h\2\2_\f\3\2"+
		"\2\2`a\7y\2\2ab\7j\2\2bc\7k\2\2cd\7n\2\2de\7g\2\2e\16\3\2\2\2fg\7u\2\2"+
		"gh\7v\2\2hi\7t\2\2ij\7w\2\2jk\7e\2\2kl\7v\2\2l\20\3\2\2\2mo\t\2\2\2nm"+
		"\3\2\2\2op\3\2\2\2pn\3\2\2\2pq\3\2\2\2q\22\3\2\2\2rv\7$\2\2su\n\3\2\2"+
		"ts\3\2\2\2ux\3\2\2\2vt\3\2\2\2vw\3\2\2\2wy\3\2\2\2xv\3\2\2\2yz\7$\2\2"+
		"z\24\3\2\2\2{\177\t\4\2\2|~\t\5\2\2}|\3\2\2\2~\u0081\3\2\2\2\177}\3\2"+
		"\2\2\177\u0080\3\2\2\2\u0080\26\3\2\2\2\u0081\177\3\2\2\2\u0082\u0083"+
		"\7\60\2\2\u0083\30\3\2\2\2\u0084\u0085\7=\2\2\u0085\32\3\2\2\2\u0086\u0087"+
		"\7.\2\2\u0087\34\3\2\2\2\u0088\u0089\7<\2\2\u0089\36\3\2\2\2\u008a\u008b"+
		"\7#\2\2\u008b \3\2\2\2\u008c\u008d\7?\2\2\u008d\"\3\2\2\2\u008e\u008f"+
		"\7@\2\2\u008f\u0090\7?\2\2\u0090$\3\2\2\2\u0091\u0092\7>\2\2\u0092\u0093"+
		"\7?\2\2\u0093&\3\2\2\2\u0094\u0095\7@\2\2\u0095(\3\2\2\2\u0096\u0097\7"+
		">\2\2\u0097*\3\2\2\2\u0098\u0099\7,\2\2\u0099,\3\2\2\2\u009a\u009b\7\61"+
		"\2\2\u009b.\3\2\2\2\u009c\u009d\7-\2\2\u009d\60\3\2\2\2\u009e\u009f\7"+
		"/\2\2\u009f\62\3\2\2\2\u00a0\u00a1\7*\2\2\u00a1\64\3\2\2\2\u00a2\u00a3"+
		"\7+\2\2\u00a3\66\3\2\2\2\u00a4\u00a5\7}\2\2\u00a58\3\2\2\2\u00a6\u00a7"+
		"\7\177\2\2\u00a7:\3\2\2\2\u00a8\u00a9\7]\2\2\u00a9<\3\2\2\2\u00aa\u00ab"+
		"\7_\2\2\u00ab>\3\2\2\2\u00ac\u00ae\t\6\2\2\u00ad\u00ac\3\2\2\2\u00ae\u00af"+
		"\3\2\2\2\u00af\u00ad\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1"+
		"\u00b2\b \2\2\u00b2@\3\2\2\2\u00b3\u00b4\7^\2\2\u00b4\u00b5\t\7\2\2\u00b5"+
		"B\3\2\2\2\7\2pv\177\u00af\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
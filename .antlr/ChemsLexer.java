// Generated from d:\Documentos\Academico\USAC\Practicas finales\Compiladores 2 - S1\Laboratorio\S1OLC2-D\ChemsLexer.g4 by ANTLR 4.8
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
		CONSOLE=1, LOG=2, P_NUMBER=3, P_STRING=4, P_IF=5, P_WHILE=6, NUMBER=7, 
		STRING=8, ID=9, PUNTO=10, PTCOMA=11, DIFERENTE=12, IGUAL=13, MAYORIGUAL=14, 
		MENORIGUAL=15, MAYOR=16, MENOR=17, MUL=18, DIV=19, ADD=20, SUB=21, PARIZQ=22, 
		PARDER=23, LLAVEIZQ=24, LLAVEDER=25, WHITESPACE=26;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"CONSOLE", "LOG", "P_NUMBER", "P_STRING", "P_IF", "P_WHILE", "NUMBER", 
			"STRING", "ID", "PUNTO", "PTCOMA", "DIFERENTE", "IGUAL", "MAYORIGUAL", 
			"MENORIGUAL", "MAYOR", "MENOR", "MUL", "DIV", "ADD", "SUB", "PARIZQ", 
			"PARDER", "LLAVEIZQ", "LLAVEDER", "WHITESPACE", "ESC_SEQ"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'console'", "'log'", "'number'", "'string'", "'if'", "'while'", 
			null, null, null, "'.'", "';'", "'!'", "'='", "'>='", "'<='", "'>'", 
			"'<'", "'*'", "'/'", "'+'", "'-'", "'('", "')'", "'{'", "'}'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "CONSOLE", "LOG", "P_NUMBER", "P_STRING", "P_IF", "P_WHILE", "NUMBER", 
			"STRING", "ID", "PUNTO", "PTCOMA", "DIFERENTE", "IGUAL", "MAYORIGUAL", 
			"MENORIGUAL", "MAYOR", "MENOR", "MUL", "DIV", "ADD", "SUB", "PARIZQ", 
			"PARDER", "LLAVEIZQ", "LLAVEDER", "WHITESPACE"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\34\u009d\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\6\b^\n\b\r\b\16\b_\3\t\3\t\7"+
		"\td\n\t\f\t\16\tg\13\t\3\t\3\t\3\n\3\n\7\nm\n\n\f\n\16\np\13\n\3\13\3"+
		"\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\20\3\21\3\21"+
		"\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30"+
		"\3\31\3\31\3\32\3\32\3\33\6\33\u0095\n\33\r\33\16\33\u0096\3\33\3\33\3"+
		"\34\3\34\3\34\2\2\35\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27"+
		"\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33"+
		"\65\34\67\2\3\2\b\3\2\62;\3\2$$\5\2C\\aac|\6\2\62;C\\aac|\6\2\13\f\17"+
		"\17\"\"^^\t\2\"#%%--/\60<<BB]_\2\u009f\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2"+
		"\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2"+
		"\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3"+
		"\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3"+
		"\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65"+
		"\3\2\2\2\39\3\2\2\2\5A\3\2\2\2\7E\3\2\2\2\tL\3\2\2\2\13S\3\2\2\2\rV\3"+
		"\2\2\2\17]\3\2\2\2\21a\3\2\2\2\23j\3\2\2\2\25q\3\2\2\2\27s\3\2\2\2\31"+
		"u\3\2\2\2\33w\3\2\2\2\35y\3\2\2\2\37|\3\2\2\2!\177\3\2\2\2#\u0081\3\2"+
		"\2\2%\u0083\3\2\2\2\'\u0085\3\2\2\2)\u0087\3\2\2\2+\u0089\3\2\2\2-\u008b"+
		"\3\2\2\2/\u008d\3\2\2\2\61\u008f\3\2\2\2\63\u0091\3\2\2\2\65\u0094\3\2"+
		"\2\2\67\u009a\3\2\2\29:\7e\2\2:;\7q\2\2;<\7p\2\2<=\7u\2\2=>\7q\2\2>?\7"+
		"n\2\2?@\7g\2\2@\4\3\2\2\2AB\7n\2\2BC\7q\2\2CD\7i\2\2D\6\3\2\2\2EF\7p\2"+
		"\2FG\7w\2\2GH\7o\2\2HI\7d\2\2IJ\7g\2\2JK\7t\2\2K\b\3\2\2\2LM\7u\2\2MN"+
		"\7v\2\2NO\7t\2\2OP\7k\2\2PQ\7p\2\2QR\7i\2\2R\n\3\2\2\2ST\7k\2\2TU\7h\2"+
		"\2U\f\3\2\2\2VW\7y\2\2WX\7j\2\2XY\7k\2\2YZ\7n\2\2Z[\7g\2\2[\16\3\2\2\2"+
		"\\^\t\2\2\2]\\\3\2\2\2^_\3\2\2\2_]\3\2\2\2_`\3\2\2\2`\20\3\2\2\2ae\7$"+
		"\2\2bd\n\3\2\2cb\3\2\2\2dg\3\2\2\2ec\3\2\2\2ef\3\2\2\2fh\3\2\2\2ge\3\2"+
		"\2\2hi\7$\2\2i\22\3\2\2\2jn\t\4\2\2km\t\5\2\2lk\3\2\2\2mp\3\2\2\2nl\3"+
		"\2\2\2no\3\2\2\2o\24\3\2\2\2pn\3\2\2\2qr\7\60\2\2r\26\3\2\2\2st\7=\2\2"+
		"t\30\3\2\2\2uv\7#\2\2v\32\3\2\2\2wx\7?\2\2x\34\3\2\2\2yz\7@\2\2z{\7?\2"+
		"\2{\36\3\2\2\2|}\7>\2\2}~\7?\2\2~ \3\2\2\2\177\u0080\7@\2\2\u0080\"\3"+
		"\2\2\2\u0081\u0082\7>\2\2\u0082$\3\2\2\2\u0083\u0084\7,\2\2\u0084&\3\2"+
		"\2\2\u0085\u0086\7\61\2\2\u0086(\3\2\2\2\u0087\u0088\7-\2\2\u0088*\3\2"+
		"\2\2\u0089\u008a\7/\2\2\u008a,\3\2\2\2\u008b\u008c\7*\2\2\u008c.\3\2\2"+
		"\2\u008d\u008e\7+\2\2\u008e\60\3\2\2\2\u008f\u0090\7}\2\2\u0090\62\3\2"+
		"\2\2\u0091\u0092\7\177\2\2\u0092\64\3\2\2\2\u0093\u0095\t\6\2\2\u0094"+
		"\u0093\3\2\2\2\u0095\u0096\3\2\2\2\u0096\u0094\3\2\2\2\u0096\u0097\3\2"+
		"\2\2\u0097\u0098\3\2\2\2\u0098\u0099\b\33\2\2\u0099\66\3\2\2\2\u009a\u009b"+
		"\7^\2\2\u009b\u009c\t\7\2\2\u009c8\3\2\2\2\7\2_en\u0096\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
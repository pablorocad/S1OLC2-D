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
		CONSOLE=1, LOG=2, NUMBER=3, STRING=4, PUNTO=5, PTCOMA=6, DIFERENTE=7, 
		MAYORIGUAL=8, MENORIGUAL=9, MAYOR=10, MENOR=11, MUL=12, DIV=13, ADD=14, 
		SUB=15, PARIZQ=16, PARDER=17, LLAVEIZQ=18, LLAVEDER=19, WHITESPACE=20;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"CONSOLE", "LOG", "NUMBER", "STRING", "PUNTO", "PTCOMA", "DIFERENTE", 
			"MAYORIGUAL", "MENORIGUAL", "MAYOR", "MENOR", "MUL", "DIV", "ADD", "SUB", 
			"PARIZQ", "PARDER", "LLAVEIZQ", "LLAVEDER", "WHITESPACE", "ESC_SEQ"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'console'", "'log'", null, null, "'.'", "';'", "'!'", "'>='", 
			"'<='", "'>'", "'<'", "'*'", "'/'", "'+'", "'-'", "'('", "')'", "'{'", 
			"'}'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "CONSOLE", "LOG", "NUMBER", "STRING", "PUNTO", "PTCOMA", "DIFERENTE", 
			"MAYORIGUAL", "MENORIGUAL", "MAYOR", "MENOR", "MUL", "DIV", "ADD", "SUB", 
			"PARIZQ", "PARDER", "LLAVEIZQ", "LLAVEDER", "WHITESPACE"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\26q\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\3\3\3\3\3\3\3\3\4\6\4;\n\4\r\4\16\4<\3\5\3\5\7\5A\n\5\f\5\16\5D\13"+
		"\5\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3"+
		"\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23"+
		"\3\23\3\24\3\24\3\25\6\25i\n\25\r\25\16\25j\3\25\3\25\3\26\3\26\3\26\2"+
		"\2\27\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35"+
		"\20\37\21!\22#\23%\24\'\25)\26+\2\3\2\6\3\2\62;\3\2$$\6\2\13\f\17\17\""+
		"\"^^\t\2\"#%%--/\60<<BB]_\2r\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3"+
		"\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2"+
		"\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37"+
		"\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\3-\3"+
		"\2\2\2\5\65\3\2\2\2\7:\3\2\2\2\t>\3\2\2\2\13G\3\2\2\2\rI\3\2\2\2\17K\3"+
		"\2\2\2\21M\3\2\2\2\23P\3\2\2\2\25S\3\2\2\2\27U\3\2\2\2\31W\3\2\2\2\33"+
		"Y\3\2\2\2\35[\3\2\2\2\37]\3\2\2\2!_\3\2\2\2#a\3\2\2\2%c\3\2\2\2\'e\3\2"+
		"\2\2)h\3\2\2\2+n\3\2\2\2-.\7e\2\2./\7q\2\2/\60\7p\2\2\60\61\7u\2\2\61"+
		"\62\7q\2\2\62\63\7n\2\2\63\64\7g\2\2\64\4\3\2\2\2\65\66\7n\2\2\66\67\7"+
		"q\2\2\678\7i\2\28\6\3\2\2\29;\t\2\2\2:9\3\2\2\2;<\3\2\2\2<:\3\2\2\2<="+
		"\3\2\2\2=\b\3\2\2\2>B\7$\2\2?A\n\3\2\2@?\3\2\2\2AD\3\2\2\2B@\3\2\2\2B"+
		"C\3\2\2\2CE\3\2\2\2DB\3\2\2\2EF\7$\2\2F\n\3\2\2\2GH\7\60\2\2H\f\3\2\2"+
		"\2IJ\7=\2\2J\16\3\2\2\2KL\7#\2\2L\20\3\2\2\2MN\7@\2\2NO\7?\2\2O\22\3\2"+
		"\2\2PQ\7>\2\2QR\7?\2\2R\24\3\2\2\2ST\7@\2\2T\26\3\2\2\2UV\7>\2\2V\30\3"+
		"\2\2\2WX\7,\2\2X\32\3\2\2\2YZ\7\61\2\2Z\34\3\2\2\2[\\\7-\2\2\\\36\3\2"+
		"\2\2]^\7/\2\2^ \3\2\2\2_`\7*\2\2`\"\3\2\2\2ab\7+\2\2b$\3\2\2\2cd\7}\2"+
		"\2d&\3\2\2\2ef\7\177\2\2f(\3\2\2\2gi\t\4\2\2hg\3\2\2\2ij\3\2\2\2jh\3\2"+
		"\2\2jk\3\2\2\2kl\3\2\2\2lm\b\25\2\2m*\3\2\2\2no\7^\2\2op\t\5\2\2p,\3\2"+
		"\2\2\6\2<Bj\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
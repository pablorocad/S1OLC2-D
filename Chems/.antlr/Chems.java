// Generated from d:\Documentos\Academico\USAC\Practicas finales\Compiladores 2 - S1\Laboratorio\S1OLC2-D\Chems\Chems.g4 by ANTLR 4.8

    import "OLC2/interfaces"
    import "OLC2/expresion"
    import "OLC2/instruction"
    import arrayList "github.com/colegno/arraylist"

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Chems extends Parser {
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
	public static final int
		RULE_start = 0, RULE_instrucciones = 1, RULE_instruccion = 2, RULE_lista_att = 3, 
		RULE_array_st = 4, RULE_struct_st = 5, RULE_expression = 6, RULE_expr_arit = 7, 
		RULE_listValues = 8, RULE_primitivo = 9, RULE_listArray = 10;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "instrucciones", "instruccion", "lista_att", "array_st", "struct_st", 
			"expression", "expr_arit", "listValues", "primitivo", "listArray"
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

	@Override
	public String getGrammarFileName() { return "Chems.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public Chems(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class StartContext extends ParserRuleContext {
		public *arrayList.List lista;
		public InstruccionesContext instrucciones;
		public InstruccionesContext instrucciones() {
			return getRuleContext(InstruccionesContext.class,0);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(22);
			((StartContext)_localctx).instrucciones = instrucciones();
			_localctx.lista = ((StartContext)_localctx).instrucciones.l
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

	public static class InstruccionesContext extends ParserRuleContext {
		public *arrayList.List l;
		public InstruccionContext instruccion;
		public List<InstruccionContext> e = new ArrayList<InstruccionContext>();
		public List<InstruccionContext> instruccion() {
			return getRuleContexts(InstruccionContext.class);
		}
		public InstruccionContext instruccion(int i) {
			return getRuleContext(InstruccionContext.class,i);
		}
		public InstruccionesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instrucciones; }
	}

	public final InstruccionesContext instrucciones() throws RecognitionException {
		InstruccionesContext _localctx = new InstruccionesContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_instrucciones);

		    _localctx.l =  arrayList.New()
		  
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(28);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CONSOLE) | (1L << P_NUMBER) | (1L << P_IF) | (1L << P_WHILE) | (1L << P_STRUCT) | (1L << ID))) != 0)) {
				{
				{
				setState(25);
				((InstruccionesContext)_localctx).instruccion = instruccion();
				((InstruccionesContext)_localctx).e.add(((InstruccionesContext)_localctx).instruccion);
				}
				}
				setState(30);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}

			      listInt := localctx.(*InstruccionesContext).GetE()
			      		for _, e := range listInt {
			            _localctx.l.Add(e.GetInstr())
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

	public static class InstruccionContext extends ParserRuleContext {
		public interfaces.Instruction instr;
		public ExpressionContext expression;
		public Struct_stContext isStruct;
		public Array_stContext isArray;
		public Token id;
		public InstruccionesContext instrucciones;
		public Lista_attContext lista;
		public TerminalNode CONSOLE() { return getToken(Chems.CONSOLE, 0); }
		public TerminalNode PUNTO() { return getToken(Chems.PUNTO, 0); }
		public TerminalNode LOG() { return getToken(Chems.LOG, 0); }
		public TerminalNode PARIZQ() { return getToken(Chems.PARIZQ, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode PARDER() { return getToken(Chems.PARDER, 0); }
		public TerminalNode PTCOMA() { return getToken(Chems.PTCOMA, 0); }
		public TerminalNode P_NUMBER() { return getToken(Chems.P_NUMBER, 0); }
		public TerminalNode IGUAL() { return getToken(Chems.IGUAL, 0); }
		public Struct_stContext struct_st() {
			return getRuleContext(Struct_stContext.class,0);
		}
		public Array_stContext array_st() {
			return getRuleContext(Array_stContext.class,0);
		}
		public TerminalNode ID() { return getToken(Chems.ID, 0); }
		public TerminalNode P_IF() { return getToken(Chems.P_IF, 0); }
		public TerminalNode LLAVEIZQ() { return getToken(Chems.LLAVEIZQ, 0); }
		public InstruccionesContext instrucciones() {
			return getRuleContext(InstruccionesContext.class,0);
		}
		public TerminalNode LLAVEDER() { return getToken(Chems.LLAVEDER, 0); }
		public TerminalNode P_WHILE() { return getToken(Chems.P_WHILE, 0); }
		public TerminalNode P_STRUCT() { return getToken(Chems.P_STRUCT, 0); }
		public Lista_attContext lista_att() {
			return getRuleContext(Lista_attContext.class,0);
		}
		public InstruccionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruccion; }
	}

	public final InstruccionContext instruccion() throws RecognitionException {
		InstruccionContext _localctx = new InstruccionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_instruccion);
		try {
			setState(82);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CONSOLE:
				enterOuterAlt(_localctx, 1);
				{
				setState(33);
				match(CONSOLE);
				setState(34);
				match(PUNTO);
				setState(35);
				match(LOG);
				setState(36);
				match(PARIZQ);
				setState(37);
				((InstruccionContext)_localctx).expression = expression();
				setState(38);
				match(PARDER);
				setState(39);
				match(PTCOMA);
				_localctx.instr = instruction.NewImprimir(((InstruccionContext)_localctx).expression.p)
				}
				break;
			case P_NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(42);
				match(P_NUMBER);
				setState(43);
				((InstruccionContext)_localctx).isStruct = struct_st();
				setState(44);
				((InstruccionContext)_localctx).isArray = array_st();
				setState(45);
				((InstruccionContext)_localctx).id = match(ID);
				setState(46);
				match(IGUAL);
				setState(47);
				((InstruccionContext)_localctx).expression = expression();
				setState(48);
				match(PTCOMA);
				_localctx.instr = instruction.NewDeclaration((((InstruccionContext)_localctx).id!=null?((InstruccionContext)_localctx).id.getText():null),interfaces.INTEGER,((InstruccionContext)_localctx).expression.p, ((InstruccionContext)_localctx).isArray.arr, ((InstruccionContext)_localctx).isStruct.stru)
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 3);
				{
				setState(51);
				((InstruccionContext)_localctx).id = match(ID);
				setState(52);
				match(IGUAL);
				setState(53);
				((InstruccionContext)_localctx).expression = expression();
				setState(54);
				match(PTCOMA);
				_localctx.instr = instruction.NewAssignment((((InstruccionContext)_localctx).id!=null?((InstruccionContext)_localctx).id.getText():null),((InstruccionContext)_localctx).expression.p)
				}
				break;
			case P_IF:
				enterOuterAlt(_localctx, 4);
				{
				setState(57);
				match(P_IF);
				setState(58);
				match(PARIZQ);
				setState(59);
				((InstruccionContext)_localctx).expression = expression();
				setState(60);
				match(PARDER);
				setState(61);
				match(LLAVEIZQ);
				setState(62);
				((InstruccionContext)_localctx).instrucciones = instrucciones();
				setState(63);
				match(LLAVEDER);
				_localctx.instr = instruction.NewIf(((InstruccionContext)_localctx).expression.p, ((InstruccionContext)_localctx).instrucciones.l)
				}
				break;
			case P_WHILE:
				enterOuterAlt(_localctx, 5);
				{
				setState(66);
				match(P_WHILE);
				setState(67);
				match(PARIZQ);
				setState(68);
				((InstruccionContext)_localctx).expression = expression();
				setState(69);
				match(PARDER);
				setState(70);
				match(LLAVEIZQ);
				setState(71);
				((InstruccionContext)_localctx).instrucciones = instrucciones();
				setState(72);
				match(LLAVEDER);
				_localctx.instr = instruction.NewWhile(((InstruccionContext)_localctx).expression.p, ((InstruccionContext)_localctx).instrucciones.l)
				}
				break;
			case P_STRUCT:
				enterOuterAlt(_localctx, 6);
				{
				setState(75);
				match(P_STRUCT);
				setState(76);
				((InstruccionContext)_localctx).id = match(ID);
				setState(77);
				match(LLAVEIZQ);
				setState(78);
				((InstruccionContext)_localctx).lista = lista_att(0);
				setState(79);
				match(LLAVEDER);
				_localctx.instr = instruction.NewStruct((((InstruccionContext)_localctx).id!=null?((InstruccionContext)_localctx).id.getText():null), ((InstruccionContext)_localctx).lista.l)
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

	public static class Lista_attContext extends ParserRuleContext {
		public *arrayList.List l;
		public Lista_attContext list;
		public Token id;
		public TerminalNode DOSPT() { return getToken(Chems.DOSPT, 0); }
		public TerminalNode P_NUMBER() { return getToken(Chems.P_NUMBER, 0); }
		public TerminalNode ID() { return getToken(Chems.ID, 0); }
		public TerminalNode COMA() { return getToken(Chems.COMA, 0); }
		public Lista_attContext lista_att() {
			return getRuleContext(Lista_attContext.class,0);
		}
		public Lista_attContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lista_att; }
	}

	public final Lista_attContext lista_att() throws RecognitionException {
		return lista_att(0);
	}

	private Lista_attContext lista_att(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Lista_attContext _localctx = new Lista_attContext(_ctx, _parentState);
		Lista_attContext _prevctx = _localctx;
		int _startState = 6;
		enterRecursionRule(_localctx, 6, RULE_lista_att, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(85);
			((Lista_attContext)_localctx).id = match(ID);
			setState(86);
			match(DOSPT);
			setState(87);
			match(P_NUMBER);
			 
			                    ((Lista_attContext)_localctx).l =  arrayList.New();
			                    _localctx.l.Add((((Lista_attContext)_localctx).id!=null?((Lista_attContext)_localctx).id.getText():null));
			                
			}
			_ctx.stop = _input.LT(-1);
			setState(98);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Lista_attContext(_parentctx, _parentState);
					_localctx.list = _prevctx;
					_localctx.list = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_lista_att);
					setState(90);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(91);
					match(COMA);
					setState(92);
					((Lista_attContext)_localctx).id = match(ID);
					setState(93);
					match(DOSPT);
					setState(94);
					match(P_NUMBER);
					 
					                                                  ((Lista_attContext)_localctx).list.l.Add((((Lista_attContext)_localctx).id!=null?((Lista_attContext)_localctx).id.getText():null));
					                                                  ((Lista_attContext)_localctx).l =  ((Lista_attContext)_localctx).list.l;
					                                              
					}
					} 
				}
				setState(100);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
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

	public static class Array_stContext extends ParserRuleContext {
		public bool arr;
		public TerminalNode CORIZQ() { return getToken(Chems.CORIZQ, 0); }
		public TerminalNode CORDER() { return getToken(Chems.CORDER, 0); }
		public Array_stContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_st; }
	}

	public final Array_stContext array_st() throws RecognitionException {
		Array_stContext _localctx = new Array_stContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_array_st);
		try {
			setState(105);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CORIZQ:
				enterOuterAlt(_localctx, 1);
				{
				setState(101);
				match(CORIZQ);
				setState(102);
				match(CORDER);
				 _localctx.arr = true 
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class Struct_stContext extends ParserRuleContext {
		public bool stru;
		public TerminalNode LLAVEIZQ() { return getToken(Chems.LLAVEIZQ, 0); }
		public TerminalNode LLAVEDER() { return getToken(Chems.LLAVEDER, 0); }
		public Struct_stContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_struct_st; }
	}

	public final Struct_stContext struct_st() throws RecognitionException {
		Struct_stContext _localctx = new Struct_stContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_struct_st);
		try {
			setState(111);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LLAVEIZQ:
				enterOuterAlt(_localctx, 1);
				{
				setState(107);
				match(LLAVEIZQ);
				setState(108);
				match(LLAVEDER);
				 _localctx.stru = true 
				}
				break;
			case ID:
			case CORIZQ:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class ExpressionContext extends ParserRuleContext {
		public interfaces.Expresion p;
		public Expr_aritContext expr_arit;
		public Expr_aritContext expr_arit() {
			return getRuleContext(Expr_aritContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			((ExpressionContext)_localctx).expr_arit = expr_arit(0);
			_localctx.p = ((ExpressionContext)_localctx).expr_arit.p
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

	public static class Expr_aritContext extends ParserRuleContext {
		public interfaces.Expresion p;
		public Expr_aritContext opIz;
		public ListValuesContext listValues;
		public Token id;
		public PrimitivoContext primitivo;
		public ExpressionContext expression;
		public Token op;
		public Expr_aritContext opDe;
		public TerminalNode CORIZQ() { return getToken(Chems.CORIZQ, 0); }
		public ListValuesContext listValues() {
			return getRuleContext(ListValuesContext.class,0);
		}
		public TerminalNode CORDER() { return getToken(Chems.CORDER, 0); }
		public TerminalNode LLAVEIZQ() { return getToken(Chems.LLAVEIZQ, 0); }
		public TerminalNode LLAVEDER() { return getToken(Chems.LLAVEDER, 0); }
		public TerminalNode ID() { return getToken(Chems.ID, 0); }
		public PrimitivoContext primitivo() {
			return getRuleContext(PrimitivoContext.class,0);
		}
		public TerminalNode PARIZQ() { return getToken(Chems.PARIZQ, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode PARDER() { return getToken(Chems.PARDER, 0); }
		public List<Expr_aritContext> expr_arit() {
			return getRuleContexts(Expr_aritContext.class);
		}
		public Expr_aritContext expr_arit(int i) {
			return getRuleContext(Expr_aritContext.class,i);
		}
		public TerminalNode MUL() { return getToken(Chems.MUL, 0); }
		public TerminalNode DIV() { return getToken(Chems.DIV, 0); }
		public TerminalNode ADD() { return getToken(Chems.ADD, 0); }
		public TerminalNode SUB() { return getToken(Chems.SUB, 0); }
		public TerminalNode MENOR() { return getToken(Chems.MENOR, 0); }
		public TerminalNode MENORIGUAL() { return getToken(Chems.MENORIGUAL, 0); }
		public TerminalNode MAYORIGUAL() { return getToken(Chems.MAYORIGUAL, 0); }
		public TerminalNode MAYOR() { return getToken(Chems.MAYOR, 0); }
		public Expr_aritContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_arit; }
	}

	public final Expr_aritContext expr_arit() throws RecognitionException {
		return expr_arit(0);
	}

	private Expr_aritContext expr_arit(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Expr_aritContext _localctx = new Expr_aritContext(_ctx, _parentState);
		Expr_aritContext _prevctx = _localctx;
		int _startState = 14;
		enterRecursionRule(_localctx, 14, RULE_expr_arit, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CORIZQ:
				{
				setState(117);
				match(CORIZQ);
				setState(118);
				((Expr_aritContext)_localctx).listValues = listValues(0);
				setState(119);
				match(CORDER);
				 _localctx.p = expresion.NewArray(((Expr_aritContext)_localctx).listValues.l) 
				}
				break;
			case LLAVEIZQ:
				{
				setState(122);
				match(LLAVEIZQ);
				setState(123);
				((Expr_aritContext)_localctx).listValues = listValues(0);
				setState(124);
				match(LLAVEDER);
				setState(125);
				((Expr_aritContext)_localctx).id = match(ID);
				 _localctx.p = expresion.NewStruct((((Expr_aritContext)_localctx).id!=null?((Expr_aritContext)_localctx).id.getText():null), ((Expr_aritContext)_localctx).listValues.l) 
				}
				break;
			case NUMBER:
			case STRING:
			case ID:
				{
				setState(128);
				((Expr_aritContext)_localctx).primitivo = primitivo();
				_localctx.p = ((Expr_aritContext)_localctx).primitivo.p
				}
				break;
			case PARIZQ:
				{
				setState(131);
				match(PARIZQ);
				setState(132);
				((Expr_aritContext)_localctx).expression = expression();
				setState(133);
				match(PARDER);
				_localctx.p = ((Expr_aritContext)_localctx).expression.p
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(155);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(153);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
					case 1:
						{
						_localctx = new Expr_aritContext(_parentctx, _parentState);
						_localctx.opIz = _prevctx;
						_localctx.opIz = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr_arit);
						setState(138);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(139);
						((Expr_aritContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==MUL || _la==DIV) ) {
							((Expr_aritContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(140);
						((Expr_aritContext)_localctx).opDe = expr_arit(8);
						_localctx.p = expresion.NewOperacion(((Expr_aritContext)_localctx).opIz.p,(((Expr_aritContext)_localctx).op!=null?((Expr_aritContext)_localctx).op.getText():null),((Expr_aritContext)_localctx).opDe.p,false)
						}
						break;
					case 2:
						{
						_localctx = new Expr_aritContext(_parentctx, _parentState);
						_localctx.opIz = _prevctx;
						_localctx.opIz = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr_arit);
						setState(143);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(144);
						((Expr_aritContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==ADD || _la==SUB) ) {
							((Expr_aritContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(145);
						((Expr_aritContext)_localctx).opDe = expr_arit(7);
						_localctx.p = expresion.NewOperacion(((Expr_aritContext)_localctx).opIz.p,(((Expr_aritContext)_localctx).op!=null?((Expr_aritContext)_localctx).op.getText():null),((Expr_aritContext)_localctx).opDe.p,false)
						}
						break;
					case 3:
						{
						_localctx = new Expr_aritContext(_parentctx, _parentState);
						_localctx.opIz = _prevctx;
						_localctx.opIz = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr_arit);
						setState(148);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(149);
						((Expr_aritContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MAYORIGUAL) | (1L << MENORIGUAL) | (1L << MAYOR) | (1L << MENOR))) != 0)) ) {
							((Expr_aritContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(150);
						((Expr_aritContext)_localctx).opDe = expr_arit(6);
						_localctx.p = expresion.NewOperacion(((Expr_aritContext)_localctx).opIz.p,(((Expr_aritContext)_localctx).op!=null?((Expr_aritContext)_localctx).op.getText():null),((Expr_aritContext)_localctx).opDe.p,false)
						}
						break;
					}
					} 
				}
				setState(157);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
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

	public static class ListValuesContext extends ParserRuleContext {
		public *arrayList.List l;
		public ListValuesContext list;
		public ExpressionContext expression;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode COMA() { return getToken(Chems.COMA, 0); }
		public ListValuesContext listValues() {
			return getRuleContext(ListValuesContext.class,0);
		}
		public ListValuesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listValues; }
	}

	public final ListValuesContext listValues() throws RecognitionException {
		return listValues(0);
	}

	private ListValuesContext listValues(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ListValuesContext _localctx = new ListValuesContext(_ctx, _parentState);
		ListValuesContext _prevctx = _localctx;
		int _startState = 16;
		enterRecursionRule(_localctx, 16, RULE_listValues, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(159);
			((ListValuesContext)_localctx).expression = expression();
			 
			                    _localctx.l = arrayList.New()
			                    _localctx.l.Add(((ListValuesContext)_localctx).expression.p)
			                
			}
			_ctx.stop = _input.LT(-1);
			setState(169);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ListValuesContext(_parentctx, _parentState);
					_localctx.list = _prevctx;
					_localctx.list = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_listValues);
					setState(162);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(163);
					match(COMA);
					setState(164);
					((ListValuesContext)_localctx).expression = expression();
					 
					                                                  ((ListValuesContext)_localctx).list.l.Add(((ListValuesContext)_localctx).expression.p)
					                                                  _localctx.l = ((ListValuesContext)_localctx).list.l
					                                              
					}
					} 
				}
				setState(171);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
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

	public static class PrimitivoContext extends ParserRuleContext {
		public interfaces.Expresion p;
		public Token NUMBER;
		public Token STRING;
		public ListArrayContext list;
		public TerminalNode NUMBER() { return getToken(Chems.NUMBER, 0); }
		public TerminalNode STRING() { return getToken(Chems.STRING, 0); }
		public ListArrayContext listArray() {
			return getRuleContext(ListArrayContext.class,0);
		}
		public PrimitivoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitivo; }
	}

	public final PrimitivoContext primitivo() throws RecognitionException {
		PrimitivoContext _localctx = new PrimitivoContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_primitivo);
		try {
			setState(179);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(172);
				((PrimitivoContext)_localctx).NUMBER = match(NUMBER);

				            	num,err := strconv.Atoi((((PrimitivoContext)_localctx).NUMBER!=null?((PrimitivoContext)_localctx).NUMBER.getText():null))
				                if err!= nil{
				                    fmt.Println(err)
				                }
				            _localctx.p = expresion.NewPrimitivo (num,interfaces.INTEGER)
				       
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(174);
				((PrimitivoContext)_localctx).STRING = match(STRING);
				 
				      str:= (((PrimitivoContext)_localctx).STRING!=null?((PrimitivoContext)_localctx).STRING.getText():null)[1:len((((PrimitivoContext)_localctx).STRING!=null?((PrimitivoContext)_localctx).STRING.getText():null))-1]
				      _localctx.p = expresion.NewPrimitivo(str,interfaces.STRING)
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 3);
				{
				setState(176);
				((PrimitivoContext)_localctx).list = listArray(0);
				 _localctx.p = ((PrimitivoContext)_localctx).list.p
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

	public static class ListArrayContext extends ParserRuleContext {
		public interfaces.Expresion p;
		public ListArrayContext list;
		public Token ID;
		public ExpressionContext expression;
		public TerminalNode ID() { return getToken(Chems.ID, 0); }
		public TerminalNode CORIZQ() { return getToken(Chems.CORIZQ, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CORDER() { return getToken(Chems.CORDER, 0); }
		public ListArrayContext listArray() {
			return getRuleContext(ListArrayContext.class,0);
		}
		public ListArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listArray; }
	}

	public final ListArrayContext listArray() throws RecognitionException {
		return listArray(0);
	}

	private ListArrayContext listArray(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ListArrayContext _localctx = new ListArrayContext(_ctx, _parentState);
		ListArrayContext _prevctx = _localctx;
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_listArray, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(182);
			((ListArrayContext)_localctx).ID = match(ID);
			 _localctx.p = expresion.NewCallVariable((((ListArrayContext)_localctx).ID!=null?((ListArrayContext)_localctx).ID.getText():null))
			}
			_ctx.stop = _input.LT(-1);
			setState(193);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ListArrayContext(_parentctx, _parentState);
					_localctx.list = _prevctx;
					_localctx.list = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_listArray);
					setState(185);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(186);
					match(CORIZQ);
					setState(187);
					((ListArrayContext)_localctx).expression = expression();
					setState(188);
					match(CORDER);
					 _localctx.p = expresion.NewArrayAccess(((ListArrayContext)_localctx).list.p, ((ListArrayContext)_localctx).expression.p) 
					}
					} 
				}
				setState(195);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 3:
			return lista_att_sempred((Lista_attContext)_localctx, predIndex);
		case 7:
			return expr_arit_sempred((Expr_aritContext)_localctx, predIndex);
		case 8:
			return listValues_sempred((ListValuesContext)_localctx, predIndex);
		case 10:
			return listArray_sempred((ListArrayContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean lista_att_sempred(Lista_attContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean expr_arit_sempred(Expr_aritContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 7);
		case 2:
			return precpred(_ctx, 6);
		case 3:
			return precpred(_ctx, 5);
		}
		return true;
	}
	private boolean listValues_sempred(ListValuesContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean listArray_sempred(ListArrayContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3!\u00c7\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\3\2\3\2\3\2\3\3\7\3\35\n\3\f\3\16\3 \13\3\3\3\3\3\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4U\n\4\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5c\n\5\f\5\16\5f\13\5\3\6\3\6\3"+
		"\6\3\6\5\6l\n\6\3\7\3\7\3\7\3\7\5\7r\n\7\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u008b"+
		"\n\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u009c"+
		"\n\t\f\t\16\t\u009f\13\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u00aa"+
		"\n\n\f\n\16\n\u00ad\13\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u00b6"+
		"\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u00c2\n\f\f\f\16\f\u00c5"+
		"\13\f\3\f\2\6\b\20\22\26\r\2\4\6\b\n\f\16\20\22\24\26\2\5\3\2\27\30\3"+
		"\2\31\32\3\2\23\26\2\u00ce\2\30\3\2\2\2\4\36\3\2\2\2\6T\3\2\2\2\bV\3\2"+
		"\2\2\nk\3\2\2\2\fq\3\2\2\2\16s\3\2\2\2\20\u008a\3\2\2\2\22\u00a0\3\2\2"+
		"\2\24\u00b5\3\2\2\2\26\u00b7\3\2\2\2\30\31\5\4\3\2\31\32\b\2\1\2\32\3"+
		"\3\2\2\2\33\35\5\6\4\2\34\33\3\2\2\2\35 \3\2\2\2\36\34\3\2\2\2\36\37\3"+
		"\2\2\2\37!\3\2\2\2 \36\3\2\2\2!\"\b\3\1\2\"\5\3\2\2\2#$\7\3\2\2$%\7\r"+
		"\2\2%&\7\4\2\2&\'\7\33\2\2\'(\5\16\b\2()\7\34\2\2)*\7\16\2\2*+\b\4\1\2"+
		"+U\3\2\2\2,-\7\5\2\2-.\5\f\7\2./\5\n\6\2/\60\7\f\2\2\60\61\7\22\2\2\61"+
		"\62\5\16\b\2\62\63\7\16\2\2\63\64\b\4\1\2\64U\3\2\2\2\65\66\7\f\2\2\66"+
		"\67\7\22\2\2\678\5\16\b\289\7\16\2\29:\b\4\1\2:U\3\2\2\2;<\7\7\2\2<=\7"+
		"\33\2\2=>\5\16\b\2>?\7\34\2\2?@\7\35\2\2@A\5\4\3\2AB\7\36\2\2BC\b\4\1"+
		"\2CU\3\2\2\2DE\7\b\2\2EF\7\33\2\2FG\5\16\b\2GH\7\34\2\2HI\7\35\2\2IJ\5"+
		"\4\3\2JK\7\36\2\2KL\b\4\1\2LU\3\2\2\2MN\7\t\2\2NO\7\f\2\2OP\7\35\2\2P"+
		"Q\5\b\5\2QR\7\36\2\2RS\b\4\1\2SU\3\2\2\2T#\3\2\2\2T,\3\2\2\2T\65\3\2\2"+
		"\2T;\3\2\2\2TD\3\2\2\2TM\3\2\2\2U\7\3\2\2\2VW\b\5\1\2WX\7\f\2\2XY\7\20"+
		"\2\2YZ\7\5\2\2Z[\b\5\1\2[d\3\2\2\2\\]\f\4\2\2]^\7\17\2\2^_\7\f\2\2_`\7"+
		"\20\2\2`a\7\5\2\2ac\b\5\1\2b\\\3\2\2\2cf\3\2\2\2db\3\2\2\2de\3\2\2\2e"+
		"\t\3\2\2\2fd\3\2\2\2gh\7\37\2\2hi\7 \2\2il\b\6\1\2jl\3\2\2\2kg\3\2\2\2"+
		"kj\3\2\2\2l\13\3\2\2\2mn\7\35\2\2no\7\36\2\2or\b\7\1\2pr\3\2\2\2qm\3\2"+
		"\2\2qp\3\2\2\2r\r\3\2\2\2st\5\20\t\2tu\b\b\1\2u\17\3\2\2\2vw\b\t\1\2w"+
		"x\7\37\2\2xy\5\22\n\2yz\7 \2\2z{\b\t\1\2{\u008b\3\2\2\2|}\7\35\2\2}~\5"+
		"\22\n\2~\177\7\36\2\2\177\u0080\7\f\2\2\u0080\u0081\b\t\1\2\u0081\u008b"+
		"\3\2\2\2\u0082\u0083\5\24\13\2\u0083\u0084\b\t\1\2\u0084\u008b\3\2\2\2"+
		"\u0085\u0086\7\33\2\2\u0086\u0087\5\16\b\2\u0087\u0088\7\34\2\2\u0088"+
		"\u0089\b\t\1\2\u0089\u008b\3\2\2\2\u008av\3\2\2\2\u008a|\3\2\2\2\u008a"+
		"\u0082\3\2\2\2\u008a\u0085\3\2\2\2\u008b\u009d\3\2\2\2\u008c\u008d\f\t"+
		"\2\2\u008d\u008e\t\2\2\2\u008e\u008f\5\20\t\n\u008f\u0090\b\t\1\2\u0090"+
		"\u009c\3\2\2\2\u0091\u0092\f\b\2\2\u0092\u0093\t\3\2\2\u0093\u0094\5\20"+
		"\t\t\u0094\u0095\b\t\1\2\u0095\u009c\3\2\2\2\u0096\u0097\f\7\2\2\u0097"+
		"\u0098\t\4\2\2\u0098\u0099\5\20\t\b\u0099\u009a\b\t\1\2\u009a\u009c\3"+
		"\2\2\2\u009b\u008c\3\2\2\2\u009b\u0091\3\2\2\2\u009b\u0096\3\2\2\2\u009c"+
		"\u009f\3\2\2\2\u009d\u009b\3\2\2\2\u009d\u009e\3\2\2\2\u009e\21\3\2\2"+
		"\2\u009f\u009d\3\2\2\2\u00a0\u00a1\b\n\1\2\u00a1\u00a2\5\16\b\2\u00a2"+
		"\u00a3\b\n\1\2\u00a3\u00ab\3\2\2\2\u00a4\u00a5\f\4\2\2\u00a5\u00a6\7\17"+
		"\2\2\u00a6\u00a7\5\16\b\2\u00a7\u00a8\b\n\1\2\u00a8\u00aa\3\2\2\2\u00a9"+
		"\u00a4\3\2\2\2\u00aa\u00ad\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ab\u00ac\3\2"+
		"\2\2\u00ac\23\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ae\u00af\7\n\2\2\u00af\u00b6"+
		"\b\13\1\2\u00b0\u00b1\7\13\2\2\u00b1\u00b6\b\13\1\2\u00b2\u00b3\5\26\f"+
		"\2\u00b3\u00b4\b\13\1\2\u00b4\u00b6\3\2\2\2\u00b5\u00ae\3\2\2\2\u00b5"+
		"\u00b0\3\2\2\2\u00b5\u00b2\3\2\2\2\u00b6\25\3\2\2\2\u00b7\u00b8\b\f\1"+
		"\2\u00b8\u00b9\7\f\2\2\u00b9\u00ba\b\f\1\2\u00ba\u00c3\3\2\2\2\u00bb\u00bc"+
		"\f\4\2\2\u00bc\u00bd\7\37\2\2\u00bd\u00be\5\16\b\2\u00be\u00bf\7 \2\2"+
		"\u00bf\u00c0\b\f\1\2\u00c0\u00c2\3\2\2\2\u00c1\u00bb\3\2\2\2\u00c2\u00c5"+
		"\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4\27\3\2\2\2\u00c5"+
		"\u00c3\3\2\2\2\r\36Tdkq\u008a\u009b\u009d\u00ab\u00b5\u00c3";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
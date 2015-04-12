// Generated from grammar.g4 by ANTLR 4.0

package rr;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNSimulator;
import org.antlr.v4.runtime.atn.ParserATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class grammarParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__13=1, T__12=2, T__11=3, T__10=4, T__9=5, T__8=6, T__7=7, T__6=8, T__5=9, 
		T__4=10, T__3=11, T__2=12, T__1=13, T__0=14, COMMENT=15, INT=16, DOUBLE=17, 
		ID=18, WS=19;
	public static final String[] tokenNames = {
		"<INVALID>", "')'", "','", "'+'", "'*'", "'-'", "'('", "'int'", "'='", 
		"';'", "'ret'", "'double'", "'write('", "'/'", "'read('", "COMMENT", "INT", 
		"DOUBLE", "ID", "WS"
	};
	public static final int
		RULE_program = 0, RULE_statement = 1, RULE_readFunction = 2, RULE_writeFunction = 3, 
		RULE_invocation = 4, RULE_expression = 5, RULE_artmExp = 6, RULE_mulExp = 7, 
		RULE_expOp = 8, RULE_var_dec = 9, RULE_type = 10, RULE_mull_operator = 11, 
		RULE_add_operator = 12;
	public static final String[] ruleNames = {
		"program", "statement", "ReadFunction", "WriteFunction", "invocation",
		"expression", "artmExp", "mulExp", "expOp", "var_dec", "type", "mull_operator", 
		"add_operator"
	};

	@Override
	public String getGrammarFileName() { return "grammar.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public grammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public Compiler.Program ret;
		public StatementContext s;
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammarListener) ((grammarListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammarListener) ((grammarListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			 ((ProgramContext)_localctx).ret =  new Compiler.Program(); 
			setState(33);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 7) | (1L << 10) | (1L << 11) | (1L << 12) | (1L << 14) | (1L << ID))) != 0)) {
				{
				{
				setState(27); ((ProgramContext)_localctx).s = statement();
				 _localctx.ret.add(((ProgramContext)_localctx).s.ret); 
				setState(29); match(9);
				}
				}
				setState(35);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class StatementContext extends ParserRuleContext {
		public Compiler.Statement ret;
		public Var_decContext c;
		public Token a;
		public ExpressionContext e;
		public ReadFunctionContext r;
		public WriteFunctionContext p;
		public InvocationContext invocation;
		public WriteFunctionContext writeFunction() {
			return getRuleContext(WriteFunctionContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Var_decContext var_dec() {
			return getRuleContext(Var_decContext.class,0);
		}
		public InvocationContext invocation() {
			return getRuleContext(InvocationContext.class,0);
		}
		public TerminalNode ID() { return getToken(grammarParser.ID, 0); }
		public ReadFunctionContext readFunction() {
			return getRuleContext(ReadFunctionContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammarListener) ((grammarListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammarListener) ((grammarListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(57);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(36); ((StatementContext)_localctx).c = var_dec();
				 ((StatementContext)_localctx).ret =  ((StatementContext)_localctx).c.val; 
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(39); ((StatementContext)_localctx).a = match(ID);
				setState(40); match(8);
				setState(41); ((StatementContext)_localctx).e = expression();
				 ((StatementContext)_localctx).ret =  new Compiler.Assignment((((StatementContext)_localctx).a!=null?((StatementContext)_localctx).a.getText():null), ((StatementContext)_localctx).e.ret); 
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(44); match(10);
				setState(45); ((StatementContext)_localctx).e = expression();
				 ((StatementContext)_localctx).ret =  new Compiler.Return(((StatementContext)_localctx).e.ret); 
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(48); ((StatementContext)_localctx).r = readFunction();
				 ((StatementContext)_localctx).ret =  ((StatementContext)_localctx).r.ret; 
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(51); ((StatementContext)_localctx).p = writeFunction();
				 ((StatementContext)_localctx).ret =  ((StatementContext)_localctx).p.ret; 
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(54); ((StatementContext)_localctx).invocation = invocation();
				 ((StatementContext)_localctx).ret =  ((StatementContext)_localctx).invocation.ret; 
				}
				break;
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

	public static class ReadFunctionContext extends ParserRuleContext {
		public Compiler.ReadFunction ret;
		public Token n;
		public TerminalNode ID() { return getToken(grammarParser.ID, 0); }
		public ReadFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_readFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammarListener) ((grammarListener)listener).enterReadFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammarListener) ((grammarListener)listener).exitReadFunction(this);
		}
	}

	public final ReadFunctionContext readFunction() throws RecognitionException {
		ReadFunctionContext _localctx = new ReadFunctionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_readFunction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59); match(14);
			setState(60); ((ReadFunctionContext)_localctx).n = match(ID);
			 ((ReadFunctionContext)_localctx).ret =  new Compiler.ReadFunction((((ReadFunctionContext)_localctx).n!=null?((ReadFunctionContext)_localctx).n.getText():null));
			setState(62); match(1);
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

	public static class WriteFunctionContext extends ParserRuleContext {
		public Compiler.WriteFunction ret;
		public Token n;
		public TerminalNode DOUBLE() { return getToken(grammarParser.DOUBLE, 0); }
		public TerminalNode INT() { return getToken(grammarParser.INT, 0); }
		public TerminalNode ID() { return getToken(grammarParser.ID, 0); }
		public WriteFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_writeFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammarListener) ((grammarListener)listener).enterWriteFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammarListener) ((grammarListener)listener).exitWriteFunction(this);
		}
	}

	public final WriteFunctionContext writeFunction() throws RecognitionException {
		WriteFunctionContext _localctx = new WriteFunctionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_writeFunction);
		try {
			setState(76);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(64); match(12);
				setState(65); ((WriteFunctionContext)_localctx).n = match(ID);
				 ((WriteFunctionContext)_localctx).ret =  new Compiler.WriteFunction((((WriteFunctionContext)_localctx).n!=null?((WriteFunctionContext)_localctx).n.getText():null));
				setState(67); match(1);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(68); match(12);
				setState(69); ((WriteFunctionContext)_localctx).n = match(INT);
				 ((WriteFunctionContext)_localctx).ret =  new Compiler.WriteFunction((((WriteFunctionContext)_localctx).n!=null?((WriteFunctionContext)_localctx).n.getText():null));
				setState(71); match(1);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(72); match(12);
				setState(73); ((WriteFunctionContext)_localctx).n = match(DOUBLE);
				 ((WriteFunctionContext)_localctx).ret =  new Compiler.WriteFunction((((WriteFunctionContext)_localctx).n!=null?((WriteFunctionContext)_localctx).n.getText():null));
				setState(75); match(1);
				}
				break;
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

	public static class InvocationContext extends ParserRuleContext {
		public Compiler.Invocation ret;
		public Token ID;
		public ExpressionContext a;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode ID() { return getToken(grammarParser.ID, 0); }
		public InvocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_invocation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammarListener) ((grammarListener)listener).enterInvocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammarListener) ((grammarListener)listener).exitInvocation(this);
		}
	}

	public final InvocationContext invocation() throws RecognitionException {
		InvocationContext _localctx = new InvocationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_invocation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78); ((InvocationContext)_localctx).ID = match(ID);
			 ((InvocationContext)_localctx).ret =  new Compiler.Invocation((((InvocationContext)_localctx).ID!=null?((InvocationContext)_localctx).ID.getText():null)); 
			setState(80); match(6);
			setState(92);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << DOUBLE) | (1L << ID))) != 0)) {
				{
				setState(81); ((InvocationContext)_localctx).a = expression();
				 _localctx.ret.add(((InvocationContext)_localctx).a.ret); 
				setState(89);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==2) {
					{
					{
					setState(83); match(2);
					setState(84); ((InvocationContext)_localctx).a = expression();
					 _localctx.ret.add(((InvocationContext)_localctx).a.ret); 
					}
					}
					setState(91);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(94); match(1);
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
		public Compiler.Expression ret;
		public Token INT;
		public Token DOUBLE;
		public ArtmExpContext b;
		public Token ID;
		public ArtmExpContext artmExp() {
			return getRuleContext(ArtmExpContext.class,0);
		}
		public TerminalNode DOUBLE() { return getToken(grammarParser.DOUBLE, 0); }
		public TerminalNode INT() { return getToken(grammarParser.INT, 0); }
		public TerminalNode ID() { return getToken(grammarParser.ID, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammarListener) ((grammarListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammarListener) ((grammarListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_expression);
		try {
			setState(105);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(96); ((ExpressionContext)_localctx).INT = match(INT);
				 ((ExpressionContext)_localctx).ret =  new Compiler.IntExpression((((ExpressionContext)_localctx).INT!=null?((ExpressionContext)_localctx).INT.getText():null)); 
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(98); ((ExpressionContext)_localctx).DOUBLE = match(DOUBLE);
				 ((ExpressionContext)_localctx).ret =  new Compiler.DoubleExpression((((ExpressionContext)_localctx).DOUBLE!=null?((ExpressionContext)_localctx).DOUBLE.getText():null)); 
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(100); ((ExpressionContext)_localctx).b = artmExp();
				 ((ExpressionContext)_localctx).ret =  ((ExpressionContext)_localctx).b.val; 
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(103); ((ExpressionContext)_localctx).ID = match(ID);
				 ((ExpressionContext)_localctx).ret =  new Compiler.RefExpression((((ExpressionContext)_localctx).ID!=null?((ExpressionContext)_localctx).ID.getText():null)); 
				}
				break;
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

	public static class ArtmExpContext extends ParserRuleContext {
		public Compiler.ArExpressionAll val;
		public MulExpContext a;
		public Add_operatorContext m;
		public MulExpContext b;
		public List<MulExpContext> mulExp() {
			return getRuleContexts(MulExpContext.class);
		}
		public List<Add_operatorContext> add_operator() {
			return getRuleContexts(Add_operatorContext.class);
		}
		public Add_operatorContext add_operator(int i) {
			return getRuleContext(Add_operatorContext.class,i);
		}
		public MulExpContext mulExp(int i) {
			return getRuleContext(MulExpContext.class,i);
		}
		public ArtmExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_artmExp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammarListener) ((grammarListener)listener).enterArtmExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammarListener) ((grammarListener)listener).exitArtmExp(this);
		}
	}

	public final ArtmExpContext artmExp() throws RecognitionException {
		ArtmExpContext _localctx = new ArtmExpContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_artmExp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107); ((ArtmExpContext)_localctx).a = mulExp();
			 ((ArtmExpContext)_localctx).val =  new Compiler.ArExpressionAll(((ArtmExpContext)_localctx).a.val); 
			setState(115);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==3 || _la==5) {
				{
				{
				setState(109); ((ArtmExpContext)_localctx).m = add_operator();
				setState(110); ((ArtmExpContext)_localctx).b = mulExp();
				 _localctx.val.add(((ArtmExpContext)_localctx).b.val, ((ArtmExpContext)_localctx).m.ret); 
				}
				}
				setState(117);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class MulExpContext extends ParserRuleContext {
		public Compiler.ArExpression val;
		public ExpOpContext a;
		public Mull_operatorContext m;
		public ExpOpContext b;
		public List<Mull_operatorContext> mull_operator() {
			return getRuleContexts(Mull_operatorContext.class);
		}
		public ExpOpContext expOp(int i) {
			return getRuleContext(ExpOpContext.class,i);
		}
		public Mull_operatorContext mull_operator(int i) {
			return getRuleContext(Mull_operatorContext.class,i);
		}
		public List<ExpOpContext> expOp() {
			return getRuleContexts(ExpOpContext.class);
		}
		public MulExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mulExp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammarListener) ((grammarListener)listener).enterMulExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammarListener) ((grammarListener)listener).exitMulExp(this);
		}
	}

	public final MulExpContext mulExp() throws RecognitionException {
		MulExpContext _localctx = new MulExpContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_mulExp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118); ((MulExpContext)_localctx).a = expOp();
			 ((MulExpContext)_localctx).val =  new Compiler.ArExpression(((MulExpContext)_localctx).a.val); 
			setState(126);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==4 || _la==13) {
				{
				{
				setState(120); ((MulExpContext)_localctx).m = mull_operator();
				setState(121); ((MulExpContext)_localctx).b = expOp();
				 _localctx.val.add(((MulExpContext)_localctx).b.val, ((MulExpContext)_localctx).m.ret); 
				}
				}
				setState(128);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class ExpOpContext extends ParserRuleContext {
		public Compiler.Expression val;
		public Token a;
		public Token c;
		public Token b;
		public TerminalNode DOUBLE() { return getToken(grammarParser.DOUBLE, 0); }
		public TerminalNode INT() { return getToken(grammarParser.INT, 0); }
		public TerminalNode ID() { return getToken(grammarParser.ID, 0); }
		public ExpOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammarListener) ((grammarListener)listener).enterExpOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammarListener) ((grammarListener)listener).exitExpOp(this);
		}
	}

	public final ExpOpContext expOp() throws RecognitionException {
		ExpOpContext _localctx = new ExpOpContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_expOp);
		try {
			setState(135);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(129); ((ExpOpContext)_localctx).a = match(INT);
				 ((ExpOpContext)_localctx).val =  new Compiler.IntExpression((((ExpOpContext)_localctx).a!=null?((ExpOpContext)_localctx).a.getText():null)); 
				}
				break;
			case DOUBLE:
				enterOuterAlt(_localctx, 2);
				{
				setState(131); ((ExpOpContext)_localctx).c = match(DOUBLE);
				 ((ExpOpContext)_localctx).val =  new Compiler.DoubleExpression((((ExpOpContext)_localctx).c!=null?((ExpOpContext)_localctx).c.getText():null)); 
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 3);
				{
				setState(133); ((ExpOpContext)_localctx).b = match(ID);
				 ((ExpOpContext)_localctx).val =  new Compiler.RefExpression((((ExpOpContext)_localctx).b!=null?((ExpOpContext)_localctx).b.getText():null)); 
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

	public static class Var_decContext extends ParserRuleContext {
		public Compiler.VariableDeclaration val;
		public TypeContext type;
		public Token ID;
		public TerminalNode ID() { return getToken(grammarParser.ID, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Var_decContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_dec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammarListener) ((grammarListener)listener).enterVar_dec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammarListener) ((grammarListener)listener).exitVar_dec(this);
		}
	}

	public final Var_decContext var_dec() throws RecognitionException {
		Var_decContext _localctx = new Var_decContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_var_dec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137); ((Var_decContext)_localctx).type = type();
			setState(138); ((Var_decContext)_localctx).ID = match(ID);
			 ((Var_decContext)_localctx).val =  new Compiler.VariableDeclaration((((Var_decContext)_localctx).ID!=null?((Var_decContext)_localctx).ID.getText():null), ((Var_decContext)_localctx).type.ret.getName()); 
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

	public static class TypeContext extends ParserRuleContext {
		public Compiler.Type ret;
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammarListener) ((grammarListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammarListener) ((grammarListener)listener).exitType(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_type);
		try {
			setState(145);
			switch (_input.LA(1)) {
			case 11:
				enterOuterAlt(_localctx, 1);
				{
				setState(141); match(11);
				 ((TypeContext)_localctx).ret =  new Compiler.Type("double"); 
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 2);
				{
				setState(143); match(7);
				 ((TypeContext)_localctx).ret =  new Compiler.Type("int"); 
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

	public static class Mull_operatorContext extends ParserRuleContext {
		public String ret;
		public Mull_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mull_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammarListener) ((grammarListener)listener).enterMull_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammarListener) ((grammarListener)listener).exitMull_operator(this);
		}
	}

	public final Mull_operatorContext mull_operator() throws RecognitionException {
		Mull_operatorContext _localctx = new Mull_operatorContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_mull_operator);
		try {
			setState(151);
			switch (_input.LA(1)) {
			case 4:
				enterOuterAlt(_localctx, 1);
				{
				setState(147); match(4);
				 ((Mull_operatorContext)_localctx).ret =  "*"; 
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 2);
				{
				setState(149); match(13);
				 ((Mull_operatorContext)_localctx).ret =  "/"; 
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

	public static class Add_operatorContext extends ParserRuleContext {
		public String ret;
		public Add_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_add_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammarListener) ((grammarListener)listener).enterAdd_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammarListener) ((grammarListener)listener).exitAdd_operator(this);
		}
	}

	public final Add_operatorContext add_operator() throws RecognitionException {
		Add_operatorContext _localctx = new Add_operatorContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_add_operator);
		try {
			setState(157);
			switch (_input.LA(1)) {
			case 3:
				enterOuterAlt(_localctx, 1);
				{
				setState(153); match(3);
				 ((Add_operatorContext)_localctx).ret =  "+"; 
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 2);
				{
				setState(155); match(5);
				 ((Add_operatorContext)_localctx).ret =  "-"; 
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

	public static final String _serializedATN =
		"\2\3\25\u00a2\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b"+
		"\4\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\3\2\3\2\3\2\3\2\3"+
		"\2\7\2\"\n\2\f\2\16\2%\13\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3<\n\3\3\4\3\4\3\4\3\4\3"+
		"\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5O\n\5\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6Z\n\6\f\6\16\6]\13\6\5\6_\n\6\3\6\3\6\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7l\n\7\3\b\3\b\3\b\3\b\3\b\3\b\7"+
		"\bt\n\b\f\b\16\bw\13\b\3\t\3\t\3\t\3\t\3\t\3\t\7\t\177\n\t\f\t\16\t\u0082"+
		"\13\t\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u008a\n\n\3\13\3\13\3\13\3\13\3\f\3"+
		"\f\3\f\3\f\5\f\u0094\n\f\3\r\3\r\3\r\3\r\5\r\u009a\n\r\3\16\3\16\3\16"+
		"\3\16\5\16\u00a0\n\16\3\16\2\17\2\4\6\b\n\f\16\20\22\24\26\30\32\2\2\u00a8"+
		"\2\34\3\2\2\2\4;\3\2\2\2\6=\3\2\2\2\bN\3\2\2\2\nP\3\2\2\2\fk\3\2\2\2\16"+
		"m\3\2\2\2\20x\3\2\2\2\22\u0089\3\2\2\2\24\u008b\3\2\2\2\26\u0093\3\2\2"+
		"\2\30\u0099\3\2\2\2\32\u009f\3\2\2\2\34#\b\2\1\2\35\36\5\4\3\2\36\37\b"+
		"\2\1\2\37 \7\13\2\2 \"\3\2\2\2!\35\3\2\2\2\"%\3\2\2\2#!\3\2\2\2#$\3\2"+
		"\2\2$\3\3\2\2\2%#\3\2\2\2&\'\5\24\13\2\'(\b\3\1\2(<\3\2\2\2)*\7\24\2\2"+
		"*+\7\n\2\2+,\5\f\7\2,-\b\3\1\2-<\3\2\2\2./\7\f\2\2/\60\5\f\7\2\60\61\b"+
		"\3\1\2\61<\3\2\2\2\62\63\5\6\4\2\63\64\b\3\1\2\64<\3\2\2\2\65\66\5\b\5"+
		"\2\66\67\b\3\1\2\67<\3\2\2\289\5\n\6\29:\b\3\1\2:<\3\2\2\2;&\3\2\2\2;"+
		")\3\2\2\2;.\3\2\2\2;\62\3\2\2\2;\65\3\2\2\2;8\3\2\2\2<\5\3\2\2\2=>\7\20"+
		"\2\2>?\7\24\2\2?@\b\4\1\2@A\7\3\2\2A\7\3\2\2\2BC\7\16\2\2CD\7\24\2\2D"+
		"E\b\5\1\2EO\7\3\2\2FG\7\16\2\2GH\7\22\2\2HI\b\5\1\2IO\7\3\2\2JK\7\16\2"+
		"\2KL\7\23\2\2LM\b\5\1\2MO\7\3\2\2NB\3\2\2\2NF\3\2\2\2NJ\3\2\2\2O\t\3\2"+
		"\2\2PQ\7\24\2\2QR\b\6\1\2R^\7\b\2\2ST\5\f\7\2T[\b\6\1\2UV\7\4\2\2VW\5"+
		"\f\7\2WX\b\6\1\2XZ\3\2\2\2YU\3\2\2\2Z]\3\2\2\2[Y\3\2\2\2[\\\3\2\2\2\\"+
		"_\3\2\2\2][\3\2\2\2^S\3\2\2\2^_\3\2\2\2_`\3\2\2\2`a\7\3\2\2a\13\3\2\2"+
		"\2bc\7\22\2\2cl\b\7\1\2de\7\23\2\2el\b\7\1\2fg\5\16\b\2gh\b\7\1\2hl\3"+
		"\2\2\2ij\7\24\2\2jl\b\7\1\2kb\3\2\2\2kd\3\2\2\2kf\3\2\2\2ki\3\2\2\2l\r"+
		"\3\2\2\2mn\5\20\t\2nu\b\b\1\2op\5\32\16\2pq\5\20\t\2qr\b\b\1\2rt\3\2\2"+
		"\2so\3\2\2\2tw\3\2\2\2us\3\2\2\2uv\3\2\2\2v\17\3\2\2\2wu\3\2\2\2xy\5\22"+
		"\n\2y\u0080\b\t\1\2z{\5\30\r\2{|\5\22\n\2|}\b\t\1\2}\177\3\2\2\2~z\3\2"+
		"\2\2\177\u0082\3\2\2\2\u0080~\3\2\2\2\u0080\u0081\3\2\2\2\u0081\21\3\2"+
		"\2\2\u0082\u0080\3\2\2\2\u0083\u0084\7\22\2\2\u0084\u008a\b\n\1\2\u0085"+
		"\u0086\7\23\2\2\u0086\u008a\b\n\1\2\u0087\u0088\7\24\2\2\u0088\u008a\b"+
		"\n\1\2\u0089\u0083\3\2\2\2\u0089\u0085\3\2\2\2\u0089\u0087\3\2\2\2\u008a"+
		"\23\3\2\2\2\u008b\u008c\5\26\f\2\u008c\u008d\7\24\2\2\u008d\u008e\b\13"+
		"\1\2\u008e\25\3\2\2\2\u008f\u0090\7\r\2\2\u0090\u0094\b\f\1\2\u0091\u0092"+
		"\7\t\2\2\u0092\u0094\b\f\1\2\u0093\u008f\3\2\2\2\u0093\u0091\3\2\2\2\u0094"+
		"\27\3\2\2\2\u0095\u0096\7\6\2\2\u0096\u009a\b\r\1\2\u0097\u0098\7\17\2"+
		"\2\u0098\u009a\b\r\1\2\u0099\u0095\3\2\2\2\u0099\u0097\3\2\2\2\u009a\31"+
		"\3\2\2\2\u009b\u009c\7\5\2\2\u009c\u00a0\b\16\1\2\u009d\u009e\7\7\2\2"+
		"\u009e\u00a0\b\16\1\2\u009f\u009b\3\2\2\2\u009f\u009d\3\2\2\2\u00a0\33"+
		"\3\2\2\2\16#;N[^ku\u0080\u0089\u0093\u0099\u009f";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}
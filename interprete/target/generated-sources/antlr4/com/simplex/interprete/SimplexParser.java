// Generated from com/simplex/interprete/Simplex.g4 by ANTLR 4.5.1
package com.simplex.interprete;



import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SimplexParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		MAX=1, MIN=2, RES=3, VAR=4, LIM=5, MAS=6, MENOS=7, MULT=8, DIV=9, GT=10, 
		LT=11, LE=12, GE=13, EQ=14, COMA=15, BEGIN=16, END=17, MFUNCTIONS=18, 
		ID=19, FLOAT=20, WS=21;
	public static final int
		RULE_program = 0, RULE_other = 1, RULE_problem = 2, RULE_variables = 3, 
		RULE_objective = 4, RULE_function = 5, RULE_item = 6, RULE_fItem = 7, 
		RULE_operator = 8, RULE_restric = 9, RULE_lComparation = 10, RULE_lComp = 11, 
		RULE_bounds = 12;
	public static final String[] ruleNames = {
		"program", "other", "problem", "variables", "objective", "function", "item", 
		"fItem", "operator", "restric", "lComparation", "lComp", "bounds"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'maximieren'", "'minimieren'", "'cortapisa'", "'variabilis'", "'fines'", 
		"'+'", "'-'", "'*'", "'/'", "'>'", "'<'", "'<='", "'>='", "'='", "','", 
		"'Dantzig'", "'MayoDe2005'", "'Goicochea'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "MAX", "MIN", "RES", "VAR", "LIM", "MAS", "MENOS", "MULT", "DIV", 
		"GT", "LT", "LE", "GE", "EQ", "COMA", "BEGIN", "END", "MFUNCTIONS", "ID", 
		"FLOAT", "WS"
	};
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
	public String getGrammarFileName() { return "Simplex.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }




	public SimplexParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode BEGIN() { return getToken(SimplexParser.BEGIN, 0); }
		public ProblemContext problem() {
			return getRuleContext(ProblemContext.class,0);
		}
		public TerminalNode END() { return getToken(SimplexParser.END, 0); }
		public List<OtherContext> other() {
			return getRuleContexts(OtherContext.class);
		}
		public OtherContext other(int i) {
			return getRuleContext(OtherContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimplexListener ) ((SimplexListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimplexListener ) ((SimplexListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimplexVisitor ) return ((SimplexVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(26);
			match(BEGIN);
			setState(27);
			problem();
			setState(31);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MFUNCTIONS) {
				{
				{
				setState(28);
				other();
				}
				}
				setState(33);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(34);
			match(END);
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

	public static class OtherContext extends ParserRuleContext {
		public TerminalNode MFUNCTIONS() { return getToken(SimplexParser.MFUNCTIONS, 0); }
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public OtherContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_other; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimplexListener ) ((SimplexListener)listener).enterOther(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimplexListener ) ((SimplexListener)listener).exitOther(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimplexVisitor ) return ((SimplexVisitor<? extends T>)visitor).visitOther(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OtherContext other() throws RecognitionException {
		OtherContext _localctx = new OtherContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_other);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(36);
			match(MFUNCTIONS);
			setState(37);
			function();
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

	public static class ProblemContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(SimplexParser.VAR, 0); }
		public ObjectiveContext objective() {
			return getRuleContext(ObjectiveContext.class,0);
		}
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public TerminalNode RES() { return getToken(SimplexParser.RES, 0); }
		public TerminalNode LIM() { return getToken(SimplexParser.LIM, 0); }
		public List<VariablesContext> variables() {
			return getRuleContexts(VariablesContext.class);
		}
		public VariablesContext variables(int i) {
			return getRuleContext(VariablesContext.class,i);
		}
		public List<RestricContext> restric() {
			return getRuleContexts(RestricContext.class);
		}
		public RestricContext restric(int i) {
			return getRuleContext(RestricContext.class,i);
		}
		public List<BoundsContext> bounds() {
			return getRuleContexts(BoundsContext.class);
		}
		public BoundsContext bounds(int i) {
			return getRuleContext(BoundsContext.class,i);
		}
		public ProblemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_problem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimplexListener ) ((SimplexListener)listener).enterProblem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimplexListener ) ((SimplexListener)listener).exitProblem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimplexVisitor ) return ((SimplexVisitor<? extends T>)visitor).visitProblem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProblemContext problem() throws RecognitionException {
		ProblemContext _localctx = new ProblemContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_problem);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(39);
			match(VAR);
			setState(41); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(40);
				variables();
				}
				}
				setState(43); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ID );
			setState(45);
			objective();
			setState(46);
			function();
			setState(47);
			match(RES);
			setState(51);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MAS) | (1L << MENOS) | (1L << ID) | (1L << FLOAT))) != 0)) {
				{
				{
				setState(48);
				restric();
				}
				}
				setState(53);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(54);
			match(LIM);
			setState(58);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID || _la==FLOAT) {
				{
				{
				setState(55);
				bounds();
				}
				}
				setState(60);
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

	public static class VariablesContext extends ParserRuleContext {
		public VariablesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variables; }
	 
		public VariablesContext() { }
		public void copyFrom(VariablesContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class VariableContext extends VariablesContext {
		public TerminalNode ID() { return getToken(SimplexParser.ID, 0); }
		public VariableContext(VariablesContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimplexListener ) ((SimplexListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimplexListener ) ((SimplexListener)listener).exitVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimplexVisitor ) return ((SimplexVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariablesContext variables() throws RecognitionException {
		VariablesContext _localctx = new VariablesContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_variables);
		try {
			_localctx = new VariableContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			match(ID);
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

	public static class ObjectiveContext extends ParserRuleContext {
		public TerminalNode MAX() { return getToken(SimplexParser.MAX, 0); }
		public TerminalNode MIN() { return getToken(SimplexParser.MIN, 0); }
		public ObjectiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objective; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimplexListener ) ((SimplexListener)listener).enterObjective(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimplexListener ) ((SimplexListener)listener).exitObjective(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimplexVisitor ) return ((SimplexVisitor<? extends T>)visitor).visitObjective(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjectiveContext objective() throws RecognitionException {
		ObjectiveContext _localctx = new ObjectiveContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_objective);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			_la = _input.LA(1);
			if ( !(_la==MAX || _la==MIN) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
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

	public static class FunctionContext extends ParserRuleContext {
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
	 
		public FunctionContext() { }
		public void copyFrom(FunctionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FuncContext extends FunctionContext {
		public FItemContext fItem() {
			return getRuleContext(FItemContext.class,0);
		}
		public List<OperatorContext> operator() {
			return getRuleContexts(OperatorContext.class);
		}
		public OperatorContext operator(int i) {
			return getRuleContext(OperatorContext.class,i);
		}
		public List<ItemContext> item() {
			return getRuleContexts(ItemContext.class);
		}
		public ItemContext item(int i) {
			return getRuleContext(ItemContext.class,i);
		}
		public FuncContext(FunctionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimplexListener ) ((SimplexListener)listener).enterFunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimplexListener ) ((SimplexListener)listener).exitFunc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimplexVisitor ) return ((SimplexVisitor<? extends T>)visitor).visitFunc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_function);
		int _la;
		try {
			_localctx = new FuncContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			fItem();
			setState(71);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MAS || _la==MENOS) {
				{
				{
				setState(66);
				operator();
				setState(67);
				item();
				}
				}
				setState(73);
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

	public static class ItemContext extends ParserRuleContext {
		public TerminalNode FLOAT() { return getToken(SimplexParser.FLOAT, 0); }
		public TerminalNode ID() { return getToken(SimplexParser.ID, 0); }
		public ItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimplexListener ) ((SimplexListener)listener).enterItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimplexListener ) ((SimplexListener)listener).exitItem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimplexVisitor ) return ((SimplexVisitor<? extends T>)visitor).visitItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ItemContext item() throws RecognitionException {
		ItemContext _localctx = new ItemContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_item);
		try {
			setState(78);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(74);
				match(FLOAT);
				setState(75);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(76);
				match(ID);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(77);
				match(FLOAT);
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

	public static class FItemContext extends ParserRuleContext {
		public ItemContext item() {
			return getRuleContext(ItemContext.class,0);
		}
		public OperatorContext operator() {
			return getRuleContext(OperatorContext.class,0);
		}
		public FItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimplexListener ) ((SimplexListener)listener).enterFItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimplexListener ) ((SimplexListener)listener).exitFItem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimplexVisitor ) return ((SimplexVisitor<? extends T>)visitor).visitFItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FItemContext fItem() throws RecognitionException {
		FItemContext _localctx = new FItemContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_fItem);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			_la = _input.LA(1);
			if (_la==MAS || _la==MENOS) {
				{
				setState(80);
				operator();
				}
			}

			setState(83);
			item();
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

	public static class OperatorContext extends ParserRuleContext {
		public TerminalNode MAS() { return getToken(SimplexParser.MAS, 0); }
		public TerminalNode MENOS() { return getToken(SimplexParser.MENOS, 0); }
		public OperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimplexListener ) ((SimplexListener)listener).enterOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimplexListener ) ((SimplexListener)listener).exitOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimplexVisitor ) return ((SimplexVisitor<? extends T>)visitor).visitOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperatorContext operator() throws RecognitionException {
		OperatorContext _localctx = new OperatorContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			_la = _input.LA(1);
			if ( !(_la==MAS || _la==MENOS) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
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

	public static class RestricContext extends ParserRuleContext {
		public RestricContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_restric; }
	 
		public RestricContext() { }
		public void copyFrom(RestricContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ResContext extends RestricContext {
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public LComparationContext lComparation() {
			return getRuleContext(LComparationContext.class,0);
		}
		public TerminalNode FLOAT() { return getToken(SimplexParser.FLOAT, 0); }
		public OperatorContext operator() {
			return getRuleContext(OperatorContext.class,0);
		}
		public ResContext(RestricContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimplexListener ) ((SimplexListener)listener).enterRes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimplexListener ) ((SimplexListener)listener).exitRes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimplexVisitor ) return ((SimplexVisitor<? extends T>)visitor).visitRes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RestricContext restric() throws RecognitionException {
		RestricContext _localctx = new RestricContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_restric);
		int _la;
		try {
			_localctx = new ResContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			function();
			setState(88);
			lComparation();
			setState(90);
			_la = _input.LA(1);
			if (_la==MAS || _la==MENOS) {
				{
				setState(89);
				operator();
				}
			}

			setState(92);
			match(FLOAT);
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

	public static class LComparationContext extends ParserRuleContext {
		public TerminalNode LE() { return getToken(SimplexParser.LE, 0); }
		public TerminalNode GE() { return getToken(SimplexParser.GE, 0); }
		public TerminalNode EQ() { return getToken(SimplexParser.EQ, 0); }
		public LComparationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lComparation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimplexListener ) ((SimplexListener)listener).enterLComparation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimplexListener ) ((SimplexListener)listener).exitLComparation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimplexVisitor ) return ((SimplexVisitor<? extends T>)visitor).visitLComparation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LComparationContext lComparation() throws RecognitionException {
		LComparationContext _localctx = new LComparationContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_lComparation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LE) | (1L << GE) | (1L << EQ))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
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

	public static class LCompContext extends ParserRuleContext {
		public TerminalNode LE() { return getToken(SimplexParser.LE, 0); }
		public TerminalNode GE() { return getToken(SimplexParser.GE, 0); }
		public LCompContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lComp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimplexListener ) ((SimplexListener)listener).enterLComp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimplexListener ) ((SimplexListener)listener).exitLComp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimplexVisitor ) return ((SimplexVisitor<? extends T>)visitor).visitLComp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LCompContext lComp() throws RecognitionException {
		LCompContext _localctx = new LCompContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_lComp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			_la = _input.LA(1);
			if ( !(_la==LE || _la==GE) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
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

	public static class BoundsContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SimplexParser.ID, 0); }
		public List<LCompContext> lComp() {
			return getRuleContexts(LCompContext.class);
		}
		public LCompContext lComp(int i) {
			return getRuleContext(LCompContext.class,i);
		}
		public List<TerminalNode> FLOAT() { return getTokens(SimplexParser.FLOAT); }
		public TerminalNode FLOAT(int i) {
			return getToken(SimplexParser.FLOAT, i);
		}
		public BoundsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bounds; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimplexListener ) ((SimplexListener)listener).enterBounds(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimplexListener ) ((SimplexListener)listener).exitBounds(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimplexVisitor ) return ((SimplexVisitor<? extends T>)visitor).visitBounds(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoundsContext bounds() throws RecognitionException {
		BoundsContext _localctx = new BoundsContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_bounds);
		try {
			setState(112);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(98);
				match(ID);
				setState(99);
				lComp();
				setState(100);
				match(FLOAT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(102);
				match(FLOAT);
				setState(103);
				lComp();
				setState(104);
				match(ID);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(106);
				match(FLOAT);
				setState(107);
				lComp();
				setState(108);
				match(ID);
				setState(109);
				lComp();
				setState(110);
				match(FLOAT);
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\27u\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4"+
		"\f\t\f\4\r\t\r\4\16\t\16\3\2\3\2\3\2\7\2 \n\2\f\2\16\2#\13\2\3\2\3\2\3"+
		"\3\3\3\3\3\3\4\3\4\6\4,\n\4\r\4\16\4-\3\4\3\4\3\4\3\4\7\4\64\n\4\f\4\16"+
		"\4\67\13\4\3\4\3\4\7\4;\n\4\f\4\16\4>\13\4\3\5\3\5\3\6\3\6\3\7\3\7\3\7"+
		"\3\7\7\7H\n\7\f\7\16\7K\13\7\3\b\3\b\3\b\3\b\5\bQ\n\b\3\t\5\tT\n\t\3\t"+
		"\3\t\3\n\3\n\3\13\3\13\3\13\5\13]\n\13\3\13\3\13\3\f\3\f\3\r\3\r\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16"+
		"s\n\16\3\16\2\2\17\2\4\6\b\n\f\16\20\22\24\26\30\32\2\6\3\2\3\4\3\2\b"+
		"\t\3\2\16\20\3\2\16\17r\2\34\3\2\2\2\4&\3\2\2\2\6)\3\2\2\2\b?\3\2\2\2"+
		"\nA\3\2\2\2\fC\3\2\2\2\16P\3\2\2\2\20S\3\2\2\2\22W\3\2\2\2\24Y\3\2\2\2"+
		"\26`\3\2\2\2\30b\3\2\2\2\32r\3\2\2\2\34\35\7\22\2\2\35!\5\6\4\2\36 \5"+
		"\4\3\2\37\36\3\2\2\2 #\3\2\2\2!\37\3\2\2\2!\"\3\2\2\2\"$\3\2\2\2#!\3\2"+
		"\2\2$%\7\23\2\2%\3\3\2\2\2&\'\7\24\2\2\'(\5\f\7\2(\5\3\2\2\2)+\7\6\2\2"+
		"*,\5\b\5\2+*\3\2\2\2,-\3\2\2\2-+\3\2\2\2-.\3\2\2\2./\3\2\2\2/\60\5\n\6"+
		"\2\60\61\5\f\7\2\61\65\7\5\2\2\62\64\5\24\13\2\63\62\3\2\2\2\64\67\3\2"+
		"\2\2\65\63\3\2\2\2\65\66\3\2\2\2\668\3\2\2\2\67\65\3\2\2\28<\7\7\2\29"+
		";\5\32\16\2:9\3\2\2\2;>\3\2\2\2<:\3\2\2\2<=\3\2\2\2=\7\3\2\2\2><\3\2\2"+
		"\2?@\7\25\2\2@\t\3\2\2\2AB\t\2\2\2B\13\3\2\2\2CI\5\20\t\2DE\5\22\n\2E"+
		"F\5\16\b\2FH\3\2\2\2GD\3\2\2\2HK\3\2\2\2IG\3\2\2\2IJ\3\2\2\2J\r\3\2\2"+
		"\2KI\3\2\2\2LM\7\26\2\2MQ\7\25\2\2NQ\7\25\2\2OQ\7\26\2\2PL\3\2\2\2PN\3"+
		"\2\2\2PO\3\2\2\2Q\17\3\2\2\2RT\5\22\n\2SR\3\2\2\2ST\3\2\2\2TU\3\2\2\2"+
		"UV\5\16\b\2V\21\3\2\2\2WX\t\3\2\2X\23\3\2\2\2YZ\5\f\7\2Z\\\5\26\f\2[]"+
		"\5\22\n\2\\[\3\2\2\2\\]\3\2\2\2]^\3\2\2\2^_\7\26\2\2_\25\3\2\2\2`a\t\4"+
		"\2\2a\27\3\2\2\2bc\t\5\2\2c\31\3\2\2\2de\7\25\2\2ef\5\30\r\2fg\7\26\2"+
		"\2gs\3\2\2\2hi\7\26\2\2ij\5\30\r\2jk\7\25\2\2ks\3\2\2\2lm\7\26\2\2mn\5"+
		"\30\r\2no\7\25\2\2op\5\30\r\2pq\7\26\2\2qs\3\2\2\2rd\3\2\2\2rh\3\2\2\2"+
		"rl\3\2\2\2s\33\3\2\2\2\13!-\65<IPS\\r";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
// Generated from gramatica/Expressoes.g4 by ANTLR 4.13.1
package parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class ExpressoesParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, ADI=3, SUB=4, MUL=5, DIV=6, MOD=7, INT=8, DEC=9, WS=10;
	public static final int
		RULE_programa = 0, RULE_expressao = 1, RULE_termo = 2, RULE_fator = 3;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "expressao", "termo", "fator"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'+'", "'-'", "'*'", "'/'", "'%'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, "ADI", "SUB", "MUL", "DIV", "MOD", "INT", "DEC", "WS"
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
	public String getGrammarFileName() { return "Expressoes.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ExpressoesParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramaContext extends ParserRuleContext {
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public TerminalNode EOF() { return getToken(ExpressoesParser.EOF, 0); }
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressoesListener ) ((ExpressoesListener)listener).enterPrograma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressoesListener ) ((ExpressoesListener)listener).exitPrograma(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressoesVisitor ) return ((ExpressoesVisitor<? extends T>)visitor).visitPrograma(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(8);
			expressao();
			setState(9);
			match(EOF);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressaoContext extends ParserRuleContext {
		public List<TermoContext> termo() {
			return getRuleContexts(TermoContext.class);
		}
		public TermoContext termo(int i) {
			return getRuleContext(TermoContext.class,i);
		}
		public List<TerminalNode> ADI() { return getTokens(ExpressoesParser.ADI); }
		public TerminalNode ADI(int i) {
			return getToken(ExpressoesParser.ADI, i);
		}
		public List<TerminalNode> SUB() { return getTokens(ExpressoesParser.SUB); }
		public TerminalNode SUB(int i) {
			return getToken(ExpressoesParser.SUB, i);
		}
		public ExpressaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressoesListener ) ((ExpressoesListener)listener).enterExpressao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressoesListener ) ((ExpressoesListener)listener).exitExpressao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressoesVisitor ) return ((ExpressoesVisitor<? extends T>)visitor).visitExpressao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressaoContext expressao() throws RecognitionException {
		ExpressaoContext _localctx = new ExpressaoContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_expressao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(11);
			termo();
			setState(16);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ADI || _la==SUB) {
				{
				{
				setState(12);
				_la = _input.LA(1);
				if ( !(_la==ADI || _la==SUB) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(13);
				termo();
				}
				}
				setState(18);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TermoContext extends ParserRuleContext {
		public List<FatorContext> fator() {
			return getRuleContexts(FatorContext.class);
		}
		public FatorContext fator(int i) {
			return getRuleContext(FatorContext.class,i);
		}
		public List<TerminalNode> MUL() { return getTokens(ExpressoesParser.MUL); }
		public TerminalNode MUL(int i) {
			return getToken(ExpressoesParser.MUL, i);
		}
		public List<TerminalNode> DIV() { return getTokens(ExpressoesParser.DIV); }
		public TerminalNode DIV(int i) {
			return getToken(ExpressoesParser.DIV, i);
		}
		public List<TerminalNode> MOD() { return getTokens(ExpressoesParser.MOD); }
		public TerminalNode MOD(int i) {
			return getToken(ExpressoesParser.MOD, i);
		}
		public TermoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressoesListener ) ((ExpressoesListener)listener).enterTermo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressoesListener ) ((ExpressoesListener)listener).exitTermo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressoesVisitor ) return ((ExpressoesVisitor<? extends T>)visitor).visitTermo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermoContext termo() throws RecognitionException {
		TermoContext _localctx = new TermoContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_termo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(19);
			fator();
			setState(29);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 994L) != 0)) {
				{
				{
				setState(24);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case MUL:
					{
					setState(20);
					match(MUL);
					}
					break;
				case DIV:
					{
					setState(21);
					match(DIV);
					}
					break;
				case MOD:
					{
					setState(22);
					match(MOD);
					}
					break;
				case T__0:
				case INT:
				case DEC:
					{
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(26);
				fator();
				}
				}
				setState(31);
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

	@SuppressWarnings("CheckReturnValue")
	public static class FatorContext extends ParserRuleContext {
		public FatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fator; }
	 
		public FatorContext() { }
		public void copyFrom(FatorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FatorDecContext extends FatorContext {
		public TerminalNode DEC() { return getToken(ExpressoesParser.DEC, 0); }
		public FatorDecContext(FatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressoesListener ) ((ExpressoesListener)listener).enterFatorDec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressoesListener ) ((ExpressoesListener)listener).exitFatorDec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressoesVisitor ) return ((ExpressoesVisitor<? extends T>)visitor).visitFatorDec(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FatorIntContext extends FatorContext {
		public TerminalNode INT() { return getToken(ExpressoesParser.INT, 0); }
		public FatorIntContext(FatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressoesListener ) ((ExpressoesListener)listener).enterFatorInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressoesListener ) ((ExpressoesListener)listener).exitFatorInt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressoesVisitor ) return ((ExpressoesVisitor<? extends T>)visitor).visitFatorInt(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FatorParentesesContext extends FatorContext {
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public FatorParentesesContext(FatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressoesListener ) ((ExpressoesListener)listener).enterFatorParenteses(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressoesListener ) ((ExpressoesListener)listener).exitFatorParenteses(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressoesVisitor ) return ((ExpressoesVisitor<? extends T>)visitor).visitFatorParenteses(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FatorContext fator() throws RecognitionException {
		FatorContext _localctx = new FatorContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_fator);
		try {
			setState(38);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				_localctx = new FatorIntContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(32);
				match(INT);
				}
				break;
			case DEC:
				_localctx = new FatorDecContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(33);
				match(DEC);
				}
				break;
			case T__0:
				_localctx = new FatorParentesesContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(34);
				match(T__0);
				setState(35);
				expressao();
				setState(36);
				match(T__1);
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
		"\u0004\u0001\n)\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0005\u0001\u000f\b\u0001\n"+
		"\u0001\f\u0001\u0012\t\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0003\u0002\u0019\b\u0002\u0001\u0002\u0005\u0002\u001c"+
		"\b\u0002\n\u0002\f\u0002\u001f\t\u0002\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003\'\b\u0003\u0001\u0003"+
		"\u0000\u0000\u0004\u0000\u0002\u0004\u0006\u0000\u0001\u0001\u0000\u0003"+
		"\u0004+\u0000\b\u0001\u0000\u0000\u0000\u0002\u000b\u0001\u0000\u0000"+
		"\u0000\u0004\u0013\u0001\u0000\u0000\u0000\u0006&\u0001\u0000\u0000\u0000"+
		"\b\t\u0003\u0002\u0001\u0000\t\n\u0005\u0000\u0000\u0001\n\u0001\u0001"+
		"\u0000\u0000\u0000\u000b\u0010\u0003\u0004\u0002\u0000\f\r\u0007\u0000"+
		"\u0000\u0000\r\u000f\u0003\u0004\u0002\u0000\u000e\f\u0001\u0000\u0000"+
		"\u0000\u000f\u0012\u0001\u0000\u0000\u0000\u0010\u000e\u0001\u0000\u0000"+
		"\u0000\u0010\u0011\u0001\u0000\u0000\u0000\u0011\u0003\u0001\u0000\u0000"+
		"\u0000\u0012\u0010\u0001\u0000\u0000\u0000\u0013\u001d\u0003\u0006\u0003"+
		"\u0000\u0014\u0019\u0005\u0005\u0000\u0000\u0015\u0019\u0005\u0006\u0000"+
		"\u0000\u0016\u0019\u0005\u0007\u0000\u0000\u0017\u0019\u0001\u0000\u0000"+
		"\u0000\u0018\u0014\u0001\u0000\u0000\u0000\u0018\u0015\u0001\u0000\u0000"+
		"\u0000\u0018\u0016\u0001\u0000\u0000\u0000\u0018\u0017\u0001\u0000\u0000"+
		"\u0000\u0019\u001a\u0001\u0000\u0000\u0000\u001a\u001c\u0003\u0006\u0003"+
		"\u0000\u001b\u0018\u0001\u0000\u0000\u0000\u001c\u001f\u0001\u0000\u0000"+
		"\u0000\u001d\u001b\u0001\u0000\u0000\u0000\u001d\u001e\u0001\u0000\u0000"+
		"\u0000\u001e\u0005\u0001\u0000\u0000\u0000\u001f\u001d\u0001\u0000\u0000"+
		"\u0000 \'\u0005\b\u0000\u0000!\'\u0005\t\u0000\u0000\"#\u0005\u0001\u0000"+
		"\u0000#$\u0003\u0002\u0001\u0000$%\u0005\u0002\u0000\u0000%\'\u0001\u0000"+
		"\u0000\u0000& \u0001\u0000\u0000\u0000&!\u0001\u0000\u0000\u0000&\"\u0001"+
		"\u0000\u0000\u0000\'\u0007\u0001\u0000\u0000\u0000\u0004\u0010\u0018\u001d"+
		"&";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
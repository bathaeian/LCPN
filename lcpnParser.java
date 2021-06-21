// Generated from lcpn.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class lcpnParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, NEWLINE=14, INT=15, WHITESPACE=16;
	public static final int
		RULE_lcpn = 0, RULE_rung = 1, RULE_left = 2, RULE_right = 3, RULE_opleft = 4, 
		RULE_opright = 5, RULE_operand = 6;
	private static String[] makeRuleNames() {
		return new String[] {
			"lcpn", "rung", "left", "right", "opleft", "opright", "operand"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'LD'", "'LDI'", "'AND'", "'ANI'", "'OR'", "'SET'", "'RST'", "'OUT'", 
			"'X'", "'Y'", "'M'", "'T'", "'C'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, "NEWLINE", "INT", "WHITESPACE"
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
	public String getGrammarFileName() { return "lcpn.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public lcpnParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class LcpnContext extends ParserRuleContext {
		public List<RungContext> rung() {
			return getRuleContexts(RungContext.class);
		}
		public RungContext rung(int i) {
			return getRuleContext(RungContext.class,i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(lcpnParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(lcpnParser.NEWLINE, i);
		}
		public LcpnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lcpn; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lcpnListener ) ((lcpnListener)listener).enterLcpn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lcpnListener ) ((lcpnListener)listener).exitLcpn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lcpnVisitor ) return ((lcpnVisitor<? extends T>)visitor).visitLcpn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LcpnContext lcpn() throws RecognitionException {
		LcpnContext _localctx = new LcpnContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_lcpn);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(19);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4))) != 0)) {
				{
				{
				setState(14);
				rung();
				setState(15);
				match(NEWLINE);
				}
				}
				setState(21);
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

	public static class RungContext extends ParserRuleContext {
		public List<LeftContext> left() {
			return getRuleContexts(LeftContext.class);
		}
		public LeftContext left(int i) {
			return getRuleContext(LeftContext.class,i);
		}
		public RightContext right() {
			return getRuleContext(RightContext.class,0);
		}
		public RungContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rung; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lcpnListener ) ((lcpnListener)listener).enterRung(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lcpnListener ) ((lcpnListener)listener).exitRung(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lcpnVisitor ) return ((lcpnVisitor<? extends T>)visitor).visitRung(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RungContext rung() throws RecognitionException {
		RungContext _localctx = new RungContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_rung);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(22);
			left();
			setState(26);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4))) != 0)) {
				{
				{
				setState(23);
				left();
				}
				}
				setState(28);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(29);
			right();
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

	public static class LeftContext extends ParserRuleContext {
		public OpleftContext opleft() {
			return getRuleContext(OpleftContext.class,0);
		}
		public OperandContext operand() {
			return getRuleContext(OperandContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(lcpnParser.NEWLINE, 0); }
		public LeftContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_left; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lcpnListener ) ((lcpnListener)listener).enterLeft(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lcpnListener ) ((lcpnListener)listener).exitLeft(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lcpnVisitor ) return ((lcpnVisitor<? extends T>)visitor).visitLeft(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LeftContext left() throws RecognitionException {
		LeftContext _localctx = new LeftContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_left);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(31);
			opleft();
			setState(32);
			operand();
			setState(33);
			match(NEWLINE);
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

	public static class RightContext extends ParserRuleContext {
		public OprightContext opright() {
			return getRuleContext(OprightContext.class,0);
		}
		public OperandContext operand() {
			return getRuleContext(OperandContext.class,0);
		}
		public RightContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_right; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lcpnListener ) ((lcpnListener)listener).enterRight(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lcpnListener ) ((lcpnListener)listener).exitRight(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lcpnVisitor ) return ((lcpnVisitor<? extends T>)visitor).visitRight(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RightContext right() throws RecognitionException {
		RightContext _localctx = new RightContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_right);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(35);
			opright();
			setState(36);
			operand();
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

	public static class OpleftContext extends ParserRuleContext {
		public OpleftContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opleft; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lcpnListener ) ((lcpnListener)listener).enterOpleft(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lcpnListener ) ((lcpnListener)listener).exitOpleft(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lcpnVisitor ) return ((lcpnVisitor<? extends T>)visitor).visitOpleft(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OpleftContext opleft() throws RecognitionException {
		OpleftContext _localctx = new OpleftContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_opleft);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(38);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
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

	public static class OprightContext extends ParserRuleContext {
		public OprightContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opright; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lcpnListener ) ((lcpnListener)listener).enterOpright(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lcpnListener ) ((lcpnListener)listener).exitOpright(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lcpnVisitor ) return ((lcpnVisitor<? extends T>)visitor).visitOpright(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OprightContext opright() throws RecognitionException {
		OprightContext _localctx = new OprightContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_opright);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__6) | (1L << T__7))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
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

	public static class OperandContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(lcpnParser.INT, 0); }
		public OperandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lcpnListener ) ((lcpnListener)listener).enterOperand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lcpnListener ) ((lcpnListener)listener).exitOperand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lcpnVisitor ) return ((lcpnVisitor<? extends T>)visitor).visitOperand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperandContext operand() throws RecognitionException {
		OperandContext _localctx = new OperandContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_operand);
		try {
			setState(52);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__8:
				enterOuterAlt(_localctx, 1);
				{
				setState(42);
				match(T__8);
				setState(43);
				match(INT);
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 2);
				{
				setState(44);
				match(T__9);
				setState(45);
				match(INT);
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 3);
				{
				setState(46);
				match(T__10);
				setState(47);
				match(INT);
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 4);
				{
				setState(48);
				match(T__11);
				setState(49);
				match(INT);
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 5);
				{
				setState(50);
				match(T__12);
				setState(51);
				match(INT);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\229\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\3\2\3\2\3\2\7\2\24\n\2\f\2"+
		"\16\2\27\13\2\3\3\3\3\7\3\33\n\3\f\3\16\3\36\13\3\3\3\3\3\3\4\3\4\3\4"+
		"\3\4\3\5\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\5\b\67\n\b\3\b\2\2\t\2\4\6\b\n\f\16\2\4\3\2\3\7\3\2\b\n\2\67\2\25\3"+
		"\2\2\2\4\30\3\2\2\2\6!\3\2\2\2\b%\3\2\2\2\n(\3\2\2\2\f*\3\2\2\2\16\66"+
		"\3\2\2\2\20\21\5\4\3\2\21\22\7\20\2\2\22\24\3\2\2\2\23\20\3\2\2\2\24\27"+
		"\3\2\2\2\25\23\3\2\2\2\25\26\3\2\2\2\26\3\3\2\2\2\27\25\3\2\2\2\30\34"+
		"\5\6\4\2\31\33\5\6\4\2\32\31\3\2\2\2\33\36\3\2\2\2\34\32\3\2\2\2\34\35"+
		"\3\2\2\2\35\37\3\2\2\2\36\34\3\2\2\2\37 \5\b\5\2 \5\3\2\2\2!\"\5\n\6\2"+
		"\"#\5\16\b\2#$\7\20\2\2$\7\3\2\2\2%&\5\f\7\2&\'\5\16\b\2\'\t\3\2\2\2("+
		")\t\2\2\2)\13\3\2\2\2*+\t\3\2\2+\r\3\2\2\2,-\7\13\2\2-\67\7\21\2\2./\7"+
		"\f\2\2/\67\7\21\2\2\60\61\7\r\2\2\61\67\7\21\2\2\62\63\7\16\2\2\63\67"+
		"\7\21\2\2\64\65\7\17\2\2\65\67\7\21\2\2\66,\3\2\2\2\66.\3\2\2\2\66\60"+
		"\3\2\2\2\66\62\3\2\2\2\66\64\3\2\2\2\67\17\3\2\2\2\5\25\34\66";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
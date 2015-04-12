// Generated from grammar.g4 by ANTLR 4.0

package rr;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNSimulator;
import org.antlr.v4.runtime.atn.LexerATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class grammarLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__13=1, T__12=2, T__11=3, T__10=4, T__9=5, T__8=6, T__7=7, T__6=8, T__5=9, 
		T__4=10, T__3=11, T__2=12, T__1=13, T__0=14, COMMENT=15, INT=16, DOUBLE=17, 
		ID=18, WS=19;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"')'", "','", "'+'", "'*'", "'-'", "'('", "'int'", "'='", "';'", "'ret'", 
		"'double'", "'write('", "'/'", "'read('", "COMMENT", "INT", "DOUBLE", 
		"ID", "WS"
	};
	public static final String[] ruleNames = {
		"T__13", "T__12", "T__11", "T__10", "T__9", "T__8", "T__7", "T__6", "T__5", 
		"T__4", "T__3", "T__2", "T__1", "T__0", "COMMENT", "INT", "DOUBLE", "ID", 
		"WS"
	};


	public grammarLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "grammar.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 14: COMMENT_action((RuleContext)_localctx, actionIndex); break;

		case 18: WS_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1: skip();  break;
		}
	}
	private void COMMENT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: skip();  break;
		}
	}

	public static final String _serializedATN =
		"\2\4\25\u0091\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b"+
		"\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20"+
		"\t\20\4\21\t\21\4\22\t\22\4\23\t\23\4\24\t\24\3\2\3\2\3\3\3\3\3\4\3\4"+
		"\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\13"+
		"\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\7\20\\\n\20\f\20\16"+
		"\20_\13\20\3\20\5\20b\n\20\3\20\3\20\3\20\3\20\3\20\7\20i\n\20\f\20\16"+
		"\20l\13\20\3\20\3\20\5\20p\n\20\3\20\3\20\3\21\6\21u\n\21\r\21\16\21v"+
		"\3\22\5\22z\n\22\3\22\6\22}\n\22\r\22\16\22~\3\22\3\22\6\22\u0083\n\22"+
		"\r\22\16\22\u0084\5\22\u0087\n\22\3\23\6\23\u008a\n\23\r\23\16\23\u008b"+
		"\3\24\3\24\3\24\3\24\3j\25\3\3\1\5\4\1\7\5\1\t\6\1\13\7\1\r\b\1\17\t\1"+
		"\21\n\1\23\13\1\25\f\1\27\r\1\31\16\1\33\17\1\35\20\1\37\21\2!\22\1#\23"+
		"\1%\24\1\'\25\3\3\2\5\4\f\f\17\17\4--//\5\f\f\17\17\"\"\u009a\2\3\3\2"+
		"\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17"+
		"\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2"+
		"\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3"+
		"\2\2\2\2\'\3\2\2\2\3)\3\2\2\2\5+\3\2\2\2\7-\3\2\2\2\t/\3\2\2\2\13\61\3"+
		"\2\2\2\r\63\3\2\2\2\17\65\3\2\2\2\219\3\2\2\2\23;\3\2\2\2\25=\3\2\2\2"+
		"\27A\3\2\2\2\31H\3\2\2\2\33O\3\2\2\2\35Q\3\2\2\2\37o\3\2\2\2!t\3\2\2\2"+
		"#y\3\2\2\2%\u0089\3\2\2\2\'\u008d\3\2\2\2)*\7+\2\2*\4\3\2\2\2+,\7.\2\2"+
		",\6\3\2\2\2-.\7-\2\2.\b\3\2\2\2/\60\7,\2\2\60\n\3\2\2\2\61\62\7/\2\2\62"+
		"\f\3\2\2\2\63\64\7*\2\2\64\16\3\2\2\2\65\66\7k\2\2\66\67\7p\2\2\678\7"+
		"v\2\28\20\3\2\2\29:\7?\2\2:\22\3\2\2\2;<\7=\2\2<\24\3\2\2\2=>\7t\2\2>"+
		"?\7g\2\2?@\7v\2\2@\26\3\2\2\2AB\7f\2\2BC\7q\2\2CD\7w\2\2DE\7d\2\2EF\7"+
		"n\2\2FG\7g\2\2G\30\3\2\2\2HI\7y\2\2IJ\7t\2\2JK\7k\2\2KL\7v\2\2LM\7g\2"+
		"\2MN\7*\2\2N\32\3\2\2\2OP\7\61\2\2P\34\3\2\2\2QR\7t\2\2RS\7g\2\2ST\7c"+
		"\2\2TU\7f\2\2UV\7*\2\2V\36\3\2\2\2WX\7\61\2\2XY\7\61\2\2Y]\3\2\2\2Z\\"+
		"\n\2\2\2[Z\3\2\2\2\\_\3\2\2\2][\3\2\2\2]^\3\2\2\2^a\3\2\2\2_]\3\2\2\2"+
		"`b\7\17\2\2a`\3\2\2\2ab\3\2\2\2bc\3\2\2\2cp\7\f\2\2de\7\61\2\2ef\7,\2"+
		"\2fj\3\2\2\2gi\13\2\2\2hg\3\2\2\2il\3\2\2\2jk\3\2\2\2jh\3\2\2\2km\3\2"+
		"\2\2lj\3\2\2\2mn\7,\2\2np\7\61\2\2oW\3\2\2\2od\3\2\2\2pq\3\2\2\2qr\b\20"+
		"\2\2r \3\2\2\2su\4\62;\2ts\3\2\2\2uv\3\2\2\2vt\3\2\2\2vw\3\2\2\2w\"\3"+
		"\2\2\2xz\t\3\2\2yx\3\2\2\2yz\3\2\2\2z|\3\2\2\2{}\4\62;\2|{\3\2\2\2}~\3"+
		"\2\2\2~|\3\2\2\2~\177\3\2\2\2\177\u0086\3\2\2\2\u0080\u0082\7\60\2\2\u0081"+
		"\u0083\4\62;\2\u0082\u0081\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u0082\3\2"+
		"\2\2\u0084\u0085\3\2\2\2\u0085\u0087\3\2\2\2\u0086\u0080\3\2\2\2\u0086"+
		"\u0087\3\2\2\2\u0087$\3\2\2\2\u0088\u008a\4c|\2\u0089\u0088\3\2\2\2\u008a"+
		"\u008b\3\2\2\2\u008b\u0089\3\2\2\2\u008b\u008c\3\2\2\2\u008c&\3\2\2\2"+
		"\u008d\u008e\t\4\2\2\u008e\u008f\3\2\2\2\u008f\u0090\b\24\3\2\u0090(\3"+
		"\2\2\2\r\2]ajovy~\u0084\u0086\u008b";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}
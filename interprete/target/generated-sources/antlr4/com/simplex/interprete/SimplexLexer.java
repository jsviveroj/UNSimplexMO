// Generated from com/simplex/interprete/Simplex.g4 by ANTLR 4.5.1
package com.simplex.interprete;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SimplexLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		MAX=1, MIN=2, RES=3, VAR=4, LIM=5, MAS=6, MENOS=7, MULT=8, DIV=9, GT=10, 
		LT=11, LE=12, GE=13, EQ=14, COMA=15, BEGIN=16, END=17, MFUNCTIONS=18, 
		ID=19, FLOAT=20, WS=21;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"MAX", "MIN", "RES", "VAR", "LIM", "MAS", "MENOS", "MULT", "DIV", "GT", 
		"LT", "LE", "GE", "EQ", "COMA", "BEGIN", "END", "MFUNCTIONS", "ID", "FLOAT", 
		"WS"
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


	public SimplexLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Simplex.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\27\u00b7\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13"+
		"\3\13\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24"+
		"\3\24\7\24\u0094\n\24\f\24\16\24\u0097\13\24\3\25\6\25\u009a\n\25\r\25"+
		"\16\25\u009b\3\25\3\25\6\25\u00a0\n\25\r\25\16\25\u00a1\3\25\3\25\5\25"+
		"\u00a6\n\25\3\25\6\25\u00a9\n\25\r\25\16\25\u00aa\5\25\u00ad\n\25\5\25"+
		"\u00af\n\25\3\26\6\26\u00b2\n\26\r\26\16\26\u00b3\3\26\3\26\2\2\27\3\3"+
		"\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21"+
		"!\22#\23%\24\'\25)\26+\27\3\2\b\5\2C\\aac|\6\2\62;C\\aac|\3\2\62;\4\2"+
		"GGgg\4\2--//\5\2\13\f\17\17\"\"\u00be\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2"+
		"\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2"+
		"\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3"+
		"\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3"+
		"\2\2\2\2+\3\2\2\2\3-\3\2\2\2\58\3\2\2\2\7C\3\2\2\2\tM\3\2\2\2\13X\3\2"+
		"\2\2\r^\3\2\2\2\17`\3\2\2\2\21b\3\2\2\2\23d\3\2\2\2\25f\3\2\2\2\27h\3"+
		"\2\2\2\31j\3\2\2\2\33m\3\2\2\2\35p\3\2\2\2\37r\3\2\2\2!t\3\2\2\2#|\3\2"+
		"\2\2%\u0087\3\2\2\2\'\u0091\3\2\2\2)\u0099\3\2\2\2+\u00b1\3\2\2\2-.\7"+
		"o\2\2./\7c\2\2/\60\7z\2\2\60\61\7k\2\2\61\62\7o\2\2\62\63\7k\2\2\63\64"+
		"\7g\2\2\64\65\7t\2\2\65\66\7g\2\2\66\67\7p\2\2\67\4\3\2\2\289\7o\2\29"+
		":\7k\2\2:;\7p\2\2;<\7k\2\2<=\7o\2\2=>\7k\2\2>?\7g\2\2?@\7t\2\2@A\7g\2"+
		"\2AB\7p\2\2B\6\3\2\2\2CD\7e\2\2DE\7q\2\2EF\7t\2\2FG\7v\2\2GH\7c\2\2HI"+
		"\7r\2\2IJ\7k\2\2JK\7u\2\2KL\7c\2\2L\b\3\2\2\2MN\7x\2\2NO\7c\2\2OP\7t\2"+
		"\2PQ\7k\2\2QR\7c\2\2RS\7d\2\2ST\7k\2\2TU\7n\2\2UV\7k\2\2VW\7u\2\2W\n\3"+
		"\2\2\2XY\7h\2\2YZ\7k\2\2Z[\7p\2\2[\\\7g\2\2\\]\7u\2\2]\f\3\2\2\2^_\7-"+
		"\2\2_\16\3\2\2\2`a\7/\2\2a\20\3\2\2\2bc\7,\2\2c\22\3\2\2\2de\7\61\2\2"+
		"e\24\3\2\2\2fg\7@\2\2g\26\3\2\2\2hi\7>\2\2i\30\3\2\2\2jk\7>\2\2kl\7?\2"+
		"\2l\32\3\2\2\2mn\7@\2\2no\7?\2\2o\34\3\2\2\2pq\7?\2\2q\36\3\2\2\2rs\7"+
		".\2\2s \3\2\2\2tu\7F\2\2uv\7c\2\2vw\7p\2\2wx\7v\2\2xy\7|\2\2yz\7k\2\2"+
		"z{\7i\2\2{\"\3\2\2\2|}\7O\2\2}~\7c\2\2~\177\7{\2\2\177\u0080\7q\2\2\u0080"+
		"\u0081\7F\2\2\u0081\u0082\7g\2\2\u0082\u0083\7\64\2\2\u0083\u0084\7\62"+
		"\2\2\u0084\u0085\7\62\2\2\u0085\u0086\7\67\2\2\u0086$\3\2\2\2\u0087\u0088"+
		"\7I\2\2\u0088\u0089\7q\2\2\u0089\u008a\7k\2\2\u008a\u008b\7e\2\2\u008b"+
		"\u008c\7q\2\2\u008c\u008d\7e\2\2\u008d\u008e\7j\2\2\u008e\u008f\7g\2\2"+
		"\u008f\u0090\7c\2\2\u0090&\3\2\2\2\u0091\u0095\t\2\2\2\u0092\u0094\t\3"+
		"\2\2\u0093\u0092\3\2\2\2\u0094\u0097\3\2\2\2\u0095\u0093\3\2\2\2\u0095"+
		"\u0096\3\2\2\2\u0096(\3\2\2\2\u0097\u0095\3\2\2\2\u0098\u009a\t\4\2\2"+
		"\u0099\u0098\3\2\2\2\u009a\u009b\3\2\2\2\u009b\u0099\3\2\2\2\u009b\u009c"+
		"\3\2\2\2\u009c\u00ae\3\2\2\2\u009d\u009f\7\60\2\2\u009e\u00a0\t\4\2\2"+
		"\u009f\u009e\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\u009f\3\2\2\2\u00a1\u00a2"+
		"\3\2\2\2\u00a2\u00ac\3\2\2\2\u00a3\u00a5\t\5\2\2\u00a4\u00a6\t\6\2\2\u00a5"+
		"\u00a4\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00a8\3\2\2\2\u00a7\u00a9\t\4"+
		"\2\2\u00a8\u00a7\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\u00a8\3\2\2\2\u00aa"+
		"\u00ab\3\2\2\2\u00ab\u00ad\3\2\2\2\u00ac\u00a3\3\2\2\2\u00ac\u00ad\3\2"+
		"\2\2\u00ad\u00af\3\2\2\2\u00ae\u009d\3\2\2\2\u00ae\u00af\3\2\2\2\u00af"+
		"*\3\2\2\2\u00b0\u00b2\t\7\2\2\u00b1\u00b0\3\2\2\2\u00b2\u00b3\3\2\2\2"+
		"\u00b3\u00b1\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5\u00b6"+
		"\b\26\2\2\u00b6,\3\2\2\2\13\2\u0095\u009b\u00a1\u00a5\u00aa\u00ac\u00ae"+
		"\u00b3\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
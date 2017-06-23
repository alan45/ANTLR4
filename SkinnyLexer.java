// Generated from Skinny.g4 by ANTLR 4.5
package com.embeddedmicro.skinny.parser;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SkinnyLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, NAME=5, BLOCK_COMMENT=6, COMMENT=7, NL=8, 
		WS=9;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "NAME", "BLOCK_COMMENT", "COMMENT", "NL", 
		"WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "':'", "','", "'#define'", "'='"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, "NAME", "BLOCK_COMMENT", "COMMENT", "NL", 
		"WS"
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


	public SkinnyLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Skinny.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\13P\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3\2\3\2"+
		"\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\6\6\6%\n\6\r\6\16\6"+
		"&\3\7\3\7\3\7\3\7\7\7-\n\7\f\7\16\7\60\13\7\3\7\3\7\3\7\3\b\3\b\3\b\3"+
		"\b\7\b9\n\b\f\b\16\b<\13\b\3\b\5\b?\n\b\3\b\3\b\5\bC\n\b\3\t\5\tF\n\t"+
		"\3\t\3\t\3\n\6\nK\n\n\r\n\16\nL\3\n\3\n\3.\2\13\3\3\5\4\7\5\t\6\13\7\r"+
		"\b\17\t\21\n\23\13\3\2\5\6\2\62;C\\aac|\4\2\f\f\17\17\4\2\13\13\"\"V\2"+
		"\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2"+
		"\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\3\25\3\2\2\2\5\27\3\2\2\2\7"+
		"\31\3\2\2\2\t!\3\2\2\2\13$\3\2\2\2\r(\3\2\2\2\17\64\3\2\2\2\21E\3\2\2"+
		"\2\23J\3\2\2\2\25\26\7<\2\2\26\4\3\2\2\2\27\30\7.\2\2\30\6\3\2\2\2\31"+
		"\32\7%\2\2\32\33\7f\2\2\33\34\7g\2\2\34\35\7h\2\2\35\36\7k\2\2\36\37\7"+
		"p\2\2\37 \7g\2\2 \b\3\2\2\2!\"\7?\2\2\"\n\3\2\2\2#%\t\2\2\2$#\3\2\2\2"+
		"%&\3\2\2\2&$\3\2\2\2&\'\3\2\2\2\'\f\3\2\2\2()\7\61\2\2)*\7,\2\2*.\3\2"+
		"\2\2+-\13\2\2\2,+\3\2\2\2-\60\3\2\2\2./\3\2\2\2.,\3\2\2\2/\61\3\2\2\2"+
		"\60.\3\2\2\2\61\62\7,\2\2\62\63\7\61\2\2\63\16\3\2\2\2\64\65\7\61\2\2"+
		"\65\66\7\61\2\2\66:\3\2\2\2\679\n\3\2\28\67\3\2\2\29<\3\2\2\2:8\3\2\2"+
		"\2:;\3\2\2\2;B\3\2\2\2<:\3\2\2\2=?\7\17\2\2>=\3\2\2\2>?\3\2\2\2?@\3\2"+
		"\2\2@C\7\f\2\2AC\7\2\2\3B>\3\2\2\2BA\3\2\2\2C\20\3\2\2\2DF\7\17\2\2ED"+
		"\3\2\2\2EF\3\2\2\2FG\3\2\2\2GH\7\f\2\2H\22\3\2\2\2IK\t\4\2\2JI\3\2\2\2"+
		"KL\3\2\2\2LJ\3\2\2\2LM\3\2\2\2MN\3\2\2\2NO\b\n\2\2O\24\3\2\2\2\n\2&.:"+
		">BEL\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
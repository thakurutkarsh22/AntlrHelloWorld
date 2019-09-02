import java.io.IOException;

import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;

public class AntlrParser {
	public static void main (String[] args)throws IOException {
		
		CharStream charstream = CharStreams.fromFileName("./HelloWorld.cc");
		CPP14Lexer cpp14Lexer = new CPP14Lexer(charstream);
		CommonTokenStream commonTokenStream = new CommonTokenStream(cpp14Lexer);
		CPP14Parser cpp14Parser = new CPP14Parser(commonTokenStream);
		
		ParseTree parseTree = cpp14Parser.translationunit();
		System.out.println(parseTree);
		System.out.println("Done");
		
	}
}

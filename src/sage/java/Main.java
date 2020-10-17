package sage.java;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import sage.java.antlrparser.ExpressionLexer;
import sage.java.antlrparser.ExpressionParser;

public class Main {
    public static void main(String[] args) {
        var input = "~(P & Q) <=> (~P | ~Q)";

        var lexer = new ExpressionLexer(CharStreams.fromString(input));
        var tokens = new CommonTokenStream(lexer);
        var parser = new ExpressionParser(tokens);
        var tree = parser.e();

        var extractor = new ExpressionListener(parser);
        ParseTreeWalker.DEFAULT.walk(extractor, tree);
        System.out.println("\n\nTruth table for " + tree.node.tag + ":\n");
        System.out.println(tree.node.generateBooleanTruthTable());
    }
}

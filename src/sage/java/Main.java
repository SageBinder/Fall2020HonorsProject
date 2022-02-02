package sage.java;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import sage.java.antlrparser.ProofLexer;
import sage.java.antlrparser.ProofParser;

public class Main {
    public static void main(String[] args) {
        String input = args[0];
//        try {
//            input = Files.readString(Path.of(args[0]));
//        } catch(IOException e) {
//            System.out.println(e.toString());
//            return;
//        }

        var lexer = new ProofLexer(CharStreams.fromString(input));
        var tokens = new CommonTokenStream(lexer);
        var parser = new ProofParser(tokens);
        var tree = parser.sentence();

        var extractor = new ProofTreeListener();
        ParseTreeWalker.DEFAULT.walk(extractor, tree);
        System.out.println(tree.node.generateBooleanTruthTable());
//        var proofNode = tree.proofConstruct().proofNode;
//        var proofLines = proofNode.getLines();
//
//        System.out.println(String.join("\n", proofLines));
    }
}

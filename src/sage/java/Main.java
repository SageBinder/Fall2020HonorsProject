package sage.java;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import sage.java.antlrparser.ProofLexer;
import sage.java.antlrparser.ProofParser;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
//        var input = "~(P & Q) <=> (~P | ~Q)";

        var input =
                """
                premises [
                    (*(x))(F(x) | G(x)) ;
                    (*(x))(F(x) > G(x)) ;
                ]{
                    F(a) | G(a)  # *E, 1 ;
                    F(a) > G(a)  # *E, 2 ;
                    F(a) | ~G(a) # C, 4 ;
                                
                    assume [
                        ~G(a) ;
                    ]{
                        F(a)  # |E, 3 ;
                        ~F(a) # DC, 4, 6 ;
                    }
                                
                    G(a)          # RD, 6, 7, 8 ;
                    (*(x))(G(x))  # *I, 9 ;
                }""";

        var lexer = new ProofLexer(CharStreams.fromString(input));
        var tokens = new CommonTokenStream(lexer);
        var parser = new ProofParser(tokens);
//        var tree = parser.sentence();
        var tree = parser.proof();

        var extractor = new ProofTreeListener(parser);
        ParseTreeWalker.DEFAULT.walk(extractor, tree);
        var proofNode = tree.proofConstruct().proofNode;
        var proofLines = proofNode.getLines();

        System.out.println("\n\n");
        System.out.println(
                IntStream.range(0, proofLines.size())
                        .<String>mapToObj(i -> String.format("%2d ", i + 1) + proofLines.get(i))
                        .collect(Collectors.joining("\n")));

//        ParseTreeWalker.DEFAULT.walk(extractor, tree);
//        System.out.println("\n\nTruth table for " + tree.node.tag + ":\n");
//        System.out.println(tree.node.generateBooleanTruthTable());
    }
}

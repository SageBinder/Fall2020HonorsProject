package sage.java;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import sage.java.antlrparser.ProofLexer;
import sage.java.antlrparser.ProofParser;
import sage.java.proof.Proof;

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
                    F(a) | G(a) ; DC ;
                    F(a) > G(a) ; DC ;
                    F(a) | ¬G(a) ; DC ;
                
                    assume [
                        ~G(a) ;
                    ]{
                        F(a)  ; DC ;
                        ~F(a) ; DC ;
                    }
                
                    G(a)          ; DC ;
                    (*(x))(G(x))  ; DC ;
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

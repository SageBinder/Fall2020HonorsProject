package sage.java;

import org.apache.commons.cli.*;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import sage.java.antlrparser.ProofLexer;
import sage.java.antlrparser.ProofParser;

public class Main {
    public static void main(String[] args) {
        Options options = new Options();

        Option sentence = new Option("s", "sentence", true, "Logical sentence to parse");
        sentence.setRequired(true);

        Option lastOnly = new Option(null, "main-only", false,
                "If enabled, prints only the result of the main connective and omits the columns for all other connectives.");
        lastOnly.setRequired(false);

        options.addOption(sentence);
        options.addOption(lastOnly);

        CommandLineParser cmdParser = new DefaultParser();
        HelpFormatter formatter = new HelpFormatter();
        CommandLine cmd;
        try {
            cmd = cmdParser.parse(options, args);
        } catch(ParseException e) {
            System.out.println(e.getMessage());
            formatter.printHelp("TruthTableGenerator", options);

            System.exit(1);
            return;
        }

        String input = cmd.getOptionValue("sentence");
        var lexer = new ProofLexer(CharStreams.fromString(input));
        var tokens = new CommonTokenStream(lexer);
        var parser = new ProofParser(tokens);
        var tree = parser.sentence();

        var extractor = new ProofTreeListener();
        ParseTreeWalker.DEFAULT.walk(extractor, tree);
        System.out.println(tree.node.generateBooleanTruthTable(cmd.hasOption("main-only")));


//        try {
//            input = Files.readString(Path.of(args[0]));
//        } catch(IOException e) {
//            System.out.println(e.toString());
//            return;
//        }
//        var proofNode = tree.proofConstruct().proofNode;
//        var proofLines = proofNode.getLines();
//
//        System.out.println(String.join("\n", proofLines));
    }
}

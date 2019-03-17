import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenStream;
import parser.ExpressionLexer;
import parser.ExpressionParser;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        CharStream charStream = CharStreams.fromStream(System.in);
        ExpressionLexer lexer = new ExpressionLexer(charStream);
        TokenStream ts = new CommonTokenStream(lexer);
        ExpressionParser parser = new ExpressionParser(ts);
        System.out.println(parser.file().fileResult.getTree());
    }
}

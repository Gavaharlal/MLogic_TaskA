import expression.Expression;
import utils.ExpressionsParser;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        Expression expression = ExpressionsParser.parse("test.txt");
        System.out.println(expression.toTree());
    }
}

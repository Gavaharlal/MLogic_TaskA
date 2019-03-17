package expression;

public class Negation extends AbstractUnaryOperator{

    public Negation(Expression operand) {
        super(operand);
    }

    @Override
    public String getToken() {
        return "!";
    }
}

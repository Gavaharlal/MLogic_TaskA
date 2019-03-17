package expression;

public class Conjunction extends AbstractBinaryOperator {

    public Conjunction(Expression leftOperand, Expression rightOperand) {
        super(leftOperand, rightOperand);
    }

    @Override
    public String getToken() {
        return "&";
    }
}

package expression;

public class Implication extends AbstractBinaryOperator {


    public Implication(Expression leftOperand, Expression rightOperand) {
        super(leftOperand, rightOperand);
    }

    @Override
    public String getToken() {
        return "->";
    }
}

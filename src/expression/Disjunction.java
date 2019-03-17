package expression;

public class Disjunction extends AbstractBinaryOperator {

    public Disjunction(Expression leftOperand, Expression rightOperand) {
        super(leftOperand, rightOperand);
    }

    @Override
    public String getToken() {
        return "|";
    }
}

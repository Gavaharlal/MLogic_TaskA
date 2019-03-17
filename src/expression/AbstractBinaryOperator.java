package expression;

public abstract class AbstractBinaryOperator implements Operator{

    private final Expression leftOperand;
    private final Expression rightOperand;

    AbstractBinaryOperator(Expression leftOperand, Expression rightOperand) {
        this.leftOperand = leftOperand;
        this.rightOperand = rightOperand;
    }

    @Override
    public String getTree() {
        return "(" + getToken() + "," + leftOperand.getTree() + "," + rightOperand.getTree() + ")";
    }
}

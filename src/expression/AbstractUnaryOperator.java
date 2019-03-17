package expression;

public abstract class AbstractUnaryOperator implements Operator {

    private final Expression operand;

    AbstractUnaryOperator(Expression operand) {
        this.operand = operand;
    }

    @Override
    public String getTree() {
        return "(" + getToken() + operand.getTree() + ")";
    }

}

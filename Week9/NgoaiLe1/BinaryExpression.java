public abstract class BinaryExpression extends Expression {
    protected Expression left;
    protected Expression right;

    /**
     * binaryexpression.
     */
    public BinaryExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    public BinaryExpression() {

    }

    @Override
    public abstract String toString();

    @Override
    public abstract double evaluate();
}

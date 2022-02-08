public class Numeral extends Expression {
    private double value;

    /**
     * numeral.
     */
    public Numeral(double value) {
        this.value = value;
    }

    public Numeral() {

    }

    @Override
    public String toString() {
        return String.valueOf((int) value);
    }

    @Override
    public double evaluate() {
        return value;
    }
}

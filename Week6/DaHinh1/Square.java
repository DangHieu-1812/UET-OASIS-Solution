public class Square extends Rectangle {
    public Square() {

    }

    public Square(double side) {
        this.width = side;
        this.length = side;
    }

    /** An especially short bit of Javadoc. */
    public Square(double side, String color, boolean filled) {
        this.width = side;
        this.length = side;
        this.color = color;
        this.filled = filled;
    }

    public double getSide() {
        return super.getWidth();
    }

    public void setSide(double side) {
        super.setWidth(side);
        super.setLength(side);
    }

    @Override
    public void setWidth(double side) {
        super.setWidth(side);
        super.setLength(side);
    }

    @Override
    public void setLength(double side) {
        super.setWidth(side);
        super.setLength(side);
    }

    @Override
    public String toString() {
        return "Square[" + "side=" + this.width
                + ",color=" + color  + ",filled=" + filled + ']';
    }
}

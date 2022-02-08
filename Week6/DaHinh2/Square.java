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

    /** An especially short bit of Javadoc. */
    public Square(Point topLeft, double side, String color, boolean filled) {
        this.topLeft = topLeft;
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

    /** An especially short bit of Javadoc. */
    public boolean equals(Object o) {
        if (o instanceof  Square) {
            Square otr = (Square) o;
            if (Math.abs(this.width - otr.width) <= 0.001) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        int n = 43;
        int r = 1;
        r = n * r + (int) width;
        r = n * r + (int) topLeft.getPointX() + (int) topLeft.getPointY();
        return r;
    }

    @Override
    public String toString() {
        return "Square[" + "topLeft=(" + topLeft.getPointX() + "," + topLeft.getPointY()
                + "),side=" + this.width + ",color=" + color  + ",filled=" + filled + ']';
    }
}

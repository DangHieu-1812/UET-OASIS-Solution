public class Rectangle extends Shape {
    protected Point topLeft;
    protected double width;
    protected double length;

    public Rectangle() {

    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    /** An especially short bit of Javadoc. */
    public Rectangle(double width, double length, String color, boolean filled) {
        this.width = width;
        this.length = length;
        this.color = color;
        this.filled = filled;
    }

    /** An especially short bit of Javadoc. */
    public Rectangle(Point topLeft, double width, double length, String color, boolean filled) {
        this.topLeft = topLeft;
        this.width = width;
        this.length = length;
        this.color = color;
        this.filled = filled;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public double getPerimeter() {
        return (length + width) * 2;
    }

    public Point getTopLeft() {
        return topLeft;
    }

    public void setTopLeft(Point topLeft) {
        this.topLeft = topLeft;
    }

    /** An especially short bit of Javadoc. */
    public boolean equals(Object o) {
        if (o instanceof  Rectangle) {
            Rectangle otr = (Rectangle) o;
            if (Math.abs(this.width - otr.width) <= 0.001
                    && Math.abs(this.length - otr.length) <= 0.001) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        int n = 35;
        int r = 1;
        r = n * r + (int) (width * 16) + (int) length;
        r = n * r + (int) (topLeft.getPointX() * 18)
                + (int) (topLeft.getPointY() * 21);
        return r;
    }

    @Override
    public String toString() {
        return "Rectangle[" + "topLeft=(" + topLeft.getPointX() + "," + topLeft.getPointY()
                + "),width=" + width + ",length=" + length + ",color="
                + color + ",filled=" + filled + ']';
    }
}

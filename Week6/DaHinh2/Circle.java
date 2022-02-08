public class Circle extends Shape {
    protected Point center;
    protected double radius;

    public Circle() {

    }

    public Circle(double radius) {
        this.radius = radius;
    }

    /** An especially short bit of Javadoc. */
    public Circle(double radius, String color, boolean filled) {
        this.radius = radius;
        this.color = color;
        this.filled = filled;
    }

    /** An especially short bit of Javadoc. */
    public Circle(Point center, double radius, String color, boolean filled) {
        this.center = center;
        this.radius = radius;
        this.color = color;
        this.filled = filled;
    }

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    /** An especially short bit of Javadoc. */
    public boolean equals(Object o) {
        if (o instanceof  Circle) {
            Circle otr = (Circle) o;
            if (Math.abs(this.radius - otr.radius) <= 0.001) {
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
        r = n * r + (int) (radius * 18);
        r = n * r + (int) (center.getPointX() * 18)
                + (int) (center.getPointY() * 18);
        return r;
    }

    @Override
    public String toString() {
        return "Circle[" + "center=(" + center.getPointX() + "," + center.getPointY()
                + "),radius=" + radius + ",color=" + color  + ",filled=" + filled + ']';
    }
}


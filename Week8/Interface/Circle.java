public class Circle implements GeometricObject {
    public static final double PI = 3.14;

    private Point center;

    private double radius;



    public Circle(Point center, double radius) {
        this.center = center;
        this.radius = radius;
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
        return PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * PI * radius;
    }

    public String returnString(double s) {
        return String.format("%.2f", s);
    }

    @Override
    public String getInfo() {
        return "Circle[(" + returnString(center.getPointX()) + ","
                + returnString(center.getPointY()) + "),r=" + returnString(radius) + "]";
    }

}
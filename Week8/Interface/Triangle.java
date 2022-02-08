import java.lang.Math;

public class Triangle implements GeometricObject {

    private Point p1;
    private Point p2;
    private Point p3;

    /** An especially short bit of Javadoc. */
    public Triangle(Point p1, Point p2, Point p3) throws RuntimeException {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
        if ((p1.getPointX() == p2.getPointX() && p1.getPointY() == p2.getPointY())
                || (p2.getPointX() == p3.getPointX() && p2.getPointY() == p3.getPointY())
                || (p1.getPointX() == p3.getPointX() && p1.getPointY() == p3.getPointY())) {
            throw new RuntimeException();
        }
        if (p1.distance(p2) + p2.distance(p3) == p1.distance(p3)
                || p1.distance(p3) + p2.distance(p3) == p1.distance(p3)
                || p1.distance(p2) + p1.distance(p3) == p2.distance(p3)) {
            throw new RuntimeException();
        }

    }

    public Point getP1() {
        return p1;
    }

    public Point getP2() {
        return p2;
    }

    public Point getP3() {
        return p3;
    }

    @Override
    public double getArea() {
        double area = Math.abs(p1.getPointX() * (p2.getPointY() - p3.getPointY())
                + p2.getPointX() * (p3.getPointY() - p1.getPointY())
                + p3.getPointX() * (p1.getPointY() - p2.getPointY())) / 2;
        return area;
    }

    @Override
    public double getPerimeter() {
        double perimeter = p1.distance(p2) + p2.distance(p3) + p3.distance(p1);
        return perimeter;
    }

    @Override
    public String getInfo() {
        String info = String.format("Triangle[(%.2f,%.2f),(%.2f,%.2f),(%.2f,%.2f)]",
                p1.getPointX(), p1.getPointY(), p2.getPointX(),
                p2.getPointY(), p3.getPointX(), p3.getPointY());
        return info;

    }
}
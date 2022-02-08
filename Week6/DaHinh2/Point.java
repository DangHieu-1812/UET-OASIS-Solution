import java.lang.Math;
public class Point {
    private  double pointX;
    private  double pointY;

    public Point(double pointX, double pointY) {
        this.pointX = pointX;
        this.pointY = pointY;
    }

    public double getPointX() {
        return pointX;
    }

    public void setPointX(double pointX) {
        this.pointX = pointX;
    }

    public double getPointY() {
        return pointY;
    }

    public void setPointY(double pointY) {
        this.pointY = pointY;
    }

    public double distance(Point nw) {
        return Math.sqrt(Math.pow(this.pointX - nw.pointX, 2) +
                Math.pow(this.pointY - nw.pointY, 2));
    }

    /** An especially short bit of Javadoc. */
    public boolean equals(Object o) {
        if (o instanceof  Point) {
            Point otr = (Point) o;
            if (this.pointX == otr.pointX && this.pointY == otr.pointY) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "(" + pointX + "," + pointY + ")";
    }
}

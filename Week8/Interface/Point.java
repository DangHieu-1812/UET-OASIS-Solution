public class Point {
    private double pointX;
    private double pointY;

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

    /** An especially short bit of Javadoc. */
    public double distance(Point other) {
        double distance = Math.sqrt(Math.pow(other.getPointX() - pointX, 2)
                + Math.pow(other.getPointY() - pointY, 2));
        return distance;
    }
}
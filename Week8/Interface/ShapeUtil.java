import java.util.List;

public class ShapeUtil {
    /**
     *printInfor.
     */
    public String printInfo(List<GeometricObject> shapes) {
        String s = "";
        s += "Circle:\n";
        int l = shapes.size();
        for (int i = 0; i < l; i++) {
            if (shapes.get(i) instanceof Circle) {
                s += shapes.get(i).getInfo() + "\n";
            }
        }
        s += "Triangle:\n";
        for (int i = 0; i < l; i++) {
            if (shapes.get(i) instanceof Triangle) {
                s += shapes.get(i).getInfo() + "\n";
            }
        }
        return s;
    }
    public static void main(String[] args){
        Point c = new Point(1,1);
        Point t1 = new Point(1,2);
        Point t2 = new Point(2,-1);
        Point t3 = new Point(-2,-2);
        Circle cir = new Circle(c,1);
        Triangle tri = new Triangle(t1,t2,t3);
        System.out.println(t1.distance(t2));
        System.out.println(cir.getInfo());
        System.out.println(cir.getPerimeter());
        System.out.println(cir.getArea());
        System.out.println(tri.getInfo());
        System.out.println(tri.getPerimeter());
        System.out.println(tri.getArea());
    }
}

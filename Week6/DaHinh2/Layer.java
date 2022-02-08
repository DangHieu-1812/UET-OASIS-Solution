import java.util.ArrayList;
import java.util.List;

public class Layer {
    private List<Shape> shapes = new ArrayList<>();

    public void addShape(Shape otherShape) {
        shapes.add(otherShape);
    }

    /** An especially short bit of Javadoc. */
    public void removeCircles() {
        for (int i = 0; i < shapes.size(); i++) {
            if (shapes.get(i) instanceof Circle) {
                shapes.remove(i);
                i--;
            }
        }
    }

    /** An especially short bit of Javadoc. */
    public String getInfo() {
        String r = "Layer of crazy shapes:\n";
        for (int i = 0; i < shapes.size(); i++) {
            r = r + shapes.get(i).toString() + "\n";
        }
        return r;
    }

    /** An especially short bit of Javadoc. */
    public  void  removeDuplicates() {
        for (int i = 0; i < shapes.size() - 1; i++) {
            for (int j = i + 1; j < shapes.size(); j++) {
                if (shapes.get(i).hashCode() == shapes.get(j).hashCode()) {
                    shapes.remove(j);
                    j--;
                }
            }
        }
    }
}
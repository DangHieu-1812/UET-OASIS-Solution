import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Week11<T> {
    public static <T extends Comparable<T>> List<T> sortGeneric(List<T> arr) {
        Collections.sort(arr);
        return arr;
    }
    public static void main(String[] args){

    }
}


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Week8Task2 {
    public int nullPointerEx() throws NullPointerException {
        int[] arr = {1,2,3};
        return arr[0];
    }

    /**
     *nullPointerExTest.
     */
    public String nullPointerExTest() {
        try {
            nullPointerEx();
        } catch (NullPointerException e) {
            return "Lỗi Null Pointer";
        }
        return "Không có lỗi";
    }

    public void arrayIndexOutOfBoundsEx() throws ArrayIndexOutOfBoundsException {
        int[] arr = new int[8];
        System.out.println(arr[9]);
    }

    /**
     *arrayIndexOutOfBoundsExTest.
     */
    public String arrayIndexOutOfBoundsExTest() {
        try {
            arrayIndexOutOfBoundsEx();
            return ("Không có lỗi");
        } catch (ArrayIndexOutOfBoundsException e) {
            return ("Lỗi Array Index Out of Bounds");
        }
    }

    public void arithmeticEx() throws ArithmeticException {
        int x = 8 / 0;
    }

    /**
     *arithmeticExTest.
     */
    public String arithmeticExTest() {
        try {
            arithmeticEx();
        } catch (ArithmeticException e) {
            return "Lỗi Arithmetic";
        }
        return "Không có lỗi";
    }

    public void fileNotFoundEx() throws FileNotFoundException {
        FileInputStream fis = new FileInputStream("C:\\Users\\Admin\\dictionaries.txt");
    }

    /**
     *fileNotFoundExTest.
     */
    public String fileNotFoundExTest() {
        try {
            fileNotFoundEx();
            return ("Không có lỗi");
        } catch (FileNotFoundException e) {
            return ("Lỗi File Not Found");
        }
    }

    public void ioEx() throws IOException {
        FileInputStream fis = new FileInputStream("C:\\Users\\Admin\\dictionaries.txt");
    }

    /**
     *ioExTest.
     */
    public String ioExTest() {
        try {
            ioEx();
        } catch (IOException e) {
            return "Lỗi IO";
        }
        return "Không có lỗi";
    }
    public static void main(String[] args){
        Week8Task2 test = new Week8Task2();
        System.out.println(test.nullPointerExTest());
        System.out.println(test.arrayIndexOutOfBoundsExTest());
        System.out.println(test.arithmeticExTest());
        System.out.println(test.fileNotFoundExTest());
        System.out.println(test.ioExTest());
    }

}


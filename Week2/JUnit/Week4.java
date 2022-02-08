public class Week4 {
    /**
     *
     * @param a
     * @param b
     * @return max of $a and $b
     */
    public static int max2Int(int a, int b) {
        if (a > b){
            return a;
        }
        return b;
    }

    /**
     *
     * @param arr
     * @return min of array $arr
     */
    public static int minArray(int[] arr) {
        int min=arr[0];
        for (int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        return min;
    }

    /**
     *
     * @param weight: in kg
     * @param height: in m
     * @return BMI index
     */

    public static String calculateBMI(double weight, double height) {
        double BMI = weight / (height * height);
        BMI = (double) Math.round(BMI * 10) / 10;
        if (BMI < 18.5) {
            return "Thiếu cân";
        }
        else if (BMI >= 18.5 && BMI <= 22.9) {
            return "Bình thường";
        }
        else if (BMI >= 23 && BMI <= 24.9) {
            return "Thừa cân";
        }
        return "Béo phì";
    }
    public static void main(String[] args){
        Week4 test = new Week4();
        int m = max2Int(5,3);
        int n[]={1,2,3,4,5};
        int k = minArray(n);
        String c = calculateBMI(70,1.69);
        System.out.print(c);
    }
}


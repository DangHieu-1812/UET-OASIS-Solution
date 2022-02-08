public class Solution {
    public static boolean isPrime(int n) {
        if (n <= 2) {
            return false;
        } else {
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args){
        Solution test = new Solution();
        boolean k = isPrime(3);
        System.out.print(k);
    }

}

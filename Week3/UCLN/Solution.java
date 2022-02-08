public class Solution {
    // Type your main code here
    /** An especially short bit of Javadoc. */
    public static int gcd(int a, int b) {
        if (b == 0) {
            return Math.abs(a);
        }
        return gcd(b, a % b);
    }
    public static void main(String[] args){
        Solution test = new Solution();
        int k = gcd(8,24);
        System.out.print(k);
    }
}

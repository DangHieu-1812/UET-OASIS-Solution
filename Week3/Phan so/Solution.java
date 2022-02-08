public class Solution {
    // Type your main code here
    private int numerator;
    private int denominator;

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    /** Dieu kien mau khac 0. */
    public void setDenominator(int denominator) {
        if (denominator != 0) {
            this.denominator = denominator;
        }
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    /** Khoi phuc gia tri phan so. */
    public Solution(int numerator, int denominator) {
        if (denominator != 0) {
            this.denominator = denominator;
            this.numerator = numerator;
        } else {
            this.denominator = 1;
            this.numerator = numerator;
        }
    }

    /** Tim UCLN cua 2 so. */
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        if (a == 0 && b != 0) {
            return b;
        }
        int tmp;
        while (b != 0) {
            tmp = a % b;
            a = b;
            b = tmp;
        }
        return a;
    }

    /** Phuong thuc rut gon. */
    public Solution reduce() {
        int t = gcd(numerator, denominator);
        numerator /= t;
        denominator /= t;
        return this;
    }

    /** Phuong thuc cong. */
    public Solution add(Solution other) {
        numerator = numerator * other.denominator + denominator * other.numerator;
        denominator = denominator * other.denominator;
        return this;
    }

    /** Phuong thuc tru. */
    public Solution subtract(Solution other) {
        numerator = numerator * other.denominator - denominator * other.numerator;
        denominator = denominator * other.denominator;
        return this;
    }

    /** Phuong thuc nhan. */
    public Solution multiply(Solution other) {
        numerator = numerator * other.numerator;
        denominator = denominator * other.denominator;
        return this;
    }

    /** Phuong thuc chia. */
    public Solution divide(Solution other) {
        if (other.numerator != 0) {
            numerator = numerator * other.denominator;
            denominator = denominator * other.numerator;
        }
        return this;
    }

    /** Phuong thuc so sanh. */
    public boolean equals(Object obj) {
        if (obj instanceof Solution) {
            Solution other = (Solution) obj;
            this.reduce();
            other.reduce();
            if (this.numerator == other.numerator && this.denominator == other.denominator) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args){
        Solution ps1 = new Solution(6,4);
        Solution ps2 = new Solution(8,5);
        System.out.print(ps1.add(ps2).reduce().numerator + "/" + ps1.add(ps2).reduce().denominator);
    }
}


public class Gcd {
    /**
     * To compute the gcd of two positive numbers using eucleadean method
     * Approach: gcd(num1, num2) = gcd(num2, num1 % num2)
     * TC: O(log(min(num1, num2)))
     */
    public int gcd(int num1, int num2) {
        int rem = num1 % num2;
        while (rem != 0) {
            num1 = num2;
            num2 = rem;
            rem = num1 % num2;
        }
        return num2;
    }
}
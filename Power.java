
public class Power {
    /**
     * To compute x^n for two positive integers x and n
     * Approach: We reduce n to half in each step by changing the base
     * from x to x^2. If n is odd we take one x out to make n even and
     * repeat the process.
     * TC: O(log n), assuming x^2 can be computed in O(1)
     */
    public int pow(int x, int n) {
        if (n == 0) {
            return 1;
        }
        return x % 2 == 0 ? pow(x * x, n / 2) : x * pow(x * x, n / 2);
    }

    /**
     * An iterative version of the above
     * Approach: We consider the exponent(n) to be a sum of powers of 2
     * To obtain the correct ans, whenever ith bit is set in n, we multiply
     * the result by x ^ (2 ^ i). To get x ^ (2 ^i) we keep multiplying x by
     * itself in each iteration.
     * TC: O(log n)
     */
    public int iterativePow(int x, int n) {
        int ans = 1;
        while (n > 0) {
            if ((n & 1) == 1) {
                ans *= x;
            }
            x *= x;
            n = n >> 1;
        }
        return ans;
    }
}
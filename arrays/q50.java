package LeetCode.arrays;

public class q50 {
    public static void main(String[] args) {
        
    }
}

class Solution {
    public double myPow(double x, long n) {
        // double ans = x;
        // if (n < 0) {
        //     ans = 1 / x;
        // }

        // if (n == 0) {
        //     return 1;
        // }
        
        // for (int i = 2; i <= Math.abs(n); i++) {
        //     if (n < 0) {
        //         ans *= 1 / x;
        //     }
        //     else {
        //         ans *= x;
        //     }
        // }

        // return ans;

        // return Math.pow(x, n);

        return binaryExp(x, (long) n);
    }

    private double binaryExp(double x, long n) {
        // Base case:
        if (n == 1) {
            return x;
        }

        if (n == 0) {
            return 1;
        }

        if (n < 0) {
            return 1.0 / binaryExp(x, -n);
        }

        if (n % 2 == 1) {
            return x * binaryExp(x * x,(n - 1) / 2);
        }
        else {
            return binaryExp(x * x, n / 2);
        }
    }
}
package LeetCode.arrays;

public class q42 {
    public static void main(String[] args) {
        
    }
}

class Solution {
    public int trap(int[] height) {
        int n = height.length;

        int lMax[] = new int[n];
        int rMax[] = new int[n];

        lMax[0] = height[0];
        rMax[n - 1] = height[n - 1];

        for (int i = 1; i < n; i++) {
            lMax[i] = Math.max(lMax[i - 1], height[i]);
        }
        for (int i = n - 2; i >= 0; i--) {
            rMax[i] = Math.max(rMax[i + 1], height[i]);
        }

        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum += Math.min(lMax[i], rMax[i]) - height[i];
        }

        return sum;
    }
}

class Solution2 {
    public int trap(int[] height) {

        int sum = 0;
        int n = height.length;
        int l = 0, r = n - 1;

        int lMax = 0, rMax = 0;

        while (l < r) {
            lMax = Math.max(lMax, height[l]);
            rMax = Math.max(rMax, height[r]);

            if (lMax < rMax) {
                sum += lMax - height[l];
                l++;
            }
            else {
                sum += rMax - height[r];
                r--;
            }
        }

        return sum;
    }
}   


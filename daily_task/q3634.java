package daily_task;
import java.util.*;

public class q3634 {
    public static void main(String[] args) {
        
    }
}

class Solution {
    public int minRemoval(int[] nums, int k) {
        int n = nums.length;
        Arrays.sort(nums);

        int ans = n;
        int j = 0;

        for (int i = 0; i < n; i++) {
            while (j < n && nums[j] <= (long) nums[i] * k) j++;
            ans = Math.min(ans, n - (j - i));
        }

        return ans;
    }
}

import java.util.*;

public class q239 {
    public static void main(String[] args) {
        
    }
}

// First approatch:
class Solution1 {
    public int[] maxSlidingWindow(int[] nums, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i <= nums.length - k; i++) {
            ArrayList<Integer> win = new ArrayList<>();
            for (int j = i; j < i + k; j++) {
                win.add(nums[j]);
            }
            Collections.sort(win);
            list.add(win.get(k - 1));
        }

        int max[] = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            max[i] = list.get(i);
        }

        return max;
    }
}

// Second approatch (optimal):
class Solution2 {
    public int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer> dq = new LinkedList<>();
        int n = nums.length;
        int ans[] = new int[n - k + 1];
        ArrayList<Integer> list = new ArrayList<>();

        // First window:
        for (int i = 0; i < k; i++) {
            while (!dq.isEmpty() && nums[dq.peekLast()] <= nums[i]) {
                dq.removeLast();
            }

            dq.addLast(i);
        }

        for (int i = k; i < n; i++) {
            list.add(nums[dq.peekFirst()]);

            // Remove out of curr window
            while (!dq.isEmpty() && dq.peekFirst() <= i - k) {
                dq.removeFirst();
            }

            // Remove smaller values:
            while (!dq.isEmpty() && nums[dq.peekLast()] <= nums[i]) {
                dq.removeLast();
            }
            dq.addLast(i);
        }

        list.add(nums[dq.peekFirst()]);

        // Converting list to ans:
        for (int i = 0; i < list.size(); i++) {
            ans[i] = list.get(i);
        }

        return ans;
    }
}
package LeetCode.arrays;
import java.util.*;

public class q75 {
    public static void main(String[] args) {
        
    }
}

class Solution {
    public void sortColors(int[] nums) {
        HashMap<Integer, Integer> count = new HashMap<>();
        count.put(0, 0);
        count.put(1, 0);
        count.put(2, 0);

        for (int num : nums) {
            count.put(num, count.get(num) + 1);
        }

        int idx = 0;
        for (int color = 0; color < 3; color++) {
            int freq = count.get(color);
            for (int i = 1; i <= freq; i++) {
                nums[idx] = color;
                idx++;
            }
        }
    }

    // private void mergeSort(int[] nums, int si, int ei) {
    //     // base case:
    //     if (si == ei) return;

    //     // Work:
    //     int mid = si + (ei - si) / 2;
    //     mergeSort(nums, si, mid); // left
    //     mergeSort(nums, mid + 1, ei); // right

    //     merge(nums, si, ei, mid);
    // }

    // private void merge(int nums[], int si, int ei, int mid) {
    //     int temp[] = new int[ei - si + 1];
    //     int i = 0;
    //     int j = mid + 1;
    //     int k = 0;

    //     while (i < mid && j > mid) {
    //         if (nums[i] < nums[j]) {
    //             temp[k] = nums[i++];
    //         }
    //         if (nums[i] > nums[j]) {
    //             temp[k] = nums[j++];
    //         }
    //         k++;
    //     }

    //     // Left:
    //     while(i <= mid) {
    //         temp[k++] = nums[i++];
    //     }

    //     // Right:
    //     while(j <= ei) {
    //         temp[k++] = nums[j++];
    //     }

    //     for (k = 0; k < temp.length; k++) {
    //         nums[k] = temp[k];
    //     }
    
}
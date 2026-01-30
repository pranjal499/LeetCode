import java.util.Stack;

public class q84 {
    public static void main(String[] args) {

    }
}

class Solution {
    public int largestRectangleArea(int[] heights) {
        int maxArea = 0;
        int n = heights.length;
        int rMin[] = new int[n], lMin[] = new int[n];

        rMin[n - 1] = n;
        lMin[0] = -1;

        // right min arr:
        Stack<Integer> rStack = new Stack<>();
        rStack.push(n - 1);

        for (int i = n - 2; i >= 0; --i) {
            while (!rStack.isEmpty() && heights[rStack.peek()] >= heights[i])
                rStack.pop();

            rMin[i] = rStack.isEmpty() ? n : rStack.peek();
            rStack.push(i);
        }

        // Left min arr:
        Stack<Integer> lStack = new Stack<>();
        lStack.push(0);

        for (int i = 1; i < n; ++i) {
            while (!lStack.isEmpty() && heights[lStack.peek()] >= heights[i])
                lStack.pop();

            lMin[i] = lStack.isEmpty() ? -1 : lStack.peek();
            lStack.push(i);
        }

        // Calculating maximum area:
        for (int i = 0; i < n; i++) {
            int width = rMin[i] - lMin[i] - 1;
            maxArea = Math.max(maxArea, width * heights[i]);
        }

        return maxArea;
    }
}

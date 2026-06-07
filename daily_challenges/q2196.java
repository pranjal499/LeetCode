import java.util.*;

public class q2196 {
    public static void main(String[] args) {

    }
}

class Solution {

    // * Definition for a binary tree node.
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public TreeNode createBinaryTree(int[][] descriptions) {
        // Create hash map for node value relationship:
        Map<Integer, TreeNode> nodeMap = new HashMap<>();

        // child set:
        Set<Integer> children = new HashSet<>();

        // Iterate through descriptions:
        for (int[] description : descriptions) {
            // Extracting values of parent, child and isLeft:

            int parentValue = description[0];
            int childValue = description[1];
            boolean isLeft = description[2] == 1;

            // Create parent and child nodes is not already craeted:
            if (!nodeMap.containsKey(parentValue)) {
                nodeMap.put(parentValue, new TreeNode(parentValue));
            }

            if (!nodeMap.containsKey(childValue)) {
                nodeMap.put(childValue, new TreeNode(childValue));
            }

            // Attach child node to parent's left or right branch:
            if (isLeft) {
                nodeMap.get(parentValue).left = nodeMap.get(childValue);
            } else {
                nodeMap.get(parentValue).right = nodeMap.get(childValue);
            }

            children.add(childValue);
        }

        // Find and return the root node:
        for (TreeNode node : nodeMap.values()) {
            if (!children.contains(node.val)) {
                return node; // root node found
            }
        }

        return null;
    }
}

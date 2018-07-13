package com.company;

public class Main {

    /**
     * Definition for a binary tree node.
     * public class TreeNode {
     *     int val;
     *     TreeNode left;
     *     TreeNode right;
     *     TreeNode(int x) { val = x; }
     * }
     */
    class Solution {
        int max = Integer.MIN_VALUE;
        public int maxPathSum(TreeNode root) {
            helper(root);
            return max;
        }

        private int helper(TreeNode node) {
            if (node == null) {
                return 0;
            }

            int left = Math.max(0, helper(node.left));
            int right = Math.max(0, helper(node.right));
            //contian the node itself
            max = Math.max(max, (node.val + left + right));

            //contain only one branch because it needs to return to its parent
            return node.val + Math.max(left, right);
        }
    }

    public static void main(String[] args) {
	// write your code here
    }
}

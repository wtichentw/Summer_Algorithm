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
        public boolean isBalanced(TreeNode root) {
            return helper(root) != -1;
        }

        private int helper(TreeNode root) {
            if (root == null) {
                return 0;
            }
            int left = helper(root.left);
            int right = helper(root.right);
            if (left == -1 || right == -1) {
                return -1;
            } else if (Math.abs(left - right) > 1) {
                return -1;
            } else {
                return Math.max(left, right) + 1;
            }
        }
    }


    public static void main(String[] args) {
	// write your code here
    }
}

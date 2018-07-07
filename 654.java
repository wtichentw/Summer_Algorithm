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
        public TreeNode constructMaximumBinaryTree(int[] nums) {
            return helper(nums, 0, nums.length - 1);
        }

        private TreeNode helper(int[] nums, int start, int end) {
            // if (start >= nums.length || start < 0 || end >= nums.length || end < 0) {
            //     return null;
            // }
            if (start > end) {
                return null;
            }
            int maxIndex = findMaxIndex(nums, start, end);
            // System.out.println("maxIndex:" + maxIndex + "   start:" + start + "  end:" + end);
            TreeNode root = new TreeNode(nums[maxIndex]);
            root.left = helper(nums, start, maxIndex - 1);
            root.right = helper(nums, maxIndex + 1, end);
            return root;
        }

        private int findMaxIndex(int[] nums, int start, int end) {
            int maxIndex = start;
            for (int i = start; i <= end; i++) {
                if (nums[maxIndex] < nums[i]) {
                    maxIndex = i;
                }
            }
            return maxIndex;
        }
    }


    public static void main(String[] args) {
	// write your code here
    }
}

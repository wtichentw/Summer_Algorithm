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
        public List<List<Integer>> levelOrder(TreeNode root) {
            List<List<Integer>> ans = new ArrayList<>();
            if (root == null) {
                return ans;
            }
            Queue<TreeNode> q = new LinkedList<>();
            q.offer(root);

            while (!q.isEmpty()) {
                int size = q.size();
                List<Integer> levelNode = new ArrayList<Integer>();
                for (int i = 0; i < size; i++) {
                    TreeNode node = q.poll();
                    levelNode.add(node.val);
                    if (node.left != null)  q.offer(node.left);
                    if (node.right != null) q.offer(node.right);
                }
                ans.add(levelNode);
            }

            return ans;
        }
    }
    public static void main(String[] args) {
	// write your code here
    }
}

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

/*
            5
        3       7
      1   4   6   8
     
     0 1 2 3 4 5 6
     
post: 1,4,3,6,8,7,5
in  : 1,3,4,5,6,7,8    n = 7
*/


class Solution {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        return helper(inorder, postorder, postorder.length - 1, 0, inorder.length - 1);
    }
    
    private TreeNode helper(int[] inorder, int[] postorder, int postIndex, int startIn, int endIn) {
        if (postIndex < 0 || startIn > endIn) {
            return null;
        }
        
        TreeNode node = new TreeNode(postorder[postIndex]);
        
        int index = startIn;
        for (; index < endIn; index++) {
            if (postorder[postIndex] == inorder[index]) {
                break;
            }
        }
        node.left = helper(inorder, postorder, postIndex - (endIn - index + 1), startIn, index - 1);
        node.right = helper(inorder, postorder, postIndex - 1, index + 1, endIn);
        return node;
    }
}

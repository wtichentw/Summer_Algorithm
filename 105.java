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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return helper(preorder, inorder, 0, 0, preorder.length - 1);
    }
    
    private TreeNode helper(int[] preorder, int[] inorder, int preIndex, int inStart, int inEnd) {
        if (preIndex >= preorder.length || inStart > inEnd) {
            return null;
        }
        
        TreeNode node = new TreeNode(preorder[preIndex]);
        
        int index = inStart;
        for (; index < inEnd; index++) {
            if (inorder[index] == preorder[preIndex]) {
                break;
            }
        }
        
        node.left = helper(preorder, inorder, preIndex + 1, inStart, index - 1);
        node.right = helper(preorder, inorder, preIndex + (index - inStart + 1), index + 1, inEnd);
        return node;
    }
}

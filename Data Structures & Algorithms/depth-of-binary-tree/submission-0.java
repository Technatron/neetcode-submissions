/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    public int maxDepth(TreeNode root) {
        if(root==null) return 0;

        int left = maxDepth(root.left);
        int right = maxDepth(root.right);

        if(left>right) {
            return left+1;
        }
        else{
            return right+1;
        }
      
        
    }

    // public static int helper(TreeNode root, int size){
    //     if(root.left==null && root.right==null) return size;

    //         int left = helper(root.left, size+1);
    //     int right = helper(root.right, size+1);

    //     return Math.max(left, right);
    // }
}

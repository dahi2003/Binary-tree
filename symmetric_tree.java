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
    public TreeNode invert(TreeNode root){
        if(root==null) return root;
        TreeNode temp=root.left;
        root.left=invert(root.right);
        root.right=invert(temp);
        return root;
    }
    public boolean isSame(TreeNode p,TreeNode q){
        if(p==null && q==null) return true;
        if(p==null || q==null) return false;
        if(p.val!=q.val) return false;
        return isSame(p.left,q.left) && isSame(p.right,q.right);
    }
    public boolean isSymmetric(TreeNode root) {
        root.left=invert(root.left);
        return isSame(root.left,root.right);

    }
}

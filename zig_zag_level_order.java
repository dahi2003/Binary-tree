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
    public static int height(TreeNode root) {
        if (root == null || (root.left == null && root.right == null)) {
            return 0;
        }
        return 1 + Math.max(height(root.left), height(root.right));
    }

    public List<Integer> nthlevel(TreeNode root, int n) {
        List<Integer> result = new ArrayList<>();
        if (root == null)
            return result;
        if (n == 1) {
            result.add(root.val);
        } else {
            result.addAll(nthlevel(root.left, n - 1));
            result.addAll(nthlevel(root.right, n - 1));
        }
        return result;
    }

    public List<Integer> nthlevel2(TreeNode root, int n) {
        List<Integer> result = new ArrayList<>();
        if (root == null)
            return result;

        if (n == 1) {
            result.add(root.val);
        } else {
            result.addAll(nthlevel2(root.right, n - 1));
            result.addAll(nthlevel2(root.left, n - 1));
        }
        return result;
    }

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        if (root == null)
            return new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        int level = 1 + height(root);
        for (int i = 1; i <= level; i++) {
            if (i % 2 != 0) {
                ans.add(nthlevel(root, i));
            } else {
                ans.add(nthlevel2(root, i));

            }
        }
        return ans;

    }
}

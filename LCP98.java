/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */
class Solution {
    public boolean isValidBST(TreeNode root) {
        List<Integer> s = new ArrayList<>();
        inOrder(root, s);
        for (int i = 0; i < s.size() - 1; i++) {
            if (s.get(i) >= s.get(i + 1)) {
                return false;
            }
        }
        return true;

    }

    void inOrder(TreeNode root, List<Integer> s) {
        if (root == null) {
            return;
        }
        inOrder(root.left, s);
        s.add(root.val);
        inOrder(root.right, s);
    }

}

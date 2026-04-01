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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> i = new ArrayList<Integer>();
        inorder(root,i);
        return i;

        
    }
    void inorder(TreeNode root,List<Integer> i){
        if(root==null){
            return;
        }
        inorder(root.left,i);
        i.add(root.val);
        inorder(root.right,i);
    } 
}
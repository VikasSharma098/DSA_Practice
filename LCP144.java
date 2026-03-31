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
    public List<Integer> preorderTraversal(TreeNode root) {
        ArrayList<Integer> v = new ArrayList<Integer>();
        preorder(root,v);
        return v;


        
    }
    void preorder(TreeNode root,List<Integer> v){
        if(root==null){
            return;
        }
        v.add(root.val);
        preorder(root.left,v);
        preorder(root.right,v);
        


    }
}
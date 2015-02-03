/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public boolean isValidBST(TreeNode root) {
        if(root == null){
            return true;
        }
        return DFS(root, Double.NEGATIVE_INFINITY, Double.POSITIVE_INFINITY);
    }
    
    public boolean DFS(TreeNode node, double low, double high ){
        boolean res = true;
        if(node.left !=null){
            if(node.left.val>= node.val || node.left.val<= low){
                return false;
            }
            res = res && DFS(node.left, low, node.val);
        }
        if(node.right !=null){
            if(node.right.val <= node.val || node.right.val >= high){
                return false;
            }
            res = res && DFS(node.right, node.val, high);
        }
        return res;
    }
}

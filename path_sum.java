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
    public boolean hasPathSum(TreeNode root, int sum) {
        if(root==null){
            return false;
        }
        return DFS(root, 0, sum);
    }
    
    public boolean DFS(TreeNode node, int sum, int target){
        sum = sum + node.val;
        if(node.left==null && node.right==null && sum==target){
            return true;
        }else{
            boolean res = false;
            if(node.left!=null){
              res = res ||DFS(node.left, sum, target);
            }
            if(node.right!=null){
              res = res || DFS(node.right, sum, target);
            }
            return res;
        }
       
    }
}

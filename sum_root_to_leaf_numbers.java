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
    public int sumNumbers(TreeNode root) {
        if(root==null){
            return 0;
        }
        return DFS(root, 0);
    }
    
    public int DFS(TreeNode node, int curr){
        curr = curr*10 + node.val;
        if(node.left==null && node.right==null){
            return curr;
        }else{
            int sum = 0;
            if(node.left!=null){
                sum += DFS(node.left, curr);
            }
            if(node.right!=null){
                sum += DFS(node.right, curr); 
            }
            return sum;
        }
    }
}

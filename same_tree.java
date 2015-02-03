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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        return DFS(p,q);
    }
    
    public boolean DFS(TreeNode p, TreeNode q){
        if(p==null){
            if(q==null){
                return true;
            }
            return false;
        }
        if(q ==null){
            return false;
        }
        if(p.val != q.val){
            return false;
        }
        return DFS(p.left, q.left) && DFS(p.right, q.right);
    }
}

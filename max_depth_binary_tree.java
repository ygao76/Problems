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
    public int maxDepth(TreeNode root) {
        if(root==null){
            return 0;
        }else{
            int leftMax = 1+maxDepth(root.left);
            int rightMax = 1+maxDepth(root.right);
            if(rightMax>leftMax){
                return rightMax;
            }
            return leftMax;
        }
    }
    
    public int maxDepth2(TreeNode root) {
        return DFS(root, 0,0);
    }
    
    public int DFS(TreeNode node, int max, int path){
        if(node!=null){
            path++;
            if(node.left==null&&node.right==null){
                if(max<path){
                    max = path;
                }
                return max;
            }
            else{
                int leftMax = DFS(node.left, max, path);
                if(max<leftMax){
                    max = leftMax;
                }
                int rightMax = DFS(node.right, max, path);
                if(max<rightMax){
                    max = rightMax;
                }
                return max;
            }
        }
        return 0;
    }
}

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
    public int minDepth(TreeNode root) {
        if(root==null){
            return 0;
        }else{
            int minLeft = 1+ minDepth(root.left);
            int minRight = 1+ minDepth(root.right);
            if(minLeft == 1){
                return minRight;
            }
            else if(minRight ==1 ){
                return minLeft;
            }
            else if(minRight < minLeft){
                minLeft = minRight;
            }
            return minLeft;
        }
    }
}

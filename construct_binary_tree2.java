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
    public TreeNode buildTree(int[] inorder, int[] postorder) {
         if(inorder ==null || inorder.length==0){
            return null;
        }
        return buildTreeHelper(postorder, inorder, 0, postorder.length-1, 0, inorder.length-1);
    }
    
    public TreeNode buildTreeHelper(int[] postorder, int[] inorder, int postStart, int postEnd, int inStart, int inEnd){
        if(postStart>postEnd || inStart>inEnd){
            return null;
        }
        int rootVal = postorder[postEnd];
        int i;
        for(i= inStart; i<=inEnd;i++){
            if(inorder[i]==rootVal){
                break;
            }
        }
        TreeNode root = new TreeNode(rootVal);
        
        root.left = buildTreeHelper(postorder, inorder, postStart,postStart+i-1-inStart,inStart, i-1);
        
        root.right = buildTreeHelper(postorder, inorder, postStart+i-inStart, postEnd-1, i+1, inEnd);
        
        return root;
    }
}

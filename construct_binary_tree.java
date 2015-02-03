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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if(preorder ==null || preorder.length==0){
            return null;
        }
        return buildTreeHelper(preorder, inorder, 0, preorder.length-1, 0, inorder.length-1);
    }
    
    public TreeNode buildTreeHelper(int[] preorder, int[] inorder, int preorderStart, int preorderEnd, int inorderStart, int inorderEnd){
        if(preorderStart==preorderEnd){
            return new TreeNode(preorder[preorderStart]);
        }
        int preorderNode = preorder[preorderStart];
        TreeNode root = new TreeNode(preorderNode);

        int i;
        for(i= inorderStart; i<=inorderEnd;i++){
            if(inorder[i]==preorderNode){
                break;
            }
        }
        if(i!=inorderStart){
            root.left = buildTreeHelper(preorder, inorder, preorderStart+1,preorderStart+i-inorderStart,inorderStart, i-1);
        }
        if(i<inorderEnd){
            root.right = buildTreeHelper(preorder, inorder, preorderStart+i-inorderStart+1,preorderEnd, i+1, inorderEnd);
        }
        return root;
    }
}

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
    public List<Integer> preorderTraversal(TreeNode root) {
        if(root==null){
            return new ArrayList<Integer>();
        }
        Stack<TreeNode> stack = new Stack<TreeNode>();
        List<Integer> preorder = new ArrayList<Integer>();
        stack.push(root);
        while(!stack.isEmpty()){
            TreeNode top = stack.pop();
            preorder.add(top.val);
            if(top.right!=null)
                stack.push(top.right);
            if(top.left!=null)
                stack.push(top.left);
        }
        return preorder;
    }
}

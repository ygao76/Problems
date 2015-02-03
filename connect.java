/**
 * Definition for binary tree with next pointer.
 * public class TreeLinkNode {
 *     int val;
 *     TreeLinkNode left, right, next;
 *     TreeLinkNode(int x) { val = x; }
 * }
 */
public class Solution {
    public void connect(TreeLinkNode root) {
        if(root==null){
            return;
        }else{
            root.next =null;
        }
        while(root!=null){
            TreeLinkNode curr = root;
            while(curr.left!=null){
                curr.left.next = curr.right;
                if(curr.next!=null){
                    curr.right.next = curr.next.left;
                }else{
                    curr.right.next = null;
                    break;
                }
                curr = curr.next;
            }
            root = root.left;
        }
    }
}

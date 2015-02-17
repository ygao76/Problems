/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
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
    public TreeNode sortedListToBST(ListNode head) {
        //recurrsive build the tree, given the head node build a tree and
        //set the tree as subtree 
        int length = 0;
        ListNode iter = head;
        while(iter!=null){
            length ++;
            iter = iter.next;
        }
        return sortedListToBSTBuilder(head, length);
       
    }
    
    public TreeNode sortedListToBSTBuilder(ListNode head, int length){
        if(length==0){
            return null;
        }
        if(length==1){
            return new TreeNode(head.val);
        }
        int mid = length/2;
        ListNode middle = head;
        ListNode prev = head;
        int i = 0;
        while(i!=mid){
           prev = middle;
           middle = middle.next;
           i++;
        }
        TreeNode root = new TreeNode(middle.val);
        prev.next = null;
        root.left = sortedListToBSTBuilder(head, mid);
        if(middle.next!=null){
            root.right = sortedListToBSTBuilder(middle.next, length-mid-1);
        }
        return root;
    }
}

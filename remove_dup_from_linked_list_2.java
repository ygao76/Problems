/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
        ListNode prev = new ListNode(0);
        prev.next = head;
        ListNode newHead = prev;
        ListNode curr = head;
        while(curr.next!=null){
            if(curr.val==curr.next.val){
                int value = curr.val;
                while(curr !=null && curr.val ==value){
                    curr = curr.next;
                }
                prev.next = curr;
                if(curr==null){
                    break;
                }
            }else{
                curr = curr.next;
                prev = prev.next;
            }
        }
        return newHead.next;
    }
}

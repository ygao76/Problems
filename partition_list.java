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
    public ListNode partition(ListNode head, int x) {
        if(head==null || head.next==null){
            return head;
        }
        ListNode largeHead = new ListNode(0);
        ListNode largeTail = largeHead;
        ListNode newHead = new ListNode(0);
        newHead.next = head;
        ListNode curr = newHead;
        while(curr.next!=null){
            if(curr.next.val>=x){
               ListNode next = curr.next;
               curr.next = next.next;
               largeTail.next = next;
               largeTail = next;
            }else{
               curr = curr.next;
            }
        }
        curr.next = largeHead.next;
        largeTail.next = null;
        return newHead.next;
    }
}

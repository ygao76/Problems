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
    public ListNode swapPairs(ListNode head) { 
        if(head==null || head.next==null){ 
            return head; 
        } 
        head = swapOnePair(head); 
        ListNode curr = head.next; 
        while(curr.next!=null){ 
            ListNode next = swapOnePair(curr.next); 
            curr.next = next; 
            curr = curr.next; 
            if(curr.next!=null){ 
                curr = curr.next; 
            }else{ 
                break; 
            } 
        } 
        return head; 
    } 
    public ListNode swapOnePair(ListNode node){ 
        if(node.next==null){ 
            return node; 
        } 
        ListNode newHead = node.next; 
        node.next = newHead.next; 
        newHead.next = node; 
        return newHead; 
    } 
}

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
    public ListNode rotateRight(ListNode head, int n) {
        if( head==null){
            return head;
        }
        n = n % getLength(head);
        if(n==0){
            return head;
        }
        ListNode fast = head;
        ListNode slow = head;
        while(n!=0){
            fast = fast.next;
            n--;
        }
        while(fast.next!=null ){
            fast = fast.next;
            slow = slow.next;
        }
        fast.next = head;
        head = slow.next;
        slow.next = null;
        return head;

    }
    
    public int getLength(ListNode head){
        int length=0;
        while(head!=null){
            head = head.next;
            length++;
        }
        return length;
    }
}

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
        if(n==0 || head ==null){
            return head;
        }
        int length = getLength(head);
        
        int shift = length -(n % length) -1;
        if(shift==(length-1)){
            return head;
        }
        ListNode curr = head;
        while(shift>0){
            curr = curr.next;
            shift--;
        }
        ListNode newHead = curr.next;
        curr.next = null;
        curr = newHead;
        while(curr.next!=null){
            curr = curr.next;
        }
        curr.next = head;
        return newHead;
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

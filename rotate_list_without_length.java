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
        int length = 1;
        ListNode cur = head;
        while(cur.next!=null){
            cur = cur.next;
            length++;
        }
        n = n % length;
        ListNode tail = cur;
        tail.next = head;
        int shift = length - n;
        while(shift !=0){
            cur = cur.next;
            shift--;
        }
        head = cur.next;
        cur.next = null;
        return head;
    }
}

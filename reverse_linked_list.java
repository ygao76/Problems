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
    public ListNode reverseBetween(ListNode head, int m, int n) {
        if(head==null || head.next==null){
            return head;
        }
        if(m==n){
            return head;
        }
        ListNode newHead = new ListNode(0);
        newHead.next = head;
        ListNode cur = newHead;
        
        int diff = n-m;
        //go to (m-1)th node
        while(m!=1){
            cur = cur.next;
            m--;
        }
        //reverse
        ListNode start = cur;
        ListNode end = cur.next;
        cur = cur.next;
        ListNode nextNode = cur.next;
        while( diff!=0 && nextNode!=null){
            ListNode temp = nextNode.next;
            nextNode.next = cur;
            cur = nextNode;
            nextNode = temp;
            diff--;
        }
        start.next = cur;
        end.next = nextNode;
        return newHead.next;
        
    }
}

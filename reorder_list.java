/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public void reorderList(ListNode head) {
        int length = getListLength(head);
        if(length==1 || length==0){
            return;
        }
        ListNode reverseListHead = reverseList(head);

        while(length>1){
            if(length==2){
                head.next = reverseListHead;
                reverseListHead.next=null;
                return;
            }else{
                ListNode nextNode = head.next;
                head.next = reverseListHead;
                ListNode reverseListNext = reverseListHead.next;
                reverseListHead.next = nextNode;
                head = nextNode;
                reverseListHead = reverseListNext;
                length = length-2;
            }
        }
        head.next=null;
    }
    
    public int getListLength(ListNode head){
        int len = 0;
        while(head!=null){
            len++;
            head = head.next;
        }
        return len;
    }
    
    public ListNode reverseList(ListNode head){
        ListNode prevNode = null;
        ListNode reverseListHead = null;
        while(head!=null){
            reverseListHead = new ListNode(head.val);
            reverseListHead.next = prevNode;
            prevNode = reverseListHead;
            head = head.next;
        }
        return reverseListHead;
    }
}

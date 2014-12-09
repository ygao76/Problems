class MinStack {
    private ListNode min;
    private ListNode head;
    public void push(int x) {
        if(head==null){
            head = new ListNode(x);
            min = new ListNode(x);
        }else{
            ListNode newHead = new ListNode(x);
            newHead.next = head;
            head = newHead;
            if(x<=min.val){
                ListNode newMin = new ListNode(x);
                newMin.next = min;
                min = newMin;
            }
        }
    }

    public void pop() {
        if(head.val==min.val){
            min = min.next;
        }
        head = head.next;
        
    }

    public int top() {
        return head.val;
    }

    public int getMin() {
        return min.val;
    }
    
    public class ListNode{
       int val;
       ListNode next;
       ListNode(int x) {
           val = x;
           next = null;
       }
    }
}


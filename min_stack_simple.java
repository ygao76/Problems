class MinStack {
    private ListNode head;
    public void push(int x) {
        if(head==null){
            head = new ListNode(x,x);
        }else{
            int curMin = head.minVal;
            if(x< curMin){
                curMin = x;
            }
            ListNode newHead = new ListNode(x, curMin);
            newHead.next = head;
            head = newHead;
        }
    }

    public void pop() {
        head = head.next;
        
    }

    public int top() {
        return head.val;
    }

    public int getMin() {
        return head.minVal;
    }
    
    public class ListNode{
       int val;
       int minVal;
       ListNode next;
       ListNode(int x, int min) {
           val = x;
           minVal = min;
           next = null;
       }
    }
}


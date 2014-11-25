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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode startNode=null;
        ListNode prevNode=null;
        boolean extra = false;
        while(l1!=null ||l2!=null || extra){
            AddHelper helper =  new AddHelper(l1,l2,extra);
            ListNode currNode = new ListNode(helper.add());
            if(startNode==null){
                startNode = currNode;
                prevNode = currNode;
            }else{
                prevNode.next = currNode;
                prevNode = prevNode.next;
            }
            extra = helper.getExtra();
            if(l1!=null){
              l1 = l1.next;
            }
            if(l2!= null){
              l2 = l2.next;
            }
        }
        return startNode;
    }
    
    public class AddHelper{
        boolean extra;
        ListNode node1;
        ListNode node2;
        
        public AddHelper(ListNode node1,ListNode node2, boolean extra){
            this.node1 = node1;
            this.node2 = node2;
            this.extra = extra;
        }
        
        public int add(){
            int res;
            if(this.node1==null && this.node2==null){
                res = 0;
            }else if(this.node1!=null && this.node2==null){
                res = this.node1.val;
            }else if(this.node1==null && this.node2!=null){
                res = this.node2.val;
            }else{
                res= node1.val + node2.val;
            }
            if(this.extra){
                res = res +1;
                this.extra = false;
            }
            if(res>9){
                this.extra = true;
                res = res -10;
            }
            return res;
        }
        
        public boolean getExtra(){
            return this.extra;
        }
    }
}

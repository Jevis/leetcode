/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
 /**
 很巧妙的时候是一个head 解决了ListNode的开始时候的判断
 */
 
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode prev=new ListNode(0);
        ListNode head=prev;
        int addNum=0;
        while(l1 != null || l2 != null || addNum != 0){
            ListNode cur=new ListNode(0); 
            int sum = (l1 != null? l1.val : 0)+(l2 != null? l2.val:0)+addNum;
               addNum  = sum >= 10 ? sum/10 :0;
            
            cur.val=sum % 10;
            prev.next =cur; 
            prev=cur;
            
            l1=(l1!=null)? l1.next:l1;
            l2=(l2!=null)? l2.next:l2;
            
           
            
        }
        return head.next;
    }
}
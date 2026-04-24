/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next==null){
            return head;
        }
        Stack<ListNode> a = new Stack<>();
        ListNode b=head;
        while(b!=null){
            a.push(b);
            b=b.next;
        }
        head=a.pop();
        b=head;
         while (!a.isEmpty()) {
            b.next = a.pop();
            b = b.next;
        }
        b.next=null;
        return head;
    }
}
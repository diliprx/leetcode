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
    public ListNode rotateRight(ListNode head, int k) {
        if(k==0 || head==null || head.next==null){
            return head;
        }
        int l=1;
        ListNode curr=head;
        while(curr.next!=null){
            curr=curr.next;
            l++;
        }
        k%=l;
        if(k==0){
            return head;
        }

        curr.next=head;
        for(int i=0;i<l-k;i++){
            curr=curr.next;
        }
        head=curr.next;
        curr.next=null;
        return head;
    }
}
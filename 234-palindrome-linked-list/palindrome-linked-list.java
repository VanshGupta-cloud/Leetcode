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
    public boolean isPalindrome(ListNode head) { 
        if(head==null||head.next==null)return true;
        ListNode slow=head;
        ListNode fast=head;

        while(fast!=null&&fast.next!=null)
        {
            fast=fast.next.next;
            slow=slow.next;
        }
        if(fast!=null)//odd
        {
            slow=slow.next;
        }
       ListNode sechalf= reverse(slow);
       ListNode frsthalf=head;
       while(sechalf!=null)
       {
        if(frsthalf.val!=sechalf.val)
        {
            return false;
        }
        frsthalf=frsthalf.next;
        sechalf=sechalf.next;
       }
       return true;
    }
    public ListNode reverse(ListNode head){
        ListNode curr=head;
        ListNode prev=null;
        while(curr!=null)
        {
            ListNode temp=curr.next;
            curr.next=prev;
            prev=curr;
            curr=temp;          
        }
        return prev;
    }
}
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
    public ListNode modifiedList(int[] nums, ListNode head) {
        ListNode curr = head;
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }
        ListNode dummy = new ListNode(0);
        ListNode p1 = dummy;
        while (curr != null) {
            if (!set.contains(curr.val)) {
                p1.next = curr;
                p1 = p1.next;
            }
                curr=curr.next;
        }
        p1.next=null;
        return dummy.next;
    }
}
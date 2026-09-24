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
    public ListNode deleteDuplicates(ListNode head) {

        if (head == null || head.next == null) {
            return head;
        }

        ListNode prev = null;
        ListNode low = head;
        ListNode high = head.next;

        while (high != null) {

            if (low.val != high.val) {
                prev = low;
                low = high;
                high = high.next;
            } else {
                int duplicate = low.val;

                while (high != null && high.val == duplicate) {
                    high = high.next;
                }

                if (prev == null) {
                    head = high;
                } else {
                    prev.next = high;
                }

                low = high;

                if (high != null) {
                    high = high.next;
                }
            }
        }

        return head;
    }
}
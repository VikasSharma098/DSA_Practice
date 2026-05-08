/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if (k == 0 || head == null) {
            return head;
        }
        ListNode t = head;
        int n = 1;
        while (t.next != null) {
            n++;
            t = t.next;
        }

        k = k % n;
        if (k == 0)
            return head;
        t.next = head;
        ListNode prev = null;
        for (int i = 0; i < n - k; i++) {
            prev = head;
            head = head.next;
        }
        prev.next = null;
        return head;

    }
}
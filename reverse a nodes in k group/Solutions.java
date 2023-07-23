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
    public ListNode reverseKGroup(ListNode head, int k) {
        int count = 0;
        ListNode temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }

        int groups = count / k;
        ListNode dummy = new ListNode();
        dummy.next = head;
        temp = dummy;

        for (int i = 0; i < groups; i++) {
            int nodes = k;
            ListNode first = temp.next;
            ListNode second = first.next;
            ListNode prev = temp;

            while (nodes > 1) {
                ListNode next = second.next;
                second.next = first;
                first = second;
                second = next;
                nodes--;
            }

            ListNode tempNext = temp.next;
            temp.next = first;
            tempNext.next = second;
            temp = tempNext;
        }

        return dummy.next;
    }
}

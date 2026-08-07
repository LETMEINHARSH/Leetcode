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
    public ListNode removeNodes(ListNode head) {
        ListNode rev = reverse(head);
        ListNode back = rev;
        ListNode front = rev.next;
        while(front != null){
            while(front != null && front.val < back.val){
                front = front.next;
            }
            back.next = front;
            back = front;
            if(front != null){
                front = front.next;
            }
        }
        return reverse(rev);
    }

    public ListNode reverse(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;

        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }
}
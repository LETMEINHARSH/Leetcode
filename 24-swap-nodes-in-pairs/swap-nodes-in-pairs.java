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
    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode temp = new ListNode(0,head);
        ListNode front = head.next;
        ListNode back = head;
        ListNode prev = temp;

        while(back != null && back.next != null){
            back.next = front.next;
            front.next = back;
            prev.next = front;
            prev = back;
            back = back.next;
            if(back != null){
                front = back.next;
            }
        }
        return temp.next;
    }
}
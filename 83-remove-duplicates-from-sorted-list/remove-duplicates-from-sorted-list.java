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
        if(head == null || head.next == null){
            return head;
        }
        ListNode front = head;
        ListNode back = head;
        while(front != null){
            while(front.val == back.val){
                if(front.val == back.val && front.next == null){
                    back.next = null;
                    return head;
                }
                front = front.next;
            }
            back.next = front;
            back = front;
        }
        return head;
    }
}
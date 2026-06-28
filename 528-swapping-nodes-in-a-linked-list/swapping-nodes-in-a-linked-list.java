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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode temp = head;
        int count = 0;
        while(temp != null){
            temp = temp.next;
            count++;
        }
        count -= k;
        temp = head;
        while(count > 0){
            temp = temp.next;
            count--;
        }
        int front = temp.val;
        ListNode temp1 = head;
        while(k>1){
            temp1 = temp1.next;
            k--;
        }
        temp.val = temp1.val;
        temp1.val = front;
        return head;
    }
}
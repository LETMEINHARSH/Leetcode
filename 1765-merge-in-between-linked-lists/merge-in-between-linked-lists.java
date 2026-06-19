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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode temp = list1;
        while(a>1){
            temp=temp.next;
            a--;
            b--;
        }
        ListNode tempb = temp.next;
        while(b>1){
            tempb = tempb.next;
            b--;
        }
        temp.next = list2;
        while(temp.next != null){
            temp=temp.next;
        }
        temp.next = tempb.next;
        return list1;
    }
}
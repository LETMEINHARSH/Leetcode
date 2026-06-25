/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        if(head==null || head.next==null){
            return false;
        }
        else{
            ListNode slow = head.next;
            ListNode fast = slow.next;
            while(fast != null && fast != slow){
                slow = slow.next;
                if(fast.next != null){
                    fast = fast.next.next;
                }
                else{
                    fast = null;
                }
            }
            if(fast == slow){
                return true;
            }
            else{
                return false;
            }
        }//else
    }//hasCycle
}//class
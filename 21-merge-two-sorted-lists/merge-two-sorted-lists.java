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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1 == null){
            return list2;
        }
        else if(list2 == null){
            return list1;
        }
        ListNode temp1 = list1;
        ListNode temp2 = list2;
        int min = 0;
        if(temp1.val < temp2.val){
            min = temp1.val;
            temp1 = temp1.next;
        }
        else{
            min = temp2.val;
            temp2 = temp2.next;
        }

        ListNode ans = new ListNode(min);
        ListNode tempans = ans;
        
        while(temp1 != null && temp2 != null){
            if(temp1.val < temp2.val){
                tempans.next = new ListNode(temp1.val);
                temp1 = temp1.next;
            }
            else{
                tempans.next = new ListNode(temp2.val);
                temp2 = temp2.next;
            }
            tempans = tempans.next;
        }

        if(temp1 == null){
            while(temp2 != null){
                tempans.next = new ListNode(temp2.val);
                temp2 = temp2.next;
                tempans = tempans.next;
            }
        }
        else{
            while(temp1 != null){
                tempans.next = new ListNode(temp1.val);
                temp1 = temp1.next;
                tempans = tempans.next;
            }
        }
        return ans;
    }
}
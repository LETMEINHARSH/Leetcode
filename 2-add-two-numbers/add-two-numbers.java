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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode temp1 = l1;
        ListNode temp2 = l2;
        int sum = temp1.val+temp2.val;
        int carry = (sum>9)?1:0;
        ListNode res = new ListNode(sum%10);
        ListNode tempres = res;
        temp1 = temp1.next;
        temp2 = temp2.next;
        while(temp1 != null && temp2 != null){
            sum = temp1.val + temp2.val + carry;
            tempres.next = new ListNode(sum%10);
            carry = (sum>9)?1:0;
            temp1 = temp1.next;
            temp2 = temp2.next;
            tempres = tempres.next;
        }
        if(temp1 == null && temp2 != null){
            while(temp2 != null){
                sum = temp2.val + carry;
                tempres.next = new ListNode(sum%10);
                carry = (sum>9)?1:0;
                temp2 = temp2.next;
                tempres = tempres.next;
            }
        }
        else if(temp1 != null && temp2 == null){
            while(temp1 != null){
                sum = temp1.val + carry;
                tempres.next = new ListNode(sum%10);
                carry = (sum>9)?1:0;
                temp1 = temp1.next;
                tempres = tempres.next;
            }
            
        }
        if(carry == 1){
            tempres.next = new ListNode(carry);
        }
        return res;
    }
}
//Time Complexity: O(n + m)
//Auxiliary Space: O(1)
//Output Space: O(max(n,m))



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
        
        l1 = reverse(l1);
        l2 = reverse(l2);
        ListNode temp1 = l1;
        ListNode temp2 = l2;
        int sum = temp1.val + temp2.val;
        ListNode res = new ListNode(sum % 10);
        int carry = sum / 10;
        ListNode restemp = res;
        temp1 = temp1.next;
        temp2 = temp2.next;
        
        while(temp1 != null && temp2 != null){
            sum = temp1.val + temp2.val;
            restemp.next = new ListNode((sum + carry)% 10);
            carry = (sum + carry)/10;
            temp1 = temp1.next;
            temp2 = temp2.next;
            restemp = restemp.next;
        }
        if(temp1 == null){
            while(temp2 != null){
                restemp.next = new ListNode((temp2.val + carry)% 10);
                carry = (temp2.val + carry)/10;
                temp2 = temp2.next;
                restemp = restemp.next;
            }
        }
        else if(temp2 == null){
            while(temp1 != null){
                restemp.next = new ListNode((temp1.val + carry)% 10);
                carry = (temp1.val + carry)/10;
                temp1 = temp1.next;
                restemp = restemp.next;
            }
        }
        if(carry == 1){
            restemp.next = new ListNode(1);
        }
        return reverse(res);

    }
    public ListNode reverse(ListNode head){
        if(head == null || head.next == null){
            return head;
        }
        else{
            ListNode prev = head;
            ListNode curr = head.next;
            ListNode temp = curr.next;
            while(curr != null){
                curr.next = prev;
                prev = curr;
                curr = temp;
                if(temp != null){
                    temp = temp.next;
                }
            }
            head.next = null;
            head = prev;
            return head;
        }
    }
}
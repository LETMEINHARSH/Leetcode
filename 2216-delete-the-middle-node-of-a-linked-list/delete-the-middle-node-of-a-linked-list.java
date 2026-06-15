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
    public ListNode deleteMiddle(ListNode head) {
        ListNode temp = head;
        int count = 0;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        if(count==1){
            head=null;
            return head;
        }
        else{
            count/=2;
            count+=1;
            temp=head;
            while(count>2){
                temp=temp.next;
                count--;
            }
            temp.next=temp.next.next;
        }
        return head;
    }
}
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int countA = 0;
        ListNode tempA = headA;
        while(tempA != null){
            tempA = tempA.next;
            countA++;
        }
        int countB = 0;
        ListNode tempB = headB;
        while(tempB != null){
            tempB = tempB.next;
            countB++;
        }
        tempA = headA;
        tempB = headB;

        if(countA > countB){
            countA -= countB;
            while(countA > 0){
                tempA = tempA.next;
                countA--;
            }
        }
        else if(countB > countA){
            countB -= countA;
            while(countB > 0){
                tempB = tempB.next;
                countB--;
            }
        }

        while(tempA != tempB){
            tempA = tempA.next;
            tempB = tempB.next;
        }
        if(tempA == null){
            return null;
        }
        else{
            return tempA;
        }
    }
}
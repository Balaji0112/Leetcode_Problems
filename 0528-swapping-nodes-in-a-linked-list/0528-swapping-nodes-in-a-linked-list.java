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
        ListNode curr = head;
        int length = 1;

        while(curr.next != null){
            length++;
            curr = curr.next;
        }

        ListNode firstSwapElement = head;
        for(int i = 1; i < k; i++){
            firstSwapElement = firstSwapElement.next;
        }

        ListNode secSwapElement = head;
        for(int i = 1; i < length - k + 1; i++){
            secSwapElement = secSwapElement.next;
        }

        int temp = firstSwapElement.val;
        firstSwapElement.val = secSwapElement.val;
        secSwapElement.val = temp;

        return head;
    }
}
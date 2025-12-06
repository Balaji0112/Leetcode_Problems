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
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode headNode = new ListNode(Integer.MIN_VALUE);

        ListNode returnNode = headNode;

        while(l1 != null && l2 != null){
            if(l1.val <= l2.val){
                headNode.next = l1;
                l1 = l1.next;
            }
            else{
                headNode.next = l2;
                l2 = l2.next;
            }

            headNode = headNode.next;
        }

        if(l1 == null) headNode.next = l2;
        if(l2 == null) headNode.next = l1;

        return returnNode.next;
    }
}
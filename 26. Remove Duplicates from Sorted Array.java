//Remove-duplicates-from-sorted-list by Alexander Ukhin
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
    public ListNode deleteDuplicates(ListNode head) {
        
        ListNode noDupeNode = head;
        ListNode copyNode = noDupeNode;
        
         while (noDupeNode != null) {
             if(noDupeNode.next != null && noDupeNode.val == noDupeNode.next.val){
                 ListNode temp = noDupeNode.next.next;
                 noDupeNode.next = null;
                 noDupeNode.next = temp;
             }
             else{
                noDupeNode = noDupeNode.next;
             }
        }
        return copyNode;
    }
}

/*
 * https://leetcode.com/problems/remove-linked-list-elements/
 */

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
    public ListNode removeElements(ListNode head, int val) {
        
        
        while(head!=null){
            if(head.val != val){
                break;
            }
            head = head.next;
        }
        if(head==null){
            return head;
        }
        ListNode newHead = head;
        ListNode prev = head;
        head = head.next;
        while(head!=null){
            if(head.val==val){
                prev.next = head.next;
            }else{
                prev = head;
            }
            head = head.next;
        }
        return newHead;
    }
}
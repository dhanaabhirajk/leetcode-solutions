/*
 * https://leetcode.com/problems/add-two-numbers/
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
    
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = null,l3=null;
        int sum = 0;
        boolean carry = false;
        boolean last = false;
        while(l1!=null && l2!=null){
            sum = l1.val+l2.val;
            
            if(carry){
                sum+=1;
                carry = false;
            }
            if(sum >= 10){
                sum = sum%10;
                carry = true;
                if(l1.next == null && l2.next == null){
                    last = true;
                }
            }
            ListNode node = new ListNode(sum);
            if(head==null){
                head = node;
                l3 =node;
            }
            else{
                l3.next = node;
                l3 = node;
            }          
            l1 = l1.next;
            l2 = l2.next;
            
        }
        ListNode l = null;
        if(l1!=null){
            l = l1;
        }
        if(l2!=null){
            l = l2;
        }
        while(l!=null){
            sum = l.val;
            if(carry){
                carry = false;
                sum+=1;
                
            }
            if(sum >= 10){
                sum = sum%10;
                carry = true;
                if(l.next == null){
                    last = true;
                }
            }
            ListNode node = new ListNode(sum);
            l3.next = node;
            l3 = node;
            l = l.next;
        }
        if(last){
            l3.next = new ListNode(1);
        }
        return head;
    }
    
}
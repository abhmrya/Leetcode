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
    public ListNode doubleIt(ListNode head) {

        Stack<Integer> stack = new Stack<>();
        ListNode temp = head;

        while(temp!=null){
            stack.push(temp.val);
            temp = temp.next;
        }

        ListNode newHead = null;
        int carry = 0;

        while(!stack.isEmpty() || carry > 0){
            int sum = carry;
            if(!stack.isEmpty()){
                sum += stack.pop()*2;
            }

            carry = sum /10;
            int digit = sum%10;

            ListNode newNode = new ListNode(digit);
            newNode.next = newHead;
            newHead = newNode;

        }
        return newHead;
        
    }
}
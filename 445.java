package com.company;

public class Main {

    /**
     * Definition for singly-linked list.
     * public class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode(int x) { val = x; }
     * }
     */
    class Solution {
        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            Stack<ListNode> stack1 = new Stack<>();
            Stack<ListNode> stack2 = new Stack<>();

            while (l1 != null) {
                stack1.push(l1);
                l1 = l1.next;
            }
            while (l2 != null) {
                stack2.push(l2);
                l2 = l2.next;
            }
            int carry = 0;
            ListNode prev = null, now = null;
            while (!stack1.isEmpty() || !stack2.isEmpty() || carry == 1) {
                int sum = 0;
                sum += (stack1.isEmpty()) ? 0 : stack1.pop().val;
                sum += (stack2.isEmpty()) ? 0 : stack2.pop().val;
                sum += carry;
                if (sum >= 10){
                    sum -= 10;
                    carry = 1;
                } else {
                    carry = 0;
                }
                now = new ListNode(sum);
                now.next = prev;
                prev = now;
            }
            return now;
        }
    }


    public static void main(String[] args) {
	// write your code here
    }
}

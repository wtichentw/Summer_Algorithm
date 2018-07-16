package com.company;

public class Main {
    /**
     * Definition for singly-linked list.
     * class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode(int x) {
     *         val = x;
     *         next = null;
     *     }
     * }
     */
    public class Solution {
        public ListNode detectCycle(ListNode head) {
            ListNode slow = head, fast = head;
            boolean isCycle = false;
            while (fast != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;
                if (slow == null || fast == null) {
                    return null;
                }

                if (fast == slow) {
                    isCycle = true;
                    break;
                }
            }
            if (!isCycle)   return null;

            while (head != slow) {
                slow = slow.next;
                head = head.next;
            }
            return head;
        }
    }


    public static void main(String[] args) {
	// write your code here
    }
}

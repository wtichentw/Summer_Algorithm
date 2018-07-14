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
        /*
        1->2->3->4->5->NULL, m = 2, n = 4
      preM m     n
        ans:
        1->4->3->2->5->NULL
        */
        public ListNode reverseBetween(ListNode head, int m, int n) {
            if (n - m <= 0) {
                return head;
            }
            ListNode dummy = new ListNode(0);
            dummy.next = head;
            ListNode preM = dummy;
            for (int i = 0; i < m - 1; i++) {
                preM = preM.next;
            }
            ListNode M = preM.next;
            ListNode start = preM.next;
            ListNode next = start.next;
            ListNode then = next.next;
            for (int i = 0; i < n - m; i++) {
                then = next.next;
                next.next = start;
                start = next;
                next = then;
            }
            preM.next = start;
            M.next = next;

            return dummy.next;
        }
    }

    public static void main(String[] args) {
	// write your code here
    }
}

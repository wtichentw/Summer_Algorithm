package com.company;

import java.util.Comparator;
import java.util.PriorityQueue;

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
        public ListNode mergeKLists(ListNode[] lists) {
            if (lists == null || lists.length == 0) {
                return null;
            }
            ListNode dummy = new ListNode(0);
            ListNode runner = dummy;
            PriorityQueue<ListNode> pq = new PriorityQueue<ListNode>(100, new Comparator<ListNode>() {
                public int compare(ListNode node1, ListNode node2) {
                    return node1.val - node2.val;
                }
            });

            for (ListNode node : lists) {
                if (node != null) {
                    pq.offer(node);
                }
            }

            while (!pq.isEmpty()) {
                ListNode node = pq.poll();
                runner.next = node;
                runner = runner.next;
                if (node.next != null) {
                    pq.offer(node.next);
                }
            }

            return dummy.next;
        }
    }

    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(100, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return 0;
            }
        });
    }
}

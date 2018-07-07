package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class Main {

    class Solution {
        public int leastInterval(char[] tasks, int n) {
            //at most 26 different tasks, we don't need to know how many times left in each tasks
            int[] taskFrequency = new int[26];

            for (char task : tasks) {
                taskFrequency[task - 'A']++;
            }

            //output from the task which has most times left
            PriorityQueue<Integer> pq = new PriorityQueue<Integer>(26, Collections.reverseOrder());
            for (int freq : taskFrequency) {
                if (freq > 0) {
                    pq.offer(freq);
                }
            }

            int ans = 0;
            while (!pq.isEmpty()) {
                List<Integer> list = new ArrayList<>();
                for (int i = 0; i <= n; i++) {
                    if (!pq.isEmpty()) {
                        int freq = pq.poll();
                        if (freq - 1 > 0) {
                            list.add(freq - 1);
                        }
                    }
                    ans++;
                    if (pq.isEmpty() && list.size() == 0) {
                        break;
                    }
                }
                for (int freq : list) {
                    pq.offer(freq);
                }
            }
            return ans;
        }
    }

    public static void main(String[] args) {
        int a = 'A';
        int b = 'B';
        System.out.println(a);
        System.out.println(b);
        PriorityQueue<Integer> pq = new PriorityQueue<>(26, Collections.reverseOrder());
    }
}

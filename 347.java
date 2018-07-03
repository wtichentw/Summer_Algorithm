package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    class Solution {
        public List<Integer> topKFrequent(int[] nums, int k) {
            Map<Integer, Integer> map = new HashMap<>();
            List<Integer> ans = new ArrayList<>();
            List<Integer>[] buckets = new List[nums.length + 1];

            for (Integer i : nums) {
                if (!map.containsKey(i)) {
                    map.put(i, 0);
                }
                map.put(i, map.get(i) + 1);
            }

            for (Integer key : map.keySet()) {
                int frequency = map.get(key);
                if (buckets[frequency] == null) {
                    buckets[frequency] = new ArrayList<Integer>();
                }
                buckets[frequency].add(key);
            }
            for (int i = nums.length; ans.size() < k; i--) {
                if (buckets[i] != null)
                    ans.addAll(buckets[i]);
            }

            return ans;
        }
    }
    
    public static void main(String[] args) {

        List<Integer>[] buckets = new List[100];
        List<Integer> list = new ArrayList<>();

    }
}

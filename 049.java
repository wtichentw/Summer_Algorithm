package com.company;

public class Main {
    class Solution {
        public List<List<String>> groupAnagrams(String[] strs) {
            List<List<String>> ans = new ArrayList<>();
            Map<String, List<String>> map = new HashMap<>();

            for (String s : strs) {
                char[] arr = s.toCharArray();
                Arrays.sort(arr);
                String temp = String.valueOf(arr);
                if (!map.containsKey(temp)) {
                    map.put(temp, new ArrayList<String>());
                }
                map.get(temp).add(s);
            }

            for (String key : map.keySet()) {
                ans.add(map.get(key));
            }
            return ans;
        }
    }

    public static void main(String[] args) {
	// write your code here
    }
}

package com.company;

public class Main {

    class Solution {
        public List<Integer> findAnagrams(String s, String p) {
            List<Integer> ans = new LinkedList<>();
            if (s == null || p == null || p.length() > s.length() || s.length() == 0 || p.length() == 0) {
                return ans;
            }

            int[] table = new int[128];
            for (Character c : p.toCharArray()) {
                table[c]++;
            }

            int left = 0, right = 0, len = 0;
            while (right < s.length()) {
                if (table[s.charAt(right)] > 0) {
                    len++;
                }
                table[s.charAt(right)]--;
                right++;
                if (right - left > p.length()) {
                    table[s.charAt(left)]++;
                    if (table[s.charAt(left)] > 0) {
                        len--;
                    }
                    left++;
                }
                if (len == p.length()) {
                    ans.add(left);
                }
            }
            return ans;
        }
    }

    public static void main(String[] args) {
	// write your code here
    }
}

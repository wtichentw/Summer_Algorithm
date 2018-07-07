package com.company;

public class Main {

    class Solution {
        public boolean isAnagram(String s, String t) {
            int[] map = new int[26];

            for (Character c : s.toCharArray()) {
                map[c - 'a']++;
            }

            for (Character c : t.toCharArray()) {
                map[c - 'a']--;
            }

            for (int i = 0; i < 26; i++) {
                if (map[i] != 0) {
                    return false;
                }
            }

            return true;
        }
    }



    public static void main(String[] args) {
	// write your code here
    }
}

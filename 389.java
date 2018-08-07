    class Solution {
        public char findTheDifference(String s, String t) {
            int[] table = new int[26];
            for (Character c : s.toCharArray()) {
                table[c - 'a']++;
            }
            for (Character c : t.toCharArray()) {
                table[c - 'a']--;
                if (table[c - 'a'] < 0) {
                    return c;
                }
            }
            return ' ';
        }
    }

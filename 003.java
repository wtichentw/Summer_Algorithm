/**
 * Created by Leon on 2018/7/7.
 */
public class main {
    class Solution {
        public int lengthOfLongestSubstring(String s) {
            if (s == null || s.length() == 0) {
                return 0;
            }
            int[] map = new int[128]; //128 ascii num
            int left = 0, right = 0, max = 0;
            int n = s.length();  //Java would not cache

            //"pwwkew"
            while (right < n) {
                //move right
                if (map[s.charAt(right)] <= 0) {
                    max = Math.max(max, right - left + 1);
                    map[s.charAt(right)]++;
                    right++;
                } else {
                    map[s.charAt(left)]--;
                    left++;
                }
            }
            return max;
        }
    }
}

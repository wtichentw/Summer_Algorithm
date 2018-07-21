package com.company;

public class Main {

    class Solution {
        public int minSubArrayLen(int s, int[] nums) {
            int fast = 0, slow = 0;
            int now = 0;
            int length = Integer.MAX_VALUE;
            while (fast < nums.length) {
                now += nums[fast];
                while (now >= s) {
                    length = Math.min(length, fast - slow + 1);
                    now -= nums[slow];
                    slow++;
                }
                fast++;
            }

            if (length == Integer.MAX_VALUE) {
                return 0;
            }else {
                return length;
            }
        }
    }

    public static void main(String[] args) {
	// write your code here
    }
}

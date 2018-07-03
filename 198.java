package com.company;

public class Main {

    class Solution {
        public int rob(int[] nums) {
            if (nums == null || nums.length == 0) {
                return 0;
            }
            int n = nums.length;
            if (n == 1) {
                return nums[0];
            }

            int hasPre = 0;
            int notHasPre = 0;
            boolean flip = false;
            for (int i = 0; i < n; i++) {
                if (flip) {
                    hasPre += nums[i];
                    hasPre = Math.max(hasPre, notHasPre);
                } else {
                    notHasPre += nums[i];
                    notHasPre = Math.max(hasPre, notHasPre);
                }
                flip = !flip;
            }

            return Math.max(hasPre, notHasPre);
        }
    }

    public static void main(String[] args) {
	// write your code here
    }
}

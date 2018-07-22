package com.company;

public class Main {

    class Solution {
        public int[] singleNumber(int[] nums) {
            int[] ans = {0, 0};
            int diff = nums[0];
            for (int i = 1; i < nums.length; i++) {
                diff ^= nums[i];
            }
            diff &= -diff;  //get distinct bit
            for (int i = 0; i < nums.length; i++) {
                if ((diff & nums[i]) == 0) {
                    ans[0] ^= nums[i];
                } else {
                    ans[1] ^= nums[i];
                }
            }
            return ans;
        }
    }

    public static void main(String[] args) {
	// write your code here
    }
}

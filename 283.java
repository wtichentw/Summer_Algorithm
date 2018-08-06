package com.company;

public class Main {

    class Solution {
        public void moveZeroes(int[] nums) {
            if (nums == null || nums.length <= 1) {
                return;
            }

            int index = 0;
            for (Integer num : nums) {
                if (num != 0) {
                    nums[index++] = num;
                }
            }

            while (index < nums.length) {
                nums[index++] = 0;
            }
        }
    }

    public static void main(String[] args) {
	// write your code here
    }
}

package com.company;

public class Main {
    class Solution {
        public int findTargetSumWays(int[] nums, int S) {
            int[][] memo = new int[nums.length][2001];
            for (int i = 0; i < nums.length; i++) {
                for (int j = 0; j < 2001; j++) {
                    memo[i][j] = Integer.MIN_VALUE;
                }
            }
            return helper(nums, S, 0, 0, memo);
        }

        private int helper(int[] nums, int S, int i, int sum, int[][] memo) {
            if (i == nums.length) {
                return (S == sum) ? 1 : 0;
            } else {
                int add = helper(nums, S, i + 1, sum + nums[i], memo);
                int sub = helper(nums, S, i + 1, sum - nums[i], memo);
                memo[i][sum + 1000] = add + sub;
                return memo[i][sum + 1000];
            }
        }
    }

    public static void main(String[] args) {
	// write your code here
        int a = 10;
        int b;
        b = a > 0 ? 5 : 3;
    }
}

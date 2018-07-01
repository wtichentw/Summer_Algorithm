package com.company;

public class Main {

    class Solution {
        public int numSquares(int n) {
            if (n == 0) return 0;
            if (n == 1) return 1;

            int[] dp = new int[n + 1];
            for (int i = 0; i <= n; i++) {
                dp[i] = Integer.MAX_VALUE;
            }
            dp[0] = 0;
            dp[1] = 1;

            for (int i = 2; i <= n; i++) {
                for (int j = 1; j * j <= i; j++) {
                    dp[i] = Math.min(dp[i], dp[i - (j * j)] + 1);
                }
            }


            return dp[n];
        }
    }

    public static void main(String[] args) {
	// write your code here 
    }
}

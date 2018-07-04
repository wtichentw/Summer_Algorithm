package com.company;

public class Main {
    class Solution {
        public int maxProfit(int[] prices) {
            if (prices == null || prices.length == 0)
                return 0;
            int minBuy = prices[0];
            int maxProfit = Integer.MIN_VALUE;
            for (int i = 1; i < prices.length; i++) {
                maxProfit = Math.max(maxProfit, prices[i] - minBuy);
                minBuy = Math.min(minBuy, prices[i]);
            }
            return maxProfit >=0 ? maxProfit : 0;
        }
    }

    public static void main(String[] args) {
	// write your code here
    }
}

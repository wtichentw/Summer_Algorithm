package com.company;

public class Main {
    class Solution {
        public int nthUglyNumber(int n) {
            int[] ugly = new int[n];
            int twoIndex = 1, threeIndex = 1, fiveIndex = 1;
            int twoPrime = 2;
            int threePrime = 3;
            int fivePrime = 5;
            ugly[0] = 1;

            for (int i = 1; i < n; i++) {
                int min = Math.min(twoPrime, Math.min(threePrime, fivePrime));
                ugly[i] = min;
                if (min == twoPrime) {
                    twoPrime = ugly[twoIndex] * 2;
                    twoIndex++;
                }
                if (min == threePrime) {
                    threePrime = ugly[threeIndex] * 3;
                    threeIndex++;
                }
                if (min == fivePrime) {
                    fivePrime = ugly[fiveIndex] * 5;
                    fiveIndex++;
                }
            }
            return ugly[n-1];
        }
    }

    public static void main(String[] args) {
	// write your code here
    }
}

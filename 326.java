package com.company;

public class Main {

    class Solution {
        public boolean isPowerOfThree(int n) {
            // // 1162261467 is 3^19,  3^20 is bigger than int
            // return (n > 0 &&  1162261467%n == 0);
            if (n < 1) {
                return false;
            }
            while (n % 3 == 0) {
                n = n / 3;
            }
            return n == 1;
        }
    }

    public static void main(String[] args) {
	// write your code here
    }
}

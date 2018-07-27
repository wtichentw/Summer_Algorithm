package com.company;

public class Main {

    class Solution {
        public int findNthDigit(int n) {
            int digit = 1;
            long count = 9;
            long startValue = 1;

            while (n > digit * count) {
                n -= digit * count;
                digit += 1;
                count *= 10;
                startValue *= 10;
            }
            long value = startValue + ((n-1) / digit);
            String s = String.valueOf(value);
            return s.charAt((n-1) % digit) - '0';
        }
    }

    public static void main(String[] args) {
	// write your code here
    }
}

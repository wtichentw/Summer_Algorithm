package com.company;

public class Main {
    class Solution {
        public int[] plusOne(int[] digits) {
            if (digits == null || digits.length == 0) {
                return digits;
            }
            for (int i = digits.length - 1; i >= 0; i--) {
                int digit = digits[i];
                digit += 1;
                if (digit == 10) {
                    digits[i] = 0;
                } else {
                    digits[i] = digit;
                    return digits;
                }
            }
            int[] ans = new int[digits.length + 1];
            for (int i = 0; i < digits.length; i++) {
                ans[i + 1] = digits[i];
            }
            ans[0] = 1;
            return ans;
        }
    }
    public static void main(String[] args) {
	// write your code here
    }
}

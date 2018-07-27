package com.company;

public class Main {

    class Solution {
        public boolean PredictTheWinner(int[] nums) {
            return first(0, 0, nums, 0, nums.length-1);
        }

        private boolean first(int s1, int s2, int[] nums, int start, int end) {
            if (start > end ){
                if (s1 >= s2) return true;
                else return false;
            }
            return !second(s1+nums[start], s2, nums, start+1, end) || !second(s1+nums[end], s2, nums, start, end-1);
        }

        private boolean second(int s1, int s2, int[] nums, int start, int end) {
            if (start > end ){
                if (s1 < s2) return true;
                else return false;
            }
            return !first(s1, s2+nums[start], nums, start+1, end) || !first(s1, s2+nums[end], nums, start, end-1);
        }
    }
    public static void main(String[] args) {
	// write your code here
    }
}

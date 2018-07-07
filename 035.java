package com.company;

public class Main {

    class Solution {
        public int searchInsert(int[] nums, int target) {
            int start = 0, end = nums.length - 1;

            while (start + 1 < end) {
                int mid = (start + end) / 2;
                if (nums[mid] == target) {
                    return mid;
                } else if (nums[mid] > target) {
                    end = mid;
                } else {
                    start = mid;
                }
            }

            //  target__start__target__end__target
            if (target <= nums[start]) {
                return start;
            } else if (target <= nums[end]) {
                return end;
            } else {
                return end + 1;
            }
        } 
    }
    
    public static void main(String[] args) {
	// write your code here
    }
}

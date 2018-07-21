package com.company;

public class Main {

    class Solution {
        public boolean find132pattern(int[] nums) {
            Stack<Integer> stack = new Stack<Integer>();
            // 9, 11, 8, 9, 10, 7, 9
            int second = Integer.MIN_VALUE;
            for (int i = nums.length - 1; i >= 0; i--) {
                if (nums[i] < second) {
                    return true;
                }
                System.out.println(stack.size());
                while (!stack.isEmpty() && nums[i] > stack.peek()) {
                    second = stack.pop();
                }
                stack.push(nums[i]);
            }
            return false;
        }
    }

    public static void main(String[] args) {
	// write your code here
    }
}

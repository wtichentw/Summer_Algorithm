package com.company;

public class Main {
    class Solution {
        public int threeSumClosest(int[] nums, int target) {
            if (nums == null || nums.length == 0) {
                return 0;
            }
            Arrays.sort(nums);

            int minDiff = Integer.MAX_VALUE;
            int ans = Integer.MAX_VALUE;
            for (int i = 0; i < nums.length - 1; i++) {
                int start = i + 1, end = nums.length - 1;
                int sum;
                while (start < end) {
                    sum = nums[i] + nums[start] + nums[end];
                    if (minDiff > Math.abs(target - sum)) {
                        minDiff = Math.abs(target - sum);
                        ans = sum;
                    }
                    if (sum > target) {
                        end--;
                    } else if (sum < target) {
                        start++;
                    } else {
                        return target;
                    }
                }
            }
            return ans;
        }
    }
    public static void main(String[] args) {
	// write your code here
    }
}

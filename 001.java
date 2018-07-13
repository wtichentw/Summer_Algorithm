package com.company;

public class Main {

    class Solution {
        public int[] twoSum(int[] nums, int target) {
            int[] ans = new int[2];
            Map<Integer, Integer> map = new HashMap<>();
            for (int i = 0; i < nums.length; i++) {
                if (map.containsKey(nums[i])) {
                    ans[0] = map.get(nums[i]);
                    ans[1] = i;
                    break;
                } else {
                    map.put(target - nums[i], i);
                }
            }
            return ans;
        }
    }

    public static void main(String[] args) {
	// write your code here
    }
}

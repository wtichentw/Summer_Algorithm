package com.company;

public class Main {

    class Solution {
        public List<List<Integer>> threeSum(int[] nums) {
            List<List<Integer>> ans = new ArrayList<>();
            Arrays.sort(nums);

            for (int i = 0; i < nums.length - 2; i++) {
                // remember
                if(i - 1 >= 0 && nums[i] == nums[i - 1]) {
                    continue;
                }
                int target = -nums[i];
                int start = i + 1, end = nums.length - 1;

                while (start < end) {
                    int sum = nums[start] + nums[end];
                    if (sum == target) {
                        List<Integer> list = new ArrayList<>();
                        list.add(nums[i]);
                        list.add(nums[start]);
                        list.add(nums[end]);
                        ans.add(list);
                        end--;
                        start++;
                        while (start < end && nums[start] == nums[start - 1]) start++;
                        while (start < end && nums[end] == nums[end + 1]) end--;
                    } else if (sum > target) {
                        end--;
                    } else {
                        start++;
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

package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    class Solution {
        public List<List<Integer>> permuteUnique(int[] nums) {
            List<List<Integer>> ans = new ArrayList<>();
            boolean[] used = new boolean[nums.length];
            Arrays.sort(nums);
            helper(nums, used, new ArrayList<Integer>(), ans);
            return ans;
        }

        private void helper(int[] nums, boolean[] used, List<Integer> list, List<List<Integer>> ans) {
            if (list.size() == nums.length) {
                ans.add(new ArrayList<>(list));
            }
            for (int i = 0; i < nums.length; i++) {
                if (used[i]) {
                    continue;
                }
                if ((i > 0 && nums[i] == nums[i - 1]) && !used[i - 1]) {
                    continue;
                }
                used[i] = true;
                list.add(nums[i]);
                helper(nums, used, list, ans);
                list.remove(list.size() - 1);
                used[i] = false;
            }
        }
    }

    public static void main(String[] args) {
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
    }
}

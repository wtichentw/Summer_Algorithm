package com.company;

public class Main {

    class Solution {
        public void nextPermutation(int[] nums) {
            if (nums == null || nums.length < 2) {
                return;
            }

            int flipPos = -1;
            for (int i = nums.length - 2; i >= 0; i--) {
                if (nums[i + 1] > nums[i]) {
                    flipPos = i;
                    break;
                }
            }

            if (flipPos == -1) {
                reverse(nums, 0, nums.length - 1);
                return;
            }

            for (int i = nums.length - 1; i > flipPos; i--) {
                if (nums[i] > nums[flipPos]) {
                    swap(nums, i, flipPos);
                    reverse(nums, flipPos + 1, nums.length - 1);
                    return;
                }
            }
        }

        private void reverse(int[] nums, int start, int end) {
            while (start < end) {
                swap(nums, start, end);
                start++;
                end--;
            }
        }

        private void swap(int[] nums, int i, int j) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
    }

    public static void main(String[] args) {
	// write your code here
    }
}

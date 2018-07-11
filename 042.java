package com.company;

public class Main {

    class Solution {
        public int trap(int[] height) {
            if (height == null || height.length == 0) {
                return 0;
            }

            int water = 0;
            int left = 0, right = height.length - 1;
            int leftMax = height[left], rightMax = height[right];

            while (left < right) {
                if (height[left] < height[right]) {
                    if (height[left] > leftMax) {
                        leftMax = height[left];
                    } else {
                        water += (leftMax - height[left]);
                    }
                    left++;
                } else {
                    if (height[right] > rightMax) {
                        rightMax = height[right];
                    } else {
                        water += (rightMax - height[right]);
                    }
                    right--;
                }
            }

            return water;
        }
    }

    public static void main(String[] args) {
	// write your code here
    }
}

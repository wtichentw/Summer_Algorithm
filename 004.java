package com.company;

public class Main {


    class Solution {
        public double findMedianSortedArrays(int[] nums1, int[] nums2) {
            int length = nums1.length + nums2.length;
            if (length % 2 == 0) {
                return (findKElement(nums1, nums2, 0, 0, (length / 2) + 1) + findKElement(nums1, nums2, 0, 0, (length / 2))) / 2.0;
            } else {
                return findKElement(nums1, nums2, 0, 0, (length / 2) + 1);
            }
        }

        private int findKElement(int[] nums1, int[] nums2, int index1, int index2, int k) {
            if (index1 >= nums1.length) {
                return nums2[index2 + k - 1];
            }
            if (index2 >= nums2.length) {
                return nums1[index1 + k - 1];
            }
            if (k == 1) {
                return Math.min(nums1[index1 + k - 1] , nums2[index2 + k - 1]);
            }

            int a, b;
            if (index1 + (k/2) - 1 >= nums1.length) {
                a = Integer.MAX_VALUE;
            } else {
                a = nums1[index1 + (k/2) - 1];
            }
            if (index2 + (k/2) - 1 >= nums2.length) {
                b = Integer.MAX_VALUE;
            } else {
                b = nums2[index2 + (k/2) - 1];
            }

            if (a > b) {
                return findKElement(nums1, nums2, index1, index2 + (k/2), k - k / 2);
            } else {
                return findKElement(nums1, nums2, index1 + (k/2), index2, k - k / 2);
            }

        }
    }
    public static void main(String[] args) {
	// write your code here
    }
}

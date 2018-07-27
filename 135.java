package com.company;

public class Main {
    class Solution {
        public int candy(int[] ratings) {
            int[] r2l = new int[ratings.length];
            int[] l2r = new int[ratings.length];
            Arrays.fill(r2l, 1);
            Arrays.fill(l2r, 1);

            for (int i = 1; i < ratings.length; i++) {
                if (ratings[i] > ratings[i - 1]) {
                    l2r[i] = l2r[i - 1] + 1;
                } else {
                    l2r[i] = 1;
                }
            }

            for (int i = ratings.length - 2; i >= 0; i--) {
                if (ratings[i] > ratings[i + 1]) {
                    r2l[i] = r2l[i + 1] + 1;
                } else {
                    r2l[i] = 1;
                }
            }

            int total = 0;
            for (int i = 0; i < ratings.length; i++) {
                total += Math.max(r2l[i], l2r[i]);
            }
            return total;
        }
    }


    public static void main(String[] args) {
	// write your code here
    }
}

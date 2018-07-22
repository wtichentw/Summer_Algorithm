package com.company;

public class Main {
    class Solution {
        public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
            int ans = 0;
            Map<Integer, Integer> map = new HashMap<>();
            for (int i = 0; i < A.length; i++) {
                for (int j = 0; j < B.length; j++) {
                    int sum = A[i] + B[j];
                    if (!map.containsKey(sum)) {
                        map.put(sum, 0);
                    }
                    map.put(sum, map.get(sum) + 1);
                }
            }

            for (int i = 0; i < C.length; i++) {
                for (int j = 0; j < D.length; j++) {
                    int sum = -(C[i] + D[j]);
                    if (map.containsKey(sum)) {
                        ans += map.get(sum);
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

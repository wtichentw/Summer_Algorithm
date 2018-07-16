package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    class Solution {
        public int[][] reconstructQueue(int[][] people) {
            if (people == null || people.length == 0 || people[0].length == 0) {
                return new int[0][0];
            }
            Arrays.sort(people, new Comparator<int[]>() {
                public int compare(int[] a, int[] b) {
                    if (a[0] == b[0]) {
                        return a[1] - b[1];
                    } else {
                        return b[0] - a[0];
                    }
                }
            });
            List<int[]> list = new ArrayList<int[]>();
            for (int[] person : people) {
                list.add(person[1], new int[]{person[0], person[1]});
            }
            int i = 0;
            int[][] ans = new int[people.length][2];
            for (int[] person: list) {
                ans[i][0] = person[0];
                ans[i][1] = person[1];
                i++;
            }

            return ans;
        }
    }
    public static void main(String[] args) {
//        Integer[] nums = {1,2,3,4,5};
//        Arrays.sort(nums, new Comparator<Integer>() {
//            @Override
//            public int compare(Integer a, Integer b) {
//                return b - a;
//            }
//        });
//
//        System.out.println(Arrays.toString(nums));

        List<Integer> list = new ArrayList<>();
        list.add(0,10);
        System.out.println(list);
    }
}

package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {
    class Solution {
        public List<String> readBinaryWatch(int num) {
            List<String> times = new ArrayList<>();
            for (int h=0; h<12; h++)
                for (int m=0; m<60; m++)
                    // * 64 because 2^6
                    if (Integer.bitCount(h * 64 + m) == num) {
                        times.add(String.format("%d:%02d", h, m));
                    }
            return times;
        }
    }

    public static void main(String[] args) {
	// write your code here


    }
}

package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    class Solution {
        public String reverseVowels(String s) {
            if (s == null || s.length() == 0) {
                return s;
            }
            int start = 0, end = s.length() - 1;
            char[] arr = s.toCharArray();
            Set<Character> set = new HashSet<>();
            set.add('a');
            set.add('e');
            set.add('i');
            set.add('o');
            set.add('u');
            while (start < end) {
                while (start < end) {
                    if (set.contains(Character.toLowerCase(arr[start]))) {
                        break;
                    }
                    start++;
                }
                while (start < end) {
                    if (set.contains(Character.toLowerCase(arr[end]))) {
                        break;
                    }
                    end--;
                }
                char temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
            return String.valueOf(arr);
        }
    }
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

    }
}

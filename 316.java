package com.company;

import java.util.Stack;

public class Main {

    class Solution {
        public String removeDuplicateLetters(String s) {
            int[] table = new int[26];
            Stack<Character> stack = new Stack<Character>();
            boolean[] inStack = new boolean[26];

            for (Character c : s.toCharArray()) {
                table[c - 'a']++;
            }

            for (Character c : s.toCharArray()) {
                table[c - 'a']--;
                //already in stack
                if (inStack[c - 'a']) {
                    continue;
                }
                // stack.peek() > c    ==> can have smaller lex order
                // table[c - 'a'] > 0  ==> make sure this character would appear later
                while (!stack.isEmpty() && stack.peek() > c && table[stack.peek() - 'a'] > 0) {
                    inStack[stack.pop() - 'a'] = false;
                }
                stack.push(c);
                inStack[c - 'a'] = true;
            }

            StringBuilder sb = new StringBuilder();
            for (Character c : stack) {
                sb.append(c);
            }
            return sb.toString();
        }
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < 5; i++) {
            stack.push(i);
        }

        System.out.println(stack.firstElement());
        for (Integer i : stack) {
            System.out.println(i);
        }
    }
}

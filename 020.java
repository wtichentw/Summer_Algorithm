package com.company;
import java.util.Stack;

public class Main {
    class Solution {
        public boolean isValid(String s) {
            if (s == null) {
                return false;
            } else if (s.length() == 0) {
                return true;
            }

            Stack<Character> stack = new Stack<Character>();
            for (Character c : s.toCharArray()) {
                if (c == '(' || c == '[' || c == '{') {
                    stack.push(c);
                } else {
                    if (stack.isEmpty()) {
                        return false;
                    } else {
                        char top = stack.peek();
                        if (top == '{' && c == '}') stack.pop();
                        else if (top == '[' && c == ']') stack.pop();
                        else if (top == '(' && c == ')') stack.pop();
                        else return false;
                    }
                }
            }
            return stack.isEmpty();
        }
    }

    public static void main(String[] args) {
	// write your code here
    }
}

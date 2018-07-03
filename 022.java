package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    class Solution {
        public List<String> generateParenthesis(int n) {
            List<String> ans = new ArrayList<String>();
            helper(ans, 0, 0, n, "");
            return ans;
        }

        private void helper(List<String> ans, int open, int close, int n, String s) {
            if (open > n || close > n || close > open) {
                return;
            }
            if (open == n && open == close) {
                ans.add(new String(s));
            }
            helper(ans, open + 1, close, n, s + '(');
            helper(ans, open, close + 1, n, s + ')');
        }
    }

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();

    }
}

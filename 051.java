package com.company;

public class Main {

    class Solution {
        public List<List<String>> solveNQueens(int n) {
            List<List<String>> ans = new ArrayList<>();
            char[][] table = new char[n][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    table[i][j] = '.';
                }
            }
            helper(table, ans, 0);
            return ans;
        }

        private void helper(char[][] table, List<List<String>> ans, int col) {
            if (col == table.length) {
                ans.add(convert(table));
                return;
            }

            for (int row = 0; row < table.length; row++) {
                if (check(table, row, col)) {
                    table[row][col] = 'Q';
                    helper(table, ans, col + 1);
                    table[row][col] = '.';
                }
            }
        }
        //(0,3)   (1,2)
        private boolean check(char[][] table, int row, int col) {
            for (int i = 0; i < table.length; i++) {
                for (int j = 0; j < table[0].length; j++) {
                    if (table[i][j] == 'Q' && (i == row || row - i == col - j || row + col == i + j)) {
                        return false;
                    }
                }
            }
            return true;
        }

        private List<String> convert(char[][] table) {
            List<String> ret = new ArrayList<>(table.length);
            for (int i = 0; i < table.length; i++) {
                StringBuilder sb = new StringBuilder();
                for (int j = 0; j < table[0].length; j++) {
                    sb.append(table[i][j]);
                }
                ret.add(sb.toString());
            }
            return ret;
        }
    }

    public static void main(String[] args) {
	// write your code here
    }
}

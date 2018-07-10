package com.company;

public class Main {
    class Solution {
        public boolean exist(char[][] board, String word) {
            if (board == null || word == null || word.length() == 0){
                return false;
            }
            boolean[][] visited = new boolean[board.length][board[0].length];
            for (int i = 0; i < board.length; i++) {
                for (int j = 0; j < board[0].length; j++) {
                    if (board[i][j] == word.charAt(0) && helper(board, visited, word, 0, i, j)) {
                        System.out.println(i);
                        System.out.println(j);
                        return true;
                    }
                }
            }
            return false;
        }

        private boolean helper(char[][] board, boolean[][] visited, String word, int index, int i, int j) {
            if (index == word.length()) {
                return true;
            }
            if (i < 0 || i >= board.length || j < 0 || j >= board[0].length || board[i][j] != word.charAt(index) || visited[i][j]) {
                return false;
            }
            boolean exist = false;
            visited[i][j] = true;
            exist = helper(board, visited, word, index + 1, i + 1, j) || helper(board, visited, word, index + 1, i - 1, j) ||
                    helper(board, visited, word, index + 1, i, j + 1) || helper(board, visited, word, index + 1, i, j - 1);
            visited[i][j] = false;
            return exist;
        }

    }

    public static void main(String[] args) {
	// write your code here
    }
}

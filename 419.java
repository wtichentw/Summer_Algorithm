package com.company;

public class Main {
    class Solution {
        public int countBattleships(char[][] board) {
            if(board == null || board.length == 0 || board[0].length == 0) {
                return 0;
            }

            int ans = 0, rows = board.length, cols = board[0].length;
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    if (board[i][j] == '.') continue;
                    if (i > 0 && board[i-1][j] == 'X') continue;
                    if (j > 0 && board[i][j-1] == 'X') continue;
                    ans++;
                }
            }

            return ans;
        }
    }

    public static void main(String[] args) {

    }
}

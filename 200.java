package com.company;

public class Main {
    class Solution {
        public int numIslands(char[][] grid) {
            int count = 0;
            for (int i = 0; i < grid.length; i++) {
                for (int j = 0; j < grid[i].length; j++) {
                    if (grid[i][j] == '1') {
                        count++;
                        merge(grid, i, j);
                    }
                }
            }
            return count;
        }

        private void merge(char[][] grid, int i, int j) {
            if (i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || grid[i][j] == '0') {
                return;
            }
            grid[i][j] = '0';
            merge(grid, i + 1, j);
            merge(grid, i - 1, j);
            merge(grid, i, j + 1);
            merge(grid, i, j - 1);
        }
    }

    public static void main(String[] args) {

    }
}

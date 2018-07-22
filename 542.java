package com.company;

public class Main {
    class Solution {
        class Point {
            int row;
            int col;
            public Point(int row, int col) {
                this.row = row;
                this.col = col;
            }
        }

        public int[][] updateMatrix(int[][] matrix) {
            Queue<Point> q = new LinkedList<>();
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[0].length; j++) {
                    if (matrix[i][j] == 0) {
                        q.offer(new Point(i, j));
                    } else {
                        matrix[i][j] = Integer.MAX_VALUE;
                    }
                }
            }
            int[][] dirs = {{1,0}, {-1,0}, {0,-1}, {0,1}};
            while (!q.isEmpty()) {
                Point p = q.poll();
                for (int[] dir : dirs) {
                    int nextRow = p.row + dir[0];
                    int nextCol = p.col + dir[1];
                    if (nextRow < 0 || nextRow >= matrix.length || nextCol < 0 || nextCol >= matrix[0].length ||
                            matrix[nextRow][nextCol] < matrix[p.row][p.col] + 1) {
                        continue;
                    }
                    q.offer(new Point(nextRow, nextCol));
                    matrix[nextRow][nextCol] = matrix[p.row][p.col] + 1;
                }
            }
            return matrix;
        }
    }
    public static void main(String[] args) {
	// write your code here
    }
}

package com.company;

public class Main {

    class Solution {
        public List<Integer> spiralOrder(int[][] matrix) {
            List<Integer> ans = new ArrayList<Integer>();

            if (matrix.length == 0) {
                return ans;
            }
            int rowStart = 0, rowEnd = matrix.length - 1;
            int colStart = 0, colEnd = matrix[0].length - 1;

            while (rowStart <= rowEnd && colStart <= colEnd) {
                for (int col = colStart; col <= colEnd; col++) {
                    ans.add(matrix[rowStart][col]);
                }
                rowStart++;
                for (int row = rowStart; row <= rowEnd; row++) {
                    ans.add(matrix[row][colEnd]);
                }
                colEnd--;
                if (rowStart <= rowEnd) {
                    for (int col = colEnd; col >= colStart; col--) {
                        ans.add(matrix[rowEnd][col]);;
                    }
                    rowEnd--;
                }
                if (colStart <= colEnd) {
                    for (int row = rowEnd; row >= rowStart; row--) {
                        ans.add(matrix[row][colStart]);
                    }
                    colStart++;
                }
            }

            return ans;
        }
    }

    public static void main(String[] args) {
	// write your code here
    }
}

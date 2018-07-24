package com.company;

public class Main {

    class Solution {
        public int calculateMinimumHP(int[][] dungeon) {
            int[][] hp = new int[dungeon.length + 1][dungeon[0].length + 1];
            for (int row = 0; row < dungeon.length; row++) {
                hp[row][dungeon[0].length] = Integer.MAX_VALUE;
            }
            for (int col = 0; col < dungeon[0].length; col++) {
                hp[dungeon.length][col] = Integer.MAX_VALUE;
            }
            hp[dungeon.length][dungeon[0].length - 1] = 0;
            hp[dungeon.length - 1][dungeon[0].length] = 0;
            for (int row = dungeon.length - 1; row >= 0; row--) {
                for (int col = dungeon[0].length - 1; col >=0; col--) {
                    hp[row][col] = Math.max(Math.min(hp[row + 1][col], hp[row][col + 1]) - dungeon[row][col], 0);
                }
            }
            return hp[0][0] + 1;
        }
    }

    public static void main(String[] args) {
	// write your code here
    }
}

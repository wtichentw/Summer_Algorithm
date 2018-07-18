package com.company;

public class Main {


    class Solution {
        public int canCompleteCircuit(int[] gas, int[] cost) {
            if (gas == null || cost == null || gas.length == 0 || cost.length == 0 || gas.length != cost.length) {
                return -1;
            }
            int sum = 0, tank = 0, start = 0;
            for (int i = 0; i < gas.length; i++) {
                sum += (gas[i] - cost[i]);
                tank += (gas[i] - cost[i]);
                if (tank < 0) {
                    start = i + 1;
                    tank = 0;
                }
            }
            return (sum < 0) ? -1 : start;
        }
    }

    public static void main(String[] args) {
	// write your code here
    }
}

package com.company;

import java.util.HashSet;
import java.util.Set;

public class Main {

    class Solution {
        public List<Integer> findMinHeightTrees(int n, int[][] edges) {
            List<Set<Integer>> neighbors = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                neighbors.add(new HashSet<Integer>());
            }
            for (int[] edge : edges) {
                neighbors.get(edge[0]).add(edge[1]);
                neighbors.get(edge[1]).add(edge[0]);
            }

            List<Integer> leaves = new ArrayList<>();
            if (n == 1) {
                leaves.add(0);
                return leaves;
            }
            for (int i = 0; i < neighbors.size(); i++) {
                if (neighbors.get(i).size() == 1) {
                    leaves.add(i);
                }
            }

            while (n > 2) {
                int size = leaves.size();
                n -= size;
                List<Integer> tempLeaves = new ArrayList<Integer>();
                for (Integer node : leaves) {
                    int neighborNode = neighbors.get(node).iterator().next();
                    neighbors.get(neighborNode).remove(node);
                    if (neighbors.get(neighborNode).size() == 1) {
                        tempLeaves.add(neighborNode);
                    }
                }
                leaves = tempLeaves;
            }
            return leaves;
        }
    }
    public static void main(String[] args) {
	    Set<Integer> set = new HashSet<>();
	    set.iterator().next();
    }
}

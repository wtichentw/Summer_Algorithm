package com.company;

public class Main {

    class Solution {
        public int[] findRedundantConnection(int[][] edges) {
            int[] parent = new int[2001];
            // set node's parent to itself.
            for (int i = 0; i < parent.length; i++) {
                parent[i] = i;
            }

            for (int[] edge: edges){
                int from = edge[0], to = edge[1];
                // if the two ends of an edge has same root, return
                if (findRoot(parent, from) == findRoot(parent, to)) {
                    return edge;
                } else { //else connect the small half to the large half.
                    parent[findRoot(parent, from)] = findRoot(parent, to);
                }
            }

            return new int[2];
        }

        private int findRoot(int[] parent, int from) {
            if (from != parent[from]) {
                parent[from] = findRoot(parent, parent[from]);
            }
            return parent[from];
        }
    }

    public static void main(String[] args) {
	// write your code here
    }
}

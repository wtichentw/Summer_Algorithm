package com.company;

public class Main {

    class Solution {
        public int[] findOrder(int numCourses, int[][] prerequisites) {
            int[] ans = new int[numCourses];
            // key:course  value: prerequisites
            Map<Integer, Set<Integer>> map = new HashMap<>();
            init(map, numCourses, prerequisites);

            Queue<Integer> q = new LinkedList<>();
            Set<Integer> visited = new HashSet<>();
            for (Integer key : map.keySet()) {
                if (map.get(key).size() == 0) {
                    q.offer(key);
                    visited.add(key);
                }
            }
            int index = 0;
            while (!q.isEmpty()) {
                int size = q.size();
                for (int i = 0; i < size; i++) {
                    int done = q.poll();
                    for (Integer key : map.keySet()) {
                        if (map.get(key).contains(done)) {
                            map.get(key).remove(done);
                        }
                        if (map.get(key).size() == 0 && !visited.contains(key)) {
                            q.offer(key);
                            visited.add(key);
                        }
                    }
                    ans[index] = done;
                    index++;
                }
            }
            return (numCourses == index) ? ans : new int[0];
        }

        private void init(Map<Integer, Set<Integer>> map, int numCourses, int[][] prerequisites) {
            //init map
            for (int i = 0; i < numCourses; i++) {
                map.put(i, new HashSet<Integer>());
            }
            for (int[] pair : prerequisites) {
                map.get(pair[0]).add(pair[1]);
            }
        }
    }

    public static void main(String[] args) {
	// write your code here
    }
}

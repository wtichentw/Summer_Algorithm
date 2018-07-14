package com.company;

public class Main {

    /**
     * Definition for an interval.
     * public class Interval {
     *     int start;
     *     int end;
     *     Interval() { start = 0; end = 0; }
     *     Interval(int s, int e) { start = s; end = e; }
     * }
     */
    class Solution {
        public List<Interval> merge(List<Interval> intervals) {
            List<Interval> ans = new ArrayList<>();
            if (intervals == null || intervals.size() == 0) {
                return ans;
            }

            Collections.sort(intervals, new Comparator<Interval>(){
                public int compare(Interval i1, Interval i2) {
                    return i1.start - i2.start;
                }
            });

            int start = intervals.get(0).start;
            int end = intervals.get(0).end;
            for (int i = 1; i < intervals.size(); i++) {
                if (intervals.get(i).start > end) {
                    ans.add(new Interval(start, end));
                    start = intervals.get(i).start;
                    end = intervals.get(i).end;
                } else {
                    end = Math.max(end, intervals.get(i).end);
                }
            }
            ans.add(new Interval(start, end));

            return ans;
        }
    }

    public static void main(String[] args) {
	// write your code here
    }
}

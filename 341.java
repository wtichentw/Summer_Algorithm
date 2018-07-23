package com.company;

public class Main {

    /**
     * // This is the interface that allows for creating nested lists.
     * // You should not implement it, or speculate about its implementation
     * public interface NestedInteger {
     *
     *     // @return true if this NestedInteger holds a single integer, rather than a nested list.
     *     public boolean isInteger();
     *
     *     // @return the single integer that this NestedInteger holds, if it holds a single integer
     *     // Return null if this NestedInteger holds a nested list
     *     public Integer getInteger();
     *
     *     // @return the nested list that this NestedInteger holds, if it holds a nested list
     *     // Return null if this NestedInteger holds a single integer
     *     public List<NestedInteger> getList();
     * }
     */
    public class NestedIterator implements Iterator<Integer> {

        Iterator<Integer> iterator;
        public NestedIterator(List<NestedInteger> nestedList) {
            List<Integer> list = new ArrayList<>();
            if (nestedList != null) {
                flatten(list, nestedList);
            }
            this.iterator = list.iterator();
        }

        private void flatten(List<Integer> list, List<NestedInteger> nestedList) {
            for (int i = 0; i < nestedList.size(); i++) {
                if (nestedList.get(i).isInteger()) {
                    list.add(nestedList.get(i).getInteger());
                } else {
                    flatten(list, nestedList.get(i).getList());
                }
            }
        }

        @Override
        public Integer next() {
            return this.iterator.next();
        }

        @Override
        public boolean hasNext() {
            return this.iterator.hasNext();
        }
    }

    /**
     * Your NestedIterator object will be instantiated and called as such:
     * NestedIterator i = new NestedIterator(nestedList);
     * while (i.hasNext()) v[f()] = i.next();
     */

    public static void main(String[] args) {
	// write your code here
    }
}

package com.company;

import java.util.Iterator;

public class Main {

    // Java Iterator interface reference:
// https://docs.oracle.com/javase/8/docs/api/java/util/Iterator.html
    class PeekingIterator implements Iterator<Integer> {

        Iterator<Integer> iterator;
        Integer value;
        public PeekingIterator(Iterator<Integer> iterator) {
            this.iterator = iterator;
            if (this.iterator.hasNext()) {
                this.value = this.iterator.next();
            }
        }

        // Returns the next element in the iteration without advancing the iterator.
        public Integer peek() {
            return value;
        }

        // hasNext() and next() should behave the same as in the Iterator interface.
        // Override them if needed.
        @Override
        public Integer next() {
            Integer ret = value;
            if (iterator.hasNext()){
                value = iterator.next();
            } else {
                value = null;
            }
            return ret;
        }

        @Override
        public boolean hasNext() {
            return value != null;
        }
    }

    public static void main(String[] args) {
        Iterator<Integer> iterator = new Iterator<Integer>() {
            @Override
            public boolean hasNext() {
                return false;
            }

            @Override
            public Integer next() {
                return null;
            }

            @Override
            public void remove() {

            }
        };

    }
}

package com.company;

public class Main {

    class MyQueue {
        Stack<Integer> in;
        Stack<Integer> out;

        /** Initialize your data structure here. */
        public MyQueue() {
            in = new Stack<Integer>();
            out = new Stack<Integer>();
        }

        /** Push element x to the back of queue. */
        public void push(int x) {
            in.push(x);
        }

        /** Removes the element from in front of queue and returns that element. */
        public int pop() {
            if (out.isEmpty()) {
                convert();
            }
            return out.pop();
        }

        /** Get the front element. */
        public int peek() {
            if (out.isEmpty()) {
                convert();
            }
            return out.peek();
        }

        /** Returns whether the queue is empty. */
        public boolean empty() {
            return in.isEmpty() && out.isEmpty();
        }

        private void convert() {
            while (!in.isEmpty()) {
                out.push(in.pop());
            }
        }
    }

    /**
     * Your MyQueue object will be instantiated and called as such:
     * MyQueue obj = new MyQueue();
     * obj.push(x);
     * int param_2 = obj.pop();
     * int param_3 = obj.peek();
     * boolean param_4 = obj.empty();
     */

    public static void main(String[] args) {
	// write your code here
    }
}

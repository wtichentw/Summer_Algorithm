package com.company;

public class Main {

    class MinStack {

        class Element{
            int min;
            int val;
            public Element(int min, int val) {
                this.min = min;
                this.val = val;
            }
        }

        Stack<Element> stack;
        /** initialize your data structure here. */
        public MinStack() {
            this.stack = new Stack<>();
        }

        public void push(int x) {
            if (stack.isEmpty()) {
                stack.push(new Element(x, x));
            } else {
                if (stack.peek().min > x) {
                    stack.push(new Element(x, x));
                } else {
                    stack.push(new Element(stack.peek().min, x));
                }
            }
        }

        public void pop() {
            stack.pop();
        }

        public int top() {
            return stack.peek().val;
        }

        public int getMin() {
            return stack.peek().min;
        }
    }

    /**
     * Your MinStack object will be instantiated and called as such:
     * MinStack obj = new MinStack();
     * obj.push(x);
     * obj.pop();
     * int param_3 = obj.top();
     * int param_4 = obj.getMin();
     */

    public static void main(String[] args) {
	// write your code here
    }
}

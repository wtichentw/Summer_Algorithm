class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for (String s : tokens) {
            //number
            if (Character.isDigit(s.charAt(0)) || (s.length() > 1 && Character.isDigit(s.charAt(1)))) {
                stack.push(Integer.parseInt(s));
            } else {
                char c = s.charAt(0);
                int b = stack.pop();
                int a = stack.pop();
                if (c == '+') {
                    stack.push(a + b);
                } else if (c == '-') {
                    stack.push(a - b);
                } else if (c == '*') {
                    stack.push(a * b);
                } else if (c == '/') {
                    stack.push(a / b);
                }
            }
        }
        
        return stack.peek();
    }
}

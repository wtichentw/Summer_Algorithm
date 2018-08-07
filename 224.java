class Solution {
    public int calculate(String s) {
        // boundary check
        if (s == null || s.length() == 0) {
            return 0;
        }
        
        //init var
        int num = 0;
        int ans = 0;
        int sign = 1;
        Stack<Integer> stack = new Stack<Integer>();
        
        for (Character c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                num = num * 10 + (c - '0');
            } else if (c == ' ') {
                continue;
            } else if (c == '+') {  // add up previous number before reset the sign
                ans += (sign * num);
                num = 0;
                sign = 1;
            } else if (c == '-') {  // add up previous number before reset the sign
                ans += (sign * num);
                num = 0;
                sign = -1;
            } else if (c == '(') {
                stack.push(ans);
                stack.push(sign);
                sign = 1;
                ans = 0;
                num = 0;
            } else if (c == ')') {
                //remember to finish the computation
                ans += num * sign;
                
                //pop from stack
                int preSign = stack.pop();
                int preAns = stack.pop();
                ans = preAns + (preSign * ans);
                num = 0;
                sign = 1;
            }
        }
        if (num != 0) {
            //remember to multiply sign
            ans += (num * sign); 
        }
        
        return ans;
    }
}

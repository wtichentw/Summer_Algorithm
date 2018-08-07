class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();
        for (Integer asteroid : asteroids) {
            if (asteroid > 0 || stack.isEmpty() || stack.peek() < 0) {
                stack.push(asteroid);
            } else {
                // '<' because we will process equal in the next step
                while (!stack.isEmpty() && stack.peek() > 0 && stack.peek() < -asteroid) {
                    stack.pop();
                }
                // process equal
                if (!stack.isEmpty() && stack.peek() == -asteroid) {
                    stack.pop();
                } else if (stack.isEmpty() || stack.peek() < 0) {
                    stack.push(asteroid);
                }
            }
        }
        
        int[] ans = new int[stack.size()];
        int index = 0;
        for (Integer num : stack) {
            ans[index++] = num;
        }
        return ans;
    }
}

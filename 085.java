class Solution {
    public int maximalRectangle(char[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return 0;
        }
        int rows = matrix.length, cols = matrix[0].length;
        int[] heights = new int[cols];
        int area = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] == '1') {
                    heights[j]++;
                } else {
                    heights[j] = 0;
                }
            }
            area = Math.max(area, largestRectangleArea(heights));
        }
        return area;
    }
    
    public int largestRectangleArea(int[] heights) {
        if (heights == null || heights.length == 0) {
            return 0;
        }
        //store the height index
        Stack<Integer> stack = new Stack<Integer>();
        int area = 0;
        
        for (int i = 0; i <= heights.length; i++) {
            int rightHeight = (i >= heights.length) ? 0 : heights[i];
            while (!stack.isEmpty() && heights[stack.peek()] > rightHeight) { 
                int height = heights[stack.pop()];
                int left = (stack.isEmpty()) ? -1 : stack.peek();
                area = Math.max(area, height * (i - left - 1));
            }
            stack.push(i);
        }
        
        return area;
    }
}

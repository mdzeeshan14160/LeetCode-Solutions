class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> st = new Stack<>();
        int maxArea = 0;
        for (int i = 0; i <= heights.length; i++) {
            int currHeight = 0;
            if (i == heights.length)
                currHeight = 0;
            else
                currHeight = heights[i];
            while (!st.isEmpty() && heights[st.peek()] > currHeight) {
                int h = heights[st.pop()];
                int w;
                if (st.empty())
                    w = i;
                else
                    w = i - st.peek() - 1;
                int area = h * w;
                maxArea = Math.max(maxArea, area);
            }
            st.push(i);
        }
        return maxArea;
    }
}
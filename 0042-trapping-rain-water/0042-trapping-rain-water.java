class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int maxIndex = 0;
        for (int i = 1; i < n; i++) {
            if (height[i] > height[maxIndex]) {
                maxIndex = i;
            }
        }
        int ans = 0;
        int leftMax = height[0];
        for (int i = 1; i < maxIndex; i++) {
            if (height[i] > leftMax) {
                leftMax = height[i];
            } else {
                ans += leftMax - height[i];
            }
        }
        int rightMax = height[n - 1];
        for (int i = n - 2; i > maxIndex; i--) {
            if (height[i] > rightMax) {
                rightMax = height[i];
            } else {
                ans += rightMax - height[i];
            }
        }
        return ans;
    }
}
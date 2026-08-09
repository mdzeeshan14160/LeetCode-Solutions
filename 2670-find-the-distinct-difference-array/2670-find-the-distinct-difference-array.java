class Solution {
    public int[] distinctDifferenceArray(int[] nums) {
        int n = nums.length;
        int[] diff = new int[n];
        for (int i = 0; i < n; i++) {
            int prefix = countDistinct(nums, 0, i);
            int suffix = countDistinct(nums, i + 1, n - 1);
            diff[i] = prefix - suffix;
        }
        return diff;
    }

    public int countDistinct(int[] nums, int start, int end) {
        boolean[] vis = new boolean[100000];
        int count = 0;
        for (int i = start; i <= end; i++) {
            if (!vis[nums[i]]) {
                vis[nums[i]] = true;
                count++;
            }
        }
        return count;
    }
}
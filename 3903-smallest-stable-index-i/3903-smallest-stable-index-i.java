class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n = nums.length - 1;
        if (n == 0) {
            return 0;
        }
        int[] suffix = new int[n + 1];
        suffix[n] = nums[n];
        for (int i = n - 1; i >= 0; i--) {
            suffix[i] = Math.min(suffix[i + 1], nums[i]);
        }
        int prefix = nums[0];
        for (int i = 0; i <= n; i++) {
            prefix = Math.max(prefix, nums[i]);
            if (prefix - suffix[i] <= k) {
                return i;
            }
        }
        return -1;
    }
}
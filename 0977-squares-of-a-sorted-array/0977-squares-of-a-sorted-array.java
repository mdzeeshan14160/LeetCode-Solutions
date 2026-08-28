class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] res = new int[nums.length];
        int low = 0, high = nums.length - 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            int left = nums[low] * nums[low];
            int right = nums[high] * nums[high];
            if (left > right) {
                res[i] = left;
                low++;
            } else {
                res[i] = right;
                high--;
            }
        }
        return res;
    }
}
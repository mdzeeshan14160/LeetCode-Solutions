class Solution {
    public void nextPermutation(int[] nums) {
        int i = nums.length - 2;
        // Find pivot
        while (i >= 0 && nums[i] >= nums[i + 1]) {
            i--;
        }
        if (i >= 0) {
            // Find element just greater than pivot
            int j = nums.length - 1;

            while (nums[j] <= nums[i]) {
                j--;
            }
            // Swap
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
        // Reverse the right side
        int low = i + 1;
        int high = nums.length - 1;
        while (low < high) {
            int temp = nums[low];
            nums[low] = nums[high];
            nums[high] = temp;

            low++;
            high--;
        }
    }
}

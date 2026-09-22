class Solution {
    public int findDuplicate(int[] nums) {
        Arrays.sort(nums);
        int low = 0, high = 1;
        while (high < nums.length) {
            if (nums[low] == nums[high]) {
                return nums[low];
            }
            low++;
            high++;
        }
        return 0;
    }
}
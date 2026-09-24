class Solution {
    public int removeDuplicates(int[] nums) {
        int low = 0, high = 0, index = 0;
        int curr_ele = 0, k = 0;
        while (high < nums.length) {
            if (nums[low] == nums[high] && curr_ele < 2) {
                high++;
                k++;
                curr_ele++;
                nums[index] = nums[low];
                index++;
            } else if (nums[low] == nums[high]) {
                high++;
                continue;
            } else if (nums[low] != nums[high]) {
                curr_ele = 0;
                curr_ele++;
                nums[index] = nums[high];
                low=high;
                high++;
                index++;
                k++;
            }
        }
        return k;
    }
}
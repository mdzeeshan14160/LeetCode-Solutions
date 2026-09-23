class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] shuffle_array = new int[nums.length];
        int low = 0, high = n, index = 0;
        while (high < nums.length) {
            shuffle_array[index] = nums[low];
            index++;
            low++;
            shuffle_array[index] = nums[high];
            index++;
            high++;
        }
        return shuffle_array;
    }
}
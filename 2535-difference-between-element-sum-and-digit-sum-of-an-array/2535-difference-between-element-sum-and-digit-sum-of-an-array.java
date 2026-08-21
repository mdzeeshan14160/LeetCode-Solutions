class Solution {
    public int differenceOfSum(int[] nums) {
        int sum = 0, digitsum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            while (nums[i] > 0) {
                int temp = nums[i] % 10;
                digitsum += temp;
                nums[i] /= 10;
            }
        }
        int diff = Math.abs(sum - digitsum);
        return diff;
    }
}
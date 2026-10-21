class Solution {
    public int missingNumber(int[] nums) {
        int total = 0;
        for (int x : nums) {
            total += x;
        }
        int expect = 0;
        for (int i = 0; i <= nums.length; i++) {
            expect += i;
        }
        return expect - total;
    }
}
class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length;
        int c0 = 0, c1 = 0, c2 = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] == 0) {
                c0++;
            } else if (nums[i] == 1) {
                c1++;
            } else {
                c2++;
            }
        }
        int pos = 0;
        for (int i = 0; i < c0; i++) {
            nums[i] = 0;
            pos++;
        }
        for (int i = 0; i < c1; i++) {
            nums[pos] = 1;
            pos++;
        }
        for (int i = 0; i < c2; i++) {
            nums[pos] = 2;
            pos++;
        }
    }
}
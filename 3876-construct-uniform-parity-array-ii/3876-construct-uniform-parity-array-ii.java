class Solution {
    public boolean uniformArray(int[] nums1) {
        int odd = Integer.MAX_VALUE;
        for (int num : nums1) {
            if (num % 2 != 0) {
                odd = Math.min(num, odd);
            }
        }
        if (odd != Integer.MAX_VALUE) {
            for (int num : nums1) {
                if (num % 2 == 0) {
                    if (num - odd < 1) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
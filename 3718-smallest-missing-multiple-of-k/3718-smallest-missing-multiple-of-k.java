class Solution {
    public int missingMultiple(int[] nums, int k) {
        HashSet<Integer> res = new HashSet<>();
        for (int num : nums) {
            res.add(num);
        }
        int mis = k;
        while (res.contains(mis)) {
            mis += k;
        }
        return mis;
    }
}
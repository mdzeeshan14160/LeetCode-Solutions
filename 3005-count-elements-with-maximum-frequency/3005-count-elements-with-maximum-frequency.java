class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int x = nums[i];
            if (map.containsKey(x)) {
                map.put(x, map.get(x) + 1);
            } else {
                map.put(x, 1);
            }
        }
        int max = 0;
        for (int freq : map.values()) {
            if (freq > max) {
                max = freq;
            }
        }
        int ans = 0;
        for (int freq : map.values()) {
            if (freq == max) {
                ans += freq;
            }
        }
        return ans;
    }
}
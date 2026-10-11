class Solution {
    List<List<Integer>>ans = new ArrayList<>();

    void helper(int s, int[] nums, int n, List<Integer> curr) {
        ans.add(new ArrayList<>(curr));
        if (s == nums.length) {
            return;
        }
        for (int i = s; i < nums.length; i++) {
            if (i > s && nums[i - 1] == nums[i]) {
                continue;
            }
            curr.add(nums[i]);
            helper(i + 1, nums, n, curr);
            curr.remove(curr.size() - 1);

        }
    }

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        int i = 0, n = nums.length;
        Arrays.sort(nums);
        List<Integer> curr = new ArrayList<>();
        helper(i, nums, n, curr);
        return ans;
    }
}
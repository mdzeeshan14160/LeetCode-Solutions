class Solution {
    List<List<Integer>> ans = new ArrayList<>();

    void helper(int s, int[] arr, int tar, List<Integer> par) {
        if (tar == 0) {
            ans.add(new ArrayList(par));
            return;
        }
        for (int i = s; i < arr.length; i++) {
            if (arr[i] > tar)
                continue;
            par.add(arr[i]);
            helper(i , arr, tar - arr[i], par);
            par.remove(par.size() - 1);
        }
    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<Integer> par = new ArrayList<>();
        helper(0, candidates, target, par);
        return ans;
    }
}
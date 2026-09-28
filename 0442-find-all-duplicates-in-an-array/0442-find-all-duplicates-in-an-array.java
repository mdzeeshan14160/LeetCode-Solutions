class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        ArrayList<Integer> list = new ArrayList<>();
        for (int x : nums) {
            if (!set.contains(x)) {
                set.add(x);
            } else {
                list.add(x);
            }
        }
        return list;
    }
}
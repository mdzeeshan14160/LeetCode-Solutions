class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int low = 0, high = 0;
        ArrayList<Integer> list = new ArrayList<>();
        while (low < nums1.length && high < nums2.length) {
            if (nums1[low] == nums2[high]) {
                list.add(nums1[low]);
                low++;
                high++;
            } else if (nums1[low] < nums2[high]) {
                low++;
            } else {
                high++;
            }
        }
        int[] arr = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            arr[i] = list.get(i);
        }
        return arr;
    }
}
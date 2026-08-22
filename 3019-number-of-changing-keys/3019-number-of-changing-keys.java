class Solution {
    public int countKeyChanges(String s) {
        int keys = 0;
        String res = s.toLowerCase();
        int low = 0, high = 1;
        while (high < s.length()) {
            if (res.charAt(low) != res.charAt(high)) {
                keys++;
            }
            low++;
            high++;
        }
        return keys;
    }
}
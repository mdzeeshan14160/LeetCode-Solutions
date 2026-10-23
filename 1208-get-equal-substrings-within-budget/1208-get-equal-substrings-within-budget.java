class Solution {
    public int equalSubstring(String s, String t, int maxCost) {
        int l = 0;
        int max_len = 0;
        int cost = 0;
        for (int h = 0; h < s.length(); h++) {
            cost += Math.abs(s.charAt(h) - t.charAt(h));
            while (cost > maxCost) {
                cost -= Math.abs(s.charAt(l) - t.charAt(l));
                l++;
            }
            max_len = Math.max(max_len, h - l + 1);
        }
        return max_len;
    }
}
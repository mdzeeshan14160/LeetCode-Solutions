class Solution {
    public boolean isSubsequence(String s, String t) {
        int low = 0, high = 0;
        if (low == s.length()) {
            return true;
        }
        while (low < s.length() && high < t.length()) {
            if (s.charAt(low) == t.charAt(high)) {
                low++;
                high++;
            } else {
                high++;
            }
        }
        if (low == s.length()) {
            return true;
        }
        return false;
    }
}
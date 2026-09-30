class Solution {
    public int maxVowels(String s, int k) {
        int wMax = 0;
        for (int i = 0; i < k; i++) {
            char ch = s.charAt(i);
            if ("aeiou".indexOf(ch) != -1) {
                wMax++;
            }
        }
        int max = wMax;
        for (int i = k; i < s.length(); i++) {
            char old = s.charAt(i - k);
            char curr = s.charAt(i);
            if ("aeiou".indexOf(old) != -1) {
                wMax--;
            }
            if ("aeiou".indexOf(curr) != -1) {
                wMax++;
            }
            max = Math.max(wMax, max);
        }
        return max;
    }
}
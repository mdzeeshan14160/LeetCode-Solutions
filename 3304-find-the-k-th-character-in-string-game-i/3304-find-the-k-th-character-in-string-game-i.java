class Solution {
    static StringBuilder sb = new StringBuilder("a");

    public char kthCharacter(int k) {
        while (sb.length() <= k) {
            int len = sb.length();
            for (int i = 0; i < len; i++) {
                char ch = (char) (sb.charAt(i) + 1);
                sb.append(ch);
            }
        }
        return sb.charAt(k - 1);
    }
}
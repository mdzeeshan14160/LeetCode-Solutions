class Solution {
    public String smallestString(String s) {
        StringBuilder sb = new StringBuilder(s);
        int i = 0;
        while (i < s.length() && s.charAt(i) == 'a') {
            i++;
        }
        if (i == s.length()) {
            sb.setCharAt(s.length() - 1, 'z');
        } else {
            while (i < s.length() && s.charAt(i) != 'a') {
                char ch = (char) (sb.charAt(i) - 1);
                sb.setCharAt(i, ch);
                i++;
            }
        }
        return sb.toString();
    }
}
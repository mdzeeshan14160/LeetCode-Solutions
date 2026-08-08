class Solution {
    public int lengthOfLastWord(String s) {
        String res = s.trim();
        int count = 0;
        for (int i = res.length() - 1; i >= 0; i--) {
            if (res.charAt(i) == ' ')
                break;
            else
                count++;
        }
        return count;
    }
}
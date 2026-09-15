class Solution {
    public boolean isvowel(char c) {
        return "aeiouAEIOU".indexOf(c) != -1;
    }

    public String reverseVowels(String s) {
        int low = 0, high = s.length() - 1;
        StringBuilder res = new StringBuilder(s);
        while (low <= high) {
            if (isvowel(res.charAt(low))) {
                if (isvowel(res.charAt(high))) {
                    char temp = res.charAt(low);
                    res.setCharAt(low, res.charAt(high));
                    res.setCharAt(high, temp);
                    low++;
                    high--;
                } else {
                    high--;
                }
            } else {
                low++;
            }
        }
        return res.toString();
    }
}
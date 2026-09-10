class Solution {
    public String firstPalindrome(String[] words) {
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            int low = 0, high = word.length() - 1;
            boolean palin = false;
            while (low <= high) {
                if (word.charAt(low) != word.charAt(high)) {
                    palin = false;
                    break;
                }
                low++;
                high--;
                palin=true;
            }
            if (palin) {
                return word;
            }
        }
        return "";
    }
}
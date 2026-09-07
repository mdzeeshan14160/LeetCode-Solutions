class Solution {
    public int mostWordsFound(String[] sentences) {
        int maxlen = 0;
        for (String sent : sentences) {
            int curr = sent.split(" ").length;
            if (maxlen < curr)
                maxlen = curr;
        }
        return maxlen;
    }
}
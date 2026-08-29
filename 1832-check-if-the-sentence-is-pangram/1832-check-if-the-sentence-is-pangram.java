class Solution {
    public boolean checkIfPangram(String sentence) {
        HashMap<Character, Integer> res = new HashMap<>();
        for (int i = 0; i < sentence.length(); i++) {
            char ch = sentence.charAt(i);
            res.put(ch, res.getOrDefault(ch, 0) + 1);
        }
        return res.size() == 26;
    }
}
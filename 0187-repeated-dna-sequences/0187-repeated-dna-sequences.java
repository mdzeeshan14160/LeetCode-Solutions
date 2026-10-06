class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        Set<String> str = new HashSet<>();
        Set<String> rep = new HashSet<>();
        int low = 0, high = 1;
        int curr_size = 1;
        while (high <= s.length()) {
            if (curr_size < 10) {
                high++;
                curr_size++;
            } else {
                String curr = s.substring(low, high);
                if (!str.add(curr)) {
                    rep.add(curr);
                }
                low++;
                high++;
            }
        }
        return new ArrayList<>(rep);
    }
}
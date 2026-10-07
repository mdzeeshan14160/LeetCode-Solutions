class Solution {
    public int minSetSize(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();

        // Frequency count
        for (int x : arr) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }

        // Store frequencies
        ArrayList<Integer> freq = new ArrayList<>(map.values());

        // Largest frequency first
        Collections.sort(freq, Collections.reverseOrder());

        int removed = 0;
        int count = 0;

        for (int x : freq) {
            removed += x;
            count++;

            if (removed >= arr.length / 2) {
                break;
            }
        }

        return count;
    }
}

class Solution {
    HashSet<Integer> set = new HashSet<>();

    void answer(int[] arr, int count, boolean[] used, int res) {
        if (count == 3) {
            if (res % 2 == 0) {
                set.add(res);
            }
            return;
        }

        for (int i = 0; i < arr.length; i++) {
            if (used[i])
                continue;

            if (count == 0 && arr[i] == 0)
                continue;

            used[i] = true;

            answer(arr, count + 1, used, res * 10 + arr[i]);

            used[i] = false;
        }
    }

    public int totalNumbers(int[] digits) {
        set.clear();
        answer(digits, 0, new boolean[digits.length], 0);
        return set.size();
    }
}
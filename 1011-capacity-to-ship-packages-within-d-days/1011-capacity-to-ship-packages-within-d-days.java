
class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int l = 0, r = 0;

        for (int w : weights) {
            l = Math.max(l, w);
            r += w;
        }

        while (l < r) {
            int mid = (l + r) / 2;
            int d = 1, sum = 0;

            for (int w : weights) {
                if (sum + w > mid) {
                    d++;
                    sum = 0;
                }
                sum += w;
            }

            if (d <= days)
                r = mid;
            else
                l = mid + 1;
        }

        return l;
    }
}

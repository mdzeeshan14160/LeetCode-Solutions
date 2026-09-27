class Solution {
    public long pickGifts(int[] gifts, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int x : gifts) {
            pq.offer(x);
        }
        long sum = 0;
        for (int i = 0; i < k; i++) {
            int max = pq.poll();
            int val = (int) Math.sqrt(max);
            pq.offer(val);
        }
        for (int x : pq) {
            sum += x;
        }
        return sum;
    }
}
class Solution {
    public int maximizeSum(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        int score = 0;
        for (int x : nums) {
            pq.offer(x);
        }
        for (int i = 0; i < k; i++) {
            int val = pq.poll();
            score += val;
            pq.offer(val + 1);
        }
        return score;
    }
}
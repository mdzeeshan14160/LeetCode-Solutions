class Solution {
    public int subtractProductAndSum(int n) {
        int sum = 0, prd = 1;
        while (n > 0) {
            int temp = n % 10;
            sum += temp;
            prd *= temp;
            n /= 10;
        }
        return prd - sum;
    }
}
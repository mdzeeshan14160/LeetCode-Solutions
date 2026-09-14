class Solution {
    public int getnext(int n) {
        int sum = 0;
        while (n > 0) {
            int temp = n % 10;
            sum += temp * temp;
            n /= 10;
        }
        return sum;
    }

    public boolean isHappy(int n) {
        int slow = n, fast = n;
        while (true) {
            slow = getnext(slow);
            fast = getnext(getnext(fast));
            if (fast == 1) {
                return true;
            } else if (slow == fast) {
                return false;

            }
        }
    }
}
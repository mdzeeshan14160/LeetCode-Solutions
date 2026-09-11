class Solution {
    public int theMaximumAchievableX(int num, int t) {
        int max = num;
        for (int i = t; i > 0; i--) {
            max += 2;
        }
        return max;
    }
}
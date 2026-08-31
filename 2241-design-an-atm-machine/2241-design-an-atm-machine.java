class ATM {
long[] count;
    int[] notes;
    public ATM() {
        count = new long[5];
        notes = new int[]{20, 50, 100, 200, 500};
    }
    public void deposit(int[] banknotesCount) {
        for (int i = 0; i < 5; i++) {
            count[i] += banknotesCount[i];
        }
    }
    public int[] withdraw(int amount) {
        int[] ans = new int[5];
        for (int i = 4; i >= 0; i--) {
            long take = Math.min(count[i], amount / notes[i]);
            ans[i] = (int) take;
            amount -= take * notes[i];
        }
        if (amount != 0) {
            return new int[]{-1};
        }
        for (int i = 0; i < 5; i++) {
            count[i] -= ans[i];
        }
        return ans;
    }
}
/**
 * Your ATM object will be instantiated and called as such:
 * ATM obj = new ATM();
 * obj.deposit(banknotesCount);
 * int[] param_2 = obj.withdraw(amount);
 */
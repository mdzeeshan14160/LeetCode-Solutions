class Solution {
    int i = 0;

    public void reverseString(char[] s) {
        int n = s.length-1;
        if (i > n / 2)
            return;
        char temp = s[i];
        s[i] = s[n - i];
        s[n - i] = temp;
        i++;
        reverseString(s);
    }
}

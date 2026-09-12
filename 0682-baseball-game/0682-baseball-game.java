class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < operations.length; i++) {
            String s = operations[i];
            char ch = s.charAt(0);
            if (ch != 'D' && ch != '+' && ch != 'C') {
                int n = Integer.parseInt(s);
                st.push(n);
            } else if (ch == 'C') {
                st.pop();
            } else if (ch == '+') {
                int a = st.pop();
                int b = st.pop();
                int c = a + b;
                st.push(b);
                st.push(a);
                st.push(c);
            } else if (ch == 'D') {
                int c = st.peek();
                st.push(c * 2);
            }
        }
        int sum = 0;
        for (int x : st) {
            sum += x;
        }
        return sum;
    }
}
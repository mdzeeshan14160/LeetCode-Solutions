class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();
        for (String str : tokens) {
            if (str.equals("+") || str.equals("-")
                    || str.equals("*") || str.equals("/")) {
                int b = st.pop();
                int a = st.pop();
                if (str.equals("+")) {
                    st.push(a + b);
                } else if (str.equals("-")) {
                    st.push(a - b);
                } else if (str.equals("*")) {
                    st.push(a * b);
                } else {
                    st.push(a / b);
                }
            } else {
                st.push(Integer.parseInt(str));
            }
        }
        return st.pop();
    }
}
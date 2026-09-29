class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuilder sb = new StringBuilder();
        while (columnNumber > 0) {
            columnNumber--;
            int s = columnNumber % 26;
            columnNumber /= 26;
            char ch = (char) ('A' + s);
            sb.append(ch);
        }
        return sb.reverse().toString();
    }
}
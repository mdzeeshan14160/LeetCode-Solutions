class Solution {
    public int titleToNumber(String columnTitle) {
        int col_num = 0;
        for (int i = 0; i < columnTitle.length(); i++) {
            char ch = columnTitle.charAt(i);
            int char_value = ch - 'A' + 1;
            col_num = col_num * 26 + char_value;
        }
        return col_num;
    }
}
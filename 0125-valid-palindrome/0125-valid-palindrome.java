class Solution {
    public boolean isPalindrome(String s) {

        String org = s.replaceAll("[^a-zA-Z0-9]", "");

        String[] arr = org.split("");

        String res = "";

        for (int i = arr.length - 1; i >= 0; i--) {
            res += arr[i];
        }

        return res.equalsIgnoreCase(org);
    }
}
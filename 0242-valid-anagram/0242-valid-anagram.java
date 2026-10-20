class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        char[] a = s.toCharArray();
        char[] b = t.toCharArray();
        int low = 0 , high = 0;
        Arrays.sort(a);
        Arrays.sort(b);
        while(low < s.length() && high < t.length()){
            if(a[low] != b[high]){
                return false;
            }
            low++;
            high++;
        }
        return true;
    }
}
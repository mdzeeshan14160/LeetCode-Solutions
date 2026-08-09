class Solution {
    public int lengthOfLongestSubstring(String s) {
        int start=0;
        int end=0;
        int max=0;
        List<Character>str=new ArrayList<Character>();
        while(end<s.length())
        {
            if(!str.contains(s.charAt(end))){
                str.add(s.charAt(end));
                end++;
                max=Math.max(max,str.size());
            }
            else{
                str.remove(Character.valueOf(s.charAt(start)));
                start++;
            }
        }
        return max;
    }
}
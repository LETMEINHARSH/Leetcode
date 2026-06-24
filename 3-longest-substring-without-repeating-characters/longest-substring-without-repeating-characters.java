class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int currcount = 0;
        int maxcount = 0;
        int left = 0;
        int right = 0;
        while(right<s.length()){
            if(set.contains(s.charAt(right))){
                while(set.contains(s.charAt(right))){
                    set.remove(s.charAt(left));
                    left++;
                }
                set.add(s.charAt(right++));
                currcount = 0;
            }
            else{
                set.add(s.charAt(right));
                currcount = right - left + 1;
                maxcount = Math.max(currcount,maxcount);
                right++;
            }
        }
        return maxcount;
    }
}
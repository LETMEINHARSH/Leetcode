class Solution {
    public String makeSmallestPalindrome(String s) {
        String ans = "";
        int i = 0;
        int j = s.length() - 1;
        while(i <= j){
            if(s.charAt(i) == s.charAt(j)){
                ans += s.charAt(i);
            }
            else if(s.charAt(i) < s.charAt(j)){
                ans += s.charAt(i);
            }
            else if(s.charAt(i) > s.charAt(j)){
                ans += s.charAt(j);
            }
            i++;
            j--;
        }
        if(s.length() % 2 == 0){
            i--;
            while(i >= 0){
                ans += ans.charAt(i);
                i--;
            }
        }
        else if(s.length() % 2 != 0){
            i -= 2;
            while(i >= 0){
                ans += ans.charAt(i);
                i--;
            }
        }
        return ans;
    }
}
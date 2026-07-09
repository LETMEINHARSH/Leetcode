class Solution {
    public String reverseWords(String s) {
        StringBuilder ans = new StringBuilder();
        int i = 0;
        int j = 0;
        while(j < s.length()){
            while(j < s.length() && s.charAt(j) != ' '){
                j++;
            }
            i = j-1;
            while(i >= 0 && s.charAt(i) != ' '){
                ans.append(s.charAt(i));
                i--;
            }
            ans.append(' ');
            j++;
        }
        ans.deleteCharAt(s.length());
        return ans.toString();
    }
}
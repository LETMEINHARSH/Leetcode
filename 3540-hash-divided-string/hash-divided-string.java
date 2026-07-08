class Solution {
    public String stringHash(String s, int k) {
        String ans = "";
        int sum = 0;
        int i = 0;
        while(i<s.length()){
            int temp = k;
            sum = 0;
            while(temp>0){
                sum += s.charAt(i)-97;
                temp--;
                i++;
            }
            ans += (char)((sum % 26) + 97);
        }
        return ans;
    }
}
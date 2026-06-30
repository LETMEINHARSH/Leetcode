class Solution {
    public int numberOfSubstrings(String s) {
        int count = 0;
        int left = 0;
        int right = 0;
        int a = 0 ,b = 0, c = 0; 
        for( ;right<s.length();right++){
            if(s.charAt(right) == 'a')a++;
            else if(s.charAt(right) == 'b')b++;
            else if(s.charAt(right) == 'c')c++;
            while(a>0 && b>0 && c>0){
                count = count + s.length() -right;
                if(s.charAt(left) == 'a')a--;
                else if(s.charAt(left) == 'b')b--;
                else if(s.charAt(left) == 'c')c--;
                left++;
            }
        }
        return count;
    }
}
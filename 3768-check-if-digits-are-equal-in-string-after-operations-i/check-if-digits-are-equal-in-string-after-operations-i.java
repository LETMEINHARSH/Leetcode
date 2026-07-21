class Solution {
    public boolean hasSameDigits(String s) {
        String s1 = s;
        while(s1.length() > 2){
            s1 = minus(s1);
        }
        return (s1.charAt(0) == s1.charAt(1)) ? true : false;
    }
    public String minus(String ss){
        String s1 ="";
        for(int i=0;i<ss.length()-1;i++){
            s1+= (ss.charAt(i) + ss.charAt(i+1)) % 10;
        }
        return s1;
    }
}
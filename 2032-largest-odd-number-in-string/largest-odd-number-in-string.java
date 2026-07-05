class Solution {
    public String largestOddNumber(String num) {
        int i;
        for(i = num.length()-1;i>=0;i--){
            if((int)num.charAt(i) % 2 !=0){
                break;
            }
        }
        String s = "";
        int j = 0;
        while(j<=i){
            s += num.charAt(j);
            j++;
        }
        return s;
    }
}
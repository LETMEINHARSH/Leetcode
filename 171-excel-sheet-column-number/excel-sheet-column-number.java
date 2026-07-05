class Solution {
    public int titleToNumber(String columnTitle) {
        if(columnTitle.length() == 1){
            return columnTitle.charAt(0)-64;
        }
        int sum = 0;
        for(int i=0;i<columnTitle.length();i++){
            sum = sum*26 + (columnTitle.charAt(i) - 64);
        }
        return sum;
    }
}
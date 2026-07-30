class Solution {
    public int minimumPushes(String word) {
        int count = 0;
        int sum = 0;
        int push = 1;
        for(int i=0;i<word.length();i++){
            sum += push;
            count++;
            push = (count == 8)?push+1:push;
            count = (count == 8)?0:count;
        }
        return sum;
    }
}
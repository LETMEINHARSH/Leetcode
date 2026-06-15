class Solution {
    public int fillCups(int[] amount) {
        int second = 0;
        while(true){
            Arrays.sort(amount);
            if(amount[2]==0){
                return second;
            }
            if(amount[1]>0){
                amount[1]--;
                amount[2]--;
            }
            else{
                amount[2]--;
            }
            second++;
        }
    }
}
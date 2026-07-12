class Solution {
    public int countEven(int num) {
        int count = 0;
        for(int i=2;i<=num;i++){
            int temp = i;
            int odd = 0;
            while(temp>0){
                if((temp % 10) % 2 != 0){
                    odd++;
                }
                temp /= 10;
            }
            if(odd % 2 == 0){
                count++;
            }
        }
        return count;
    }

}
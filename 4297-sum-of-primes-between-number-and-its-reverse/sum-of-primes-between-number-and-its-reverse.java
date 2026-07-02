class Solution {
    public int sumOfPrimesInRange(int n) {
        int temp = n;
        int r = 0;
        while(temp>0){
            r = (r*10) + (temp%10);
            temp /= 10;
        }
        int sum = 0;
        int min = 0;
        int max = 0;
        if(n<r){
            min = n;
            max = r;
        }
        else{
            min = r;
            max = n;
        }
        for(int i=min;i<=max;i++){
            if(i == 1){
                continue;
            }
            int flag = 1;
            for(int j=2;j<=Math.sqrt(i);j++){
                if(i%j == 0){
                    flag = 0;
                    break;
                }
            }
            if(flag == 1){
                System.out.println(i);
                sum += i;
            }
        }
        return sum;
    }
}
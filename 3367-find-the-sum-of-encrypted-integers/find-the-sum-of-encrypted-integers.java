class Solution {
    public int sumOfEncryptedInt(int[] nums) {
        int sum = 0;
        for(int i=0;i<nums.length;i++){
            nums[i] = encrypt(nums[i]);
            sum+=nums[i];
        }
        return sum;
    }
    public int encrypt(int x){
        int count = 0;
        int max = 0;
        while(x>0){
            if((x%10)>max){
                max=x%10;
            }
            x/=10;
            count++;
        }
        while(count>0){
            x=(x*10)+max;
            count--;
        }
        return x;
    }
}
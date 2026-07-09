class Solution {
    public int sumFourDivisors(int[] nums) {
        int count = 0;
        int sum = 0;
        for(int i=0;i<nums.length;i++){
            count = 0;
            int currsum = nums[i] + 1;
            for(int j = 2;j<=nums[i]/2;j++){
                if(nums[i] % j == 0){
                    currsum += j;
                    count++;
                }
                if(count > 2){
                    break;
                }
            }
            if(count == 2){
                sum += currsum;
            }
        }
        return sum;
    }
}
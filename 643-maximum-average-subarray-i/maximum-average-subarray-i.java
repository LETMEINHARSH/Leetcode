//Sliding window
class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int i = 0;
        int j = 0;
        double sum = 0;
        for(j=0;j<k;j++){
            sum += nums[j];
        } 
        double curravg = sum/k;
        double maxavg = curravg;
        while(j<nums.length){
            sum = sum - nums[i++] + nums[j++];
            curravg = sum/k;
            if(curravg > maxavg){
                maxavg = curravg;
            }
        }
        return maxavg;
    }
}
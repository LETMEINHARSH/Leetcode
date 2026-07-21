class Solution {
    public int longestSubarray(int[] nums) {
        int count = 0;
        int maxcount = 0;
        for(int i=0;i<nums.length-2;i++){
            if(nums[i]+nums[i+1] == nums[i+2]){
                count++;
                maxcount = Math.max(count,maxcount);
            }
            else{
                count = 0;
            }
        }
        return maxcount+2;
    }
}
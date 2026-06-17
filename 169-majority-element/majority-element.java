class Solution {
    public int majorityElement(int[] nums) {
        int major = nums.length/2;
        int curr = nums[0];
        int count = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] == curr){
                count++;
            }
            else if(nums[i] != curr && count>0){
                count--;
            }
            else if(nums[i] != curr && count==0){
                curr=nums[i];
                count++;
            }
        }
        return curr;
    }
}
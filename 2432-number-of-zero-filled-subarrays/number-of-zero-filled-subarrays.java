class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long count = 0;
        long subarr = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                count++;
            }
            else{
                subarr+= (count*(count+1))/2;
                count = 0;
            }
        }
        subarr+= (count*(count+1))/2;
        return subarr;
    }
}
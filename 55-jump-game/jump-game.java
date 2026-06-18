class Solution {
    public boolean canJump(int[] nums) {
        int steps =nums[0];
        int i=0;
        while(i<=steps && i<nums.length){
            if((nums[i]+i)>=steps){
                steps = nums[i]+i;
            }
            i++;
        }
        return (steps>=nums.length-1)?true:false;
    }
}
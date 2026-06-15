class Solution {
    public void moveZeroes(int[] nums) {
        int zero = 0;
        int nonzero = 1;
        while(nonzero<nums.length && zero<nums.length){
            while(zero<nums.length && nums[zero]!=0){
                zero++;
            }
            while(nonzero<zero && nums[nonzero]!=0){
                nonzero++;
            }
            if(nonzero<nums.length && nums[nonzero]==0 ){
                nonzero++;
            }
            else if(zero<nums.length){
                nums[zero]=nums[nonzero];
                nums[nonzero]=0;
                nonzero++;
            }
        } 
    }
}
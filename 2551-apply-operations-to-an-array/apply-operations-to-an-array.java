class Solution {
    public int[] applyOperations(int[] nums) {
        int i = 0;
        while(i<nums.length-1){
            if(nums[i] == 0 || nums[i] != nums[i+1]){
                i++;
            }
            else if(nums[i] == nums[i+1]){
                nums[i] *= 2;
                nums[i+1] = 0;
            }
        }
        i = 0;
        int j = 0;
        while(i < nums.length && j < nums.length){
            if(nums[i] != 0){
                i++;
            }
            else if(j < i || nums[j] == 0){
                j++;
            }
            else{
                nums[i] = nums[j];
                nums[j] = 0;
                i++;
                j++; 
            }
        }
        return nums;
    }
}
class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int[] even = new int[nums.length / 2];
        int[] odd = new int[nums.length / 2];
        int i = 0;
        int j = 0;
        for(int k=0;k<nums.length;k++){
            if(nums[k] % 2 == 0){
                even[i++] = nums[k];
            }
            else{
                odd[j++] = nums[k];
            }
        }
        i = 0;
        j = 0;
        int k = 0;
        while(k < nums.length){
            if(k % 2 == 0){
                nums[k] = even[i];
                i++;
            }
            else{
                nums[k] = odd[j];
                j++;
            }
            k++;
        }
        return nums;
    }
}
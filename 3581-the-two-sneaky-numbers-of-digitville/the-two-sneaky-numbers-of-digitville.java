//Time O(n^2)
//Space O(1)
//optimize to O(N)
class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int[] arr = new int[2];
        int k = 0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i] == nums[j]){
                    arr[k++] = nums[j];
                    if(k==2){
                        break;
                    }
                }
            }
            if(k==2){
                break;
            }
        }
        return arr;
    }
}
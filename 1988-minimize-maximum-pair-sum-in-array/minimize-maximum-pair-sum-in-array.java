//Time  : O(n log n)
//Space : O(1)

class Solution {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int i = 0;
        int j = nums.length - 1;
        int max = 0;
        int sum = 0;
        while(i < j){
            sum = nums[i] + nums[j];
            max = (sum > max)?sum:max;
            i++;
            j--;
        }
        return max;
    }
}
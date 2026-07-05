//prefix sum maintain left and right sum
class Solution {
    public int[] getSumAbsoluteDifferences(int[] nums) {
        int n = nums.length;
        int sum = 0;
        for(int i=0;i<n;i++){
            sum += nums[i];
        }
        int leftsum = 0;
        int[] ans = new int[n];
        for(int i=0;i<n;i++){
            int rightsum = sum - leftsum -nums[i];
            ans[i] = (rightsum - ((n - i - 1) * nums[i])) + ((nums[i] * i) - leftsum);
            leftsum += nums[i];
        }
        return ans;
    }
}
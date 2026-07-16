//Time: O(n log n)
//Space: O(1)

class Solution {
    public long gcdSum(int[] nums) {
        int max = nums[0];
        for(int i=0;i<nums.length;i++){
            max = (nums[i] > max)?nums[i]:max;
            nums[i] = gcd(nums[i] , max);
        }
        Arrays.sort(nums);
        int i = 0;
        int j = nums.length - 1;
        long sum = 0;
        while(i < j){
            sum += gcd(nums[i],nums[j]);
            i++;
            j--;
        }
        return sum;
    }

    public int gcd(int a,int b){
        if(b == 0){
            return a;
        }
        return gcd(b , a%b);
    }
}
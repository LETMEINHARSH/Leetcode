class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> sum = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(sum.containsKey(target-nums[i])){
                return new int[]{sum.get(target-nums[i]),i};
            }
            else{
                sum.put(nums[i],i);
            }
        }
        return new int[]{0,0};
    }
}
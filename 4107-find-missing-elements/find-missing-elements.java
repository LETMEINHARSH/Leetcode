class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> lst = new ArrayList<>();
        int min = nums[0];
        int max = nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]<min){
                min = nums[i];
            }
            if(nums[i]>max){
                max = nums[i];
            }
        }
        int[] arr = new int[max-min+1];
        for(int i=0;i<nums.length;i++){
            arr[nums[i]-min] = nums[i];
        }
        for(int i =0;i<arr.length;i++){
            if(arr[i] == 0){
                lst.add(min+i);
            }
        }
        return lst;
    }
}
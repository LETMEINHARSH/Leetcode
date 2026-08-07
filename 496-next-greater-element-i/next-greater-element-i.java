class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> stack = new Stack<>();
        Map<Integer,Integer> map = new HashMap<>();

        for(int i = 0;i<nums2.length;i++){
            if(stack.isEmpty() || stack.peek() >= nums2[i]){
                stack.push(nums2[i]);
            }
            else if(stack.peek() < nums2[i]){
                while(!stack.isEmpty() && stack.peek() < nums2[i]){
                    map.put(stack.pop(),nums2[i]);
                }
                stack.push(nums2[i]);
            }
        }

        for(int i = 0;i<nums1.length;i++){
            if(!map.containsKey(nums1[i])){
                nums1[i] = -1;
            }
            else{
                nums1[i] = map.get(nums1[i]);
            }
        }
        return nums1;
    }
}
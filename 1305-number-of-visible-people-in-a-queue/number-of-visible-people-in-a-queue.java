class Solution {
    public int[] canSeePersonsCount(int[] heights) {
        Stack<Integer> stack = new Stack<>();
        int[] ans = new int[heights.length];
        for(int i=heights.length-1;i>=0;i--){
            int count = 0;
            if(stack.isEmpty()){
                stack.push(heights[i]);
            }
            else if(stack.peek() > heights[i]){
                ans[i] = 1;
                stack.push(heights[i]);
            }
            else if(stack.peek() < heights[i]){
                while(!stack.isEmpty() && stack.peek() < heights[i]){
                    stack.pop();
                    count++;
                }
                ans[i] = (stack.isEmpty())?count:count+1;
                stack.push(heights[i]);
            }
        }
        return ans;
    }
}
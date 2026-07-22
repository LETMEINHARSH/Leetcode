class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> stack = new Stack<>();
        int i = 0;
        int j = 0;
        while(i<=pushed.length && j<popped.length){
            if(stack.size() > 0 && stack.peek() == popped[j]){
                stack.pop();
                j++;
            }
            else if(stack.size() == 0 || stack.peek() != popped[j]){
                if(i == pushed.length){
                    return false;
                }
                stack.push(pushed[i]);
                i++;
            }
        }
        return j == popped.length;
    }
}
class Solution {
    public String reverseParentheses(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) != ')'){
                stack.push(s.charAt(i));
            }
            else{
                StringBuilder curr = new StringBuilder();
                while(stack.peek() != '('){
                    curr.append(stack.pop());
                }
                stack.pop();
                for(int j=0;j<curr.length();j++){
                    stack.push(curr.charAt(j));
                }
            }
        }
        StringBuilder ans = new StringBuilder();
        while(!stack.isEmpty()){
            ans.append(stack.pop());
        }
        return ans.reverse().toString();
    }
}
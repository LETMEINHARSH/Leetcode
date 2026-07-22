class Solution {
    public String minRemoveToMakeValid(String s) {
        Stack<Character> stack = new Stack<>();
        int count = 0;
        for(int i = 0;i<s.length();i++){
            if(s.charAt(i) != '(' && s.charAt(i) != ')'){
                stack.push(s.charAt(i));
            }
            else{
                if(s.charAt(i) == '('){
                    stack.push('(');
                    count++;
                }
                else if(s.charAt(i) == ')' && count > 0){
                    stack.push(')');
                    count--;
                }
            }
        }
        StringBuilder ans =new StringBuilder();
        while(!stack.isEmpty()){
            if(stack.peek() == '(' && count > 0){
                stack.pop();
                count--;
            }
            else{
                ans.append(stack.pop());
            }
        }
        return ans.reverse().toString();
    }
}
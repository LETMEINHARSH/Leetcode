class Solution {
    public String clearDigits(String s) {
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) >= 'a' && s.charAt(i) <= 'z'){
                stack.push(s.charAt(i));
            }
            else{
                stack.pop();
            }
        }
        String s1 = "";
        while(!stack.isEmpty()){
            s1=stack.pop() + s1;
        }
        return s1;
    }
}
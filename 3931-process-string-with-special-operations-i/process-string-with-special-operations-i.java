class Solution {
    public String processStr(String s) {
        StringBuilder result = new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)>='a' && s.charAt(i)<='z'){
                result.append(s.charAt(i));
            }
            else if(s.charAt(i)=='#'){
                result.append(result);
            }
            else if(s.charAt(i)=='%'){
                result.reverse();
            }
            else if(s.charAt(i)=='*'){
                if(result.length()>0){
                    result.deleteCharAt(result.length()-1);
                }  
            }
        }//for
        return result.toString();
    }//public
}//class
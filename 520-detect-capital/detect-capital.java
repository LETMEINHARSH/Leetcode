class Solution {
    public boolean detectCapitalUse(String word) {
        int uppercase = 0;
        for(int i=0;i<word.length();i++){
            if(word.charAt(i) >='A' && word.charAt(i) <= 'Z'){
                uppercase++;
            }
        }
        return uppercase == word.length() || uppercase == 0 || (uppercase == 1 && Character.isUpperCase(word.charAt(0)));
    }
}
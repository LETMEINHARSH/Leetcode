class Solution {
    public boolean checkIfPangram(String sentence) {
        if(sentence.length() < 26){
            return false;
        }
        int[] panagram = new int[26];
        for(int i=0;i<sentence.length();i++){
            panagram[sentence.charAt(i) - 'a']++;
        }
        for(int i=0;i<26;i++){
            if(panagram[i] == 0){
                return false;
            }
        }
        return true;
    }
}
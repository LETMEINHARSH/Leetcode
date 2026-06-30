class Solution {
    public int prefixCount(String[] words, String pref) {
        int count = 0;
        for(int i=0;i<words.length;i++){
            if(words[i].length() < pref.length()){
                continue;
            }
            else{
                for(int j=0;j<pref.length();j++){
                    if(pref.charAt(j) == words[i].charAt(j)){
                        continue;
                    }
                    else{
                        count--;
                        break;
                    }
                }
                count++;
            }
        }
        return count;
    }
}
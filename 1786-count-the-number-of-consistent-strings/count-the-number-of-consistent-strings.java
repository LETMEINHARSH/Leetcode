class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int count = 0;
        Set<Character> set = new HashSet<>();
        for(int i=0;i<allowed.length();i++){
            set.add(allowed.charAt(i));
        }
        int j = 0;
        for(int i =0;i<words.length;i++){
            for(j=0;j<words[i].length();){
                if(set.contains(words[i].charAt(j))){
                    j++;
                }
                else{
                    break;
                }
            }
            if(j == words[i].length()){
                count++;
            }
        }
        return count;
    }
}
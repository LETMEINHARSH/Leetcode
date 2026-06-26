class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        String result = "";
        for(int i=0;i<words.length;i++){
            int sum = 0;
            for(int j=0;j<words[i].length();j++){
                sum+=weights[words[i].charAt(j)-'a'];
            }
            sum%=26;
            result+=(char)('z'-sum);
        }
        return result;
    }
}
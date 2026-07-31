class Solution {
    public int minimumPushes(String word) {
        int[] freq = new int[26];
        for(int i=0;i<word.length();i++){
            freq[word.charAt(i) - 'a']++;
        }
        Arrays.sort(freq);
        int sum = 0;
        int push = 1;
        int count = 0;
        for(int i=25;i>=0;i--){
            sum += push*freq[i];
            count++;
            push = (count%8==0)?push+1:push;
        }
        return sum;
    }
}
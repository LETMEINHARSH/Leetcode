class Solution {
    public String smallestPalindrome(String s) {
        int[] arr = new int[26];
        for(int i= 0;i<s.length();i++){
            arr[s.charAt(i) - 'a']++;
        }
        StringBuilder left = new StringBuilder();
        StringBuilder middle = new StringBuilder();
        StringBuilder right = new StringBuilder();
        for(int i =0;i<26;i++){
            while(arr[i] > 1){
                left.append((char)('a' + i));
                right.append((char)('a' + i));
                arr[i] -= 2;
            }
            if(arr[i] == 1){
                middle.append((char)('a' + i));
            }
        }
        return right.toString() + middle.toString() + left.reverse().toString();
    }
}
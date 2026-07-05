class Solution {
    public int maximumGroups(int[] grades) {
        int n = grades.length;
        int i = 1;
        while(i <= n){
            n = n - i;
            i++;
        }
        return i-1;
    }
}
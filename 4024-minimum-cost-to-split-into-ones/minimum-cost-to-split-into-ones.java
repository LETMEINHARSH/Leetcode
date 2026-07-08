class Solution {
    public int minCost(int n) {
        n = n-1;
        return (n * (n+1))/2;
    }
}
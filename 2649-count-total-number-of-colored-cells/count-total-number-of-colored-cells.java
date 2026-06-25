class Solution {
    public long coloredCells(int n) {
        long n1 = (long)n;
        long a = (n1*n1)+((n1*n1)-(n1+(n1-1)));
        return a;
    }
}
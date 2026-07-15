class Solution {
    public int gcdOfOddEvenSums(int n) {
        int sumOdd = n * n;
        int sumEven = n * (n + 1);
        return GCD(sumOdd, sumEven);
    }

    public int GCD(int odd, int even){
        if(even == 0){
            return odd;
        }
        return GCD(even,odd%even);
    }
}
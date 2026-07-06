class Solution {
    public int maxCoins(int[] piles) {
        Arrays.sort(piles);
        int sum = 0;
        int bob = 0;
        int me = piles.length - 2;
        while(bob < me){
            sum += piles[me];
            bob++;
            me -= 2;
        }
        return sum;
    }
}
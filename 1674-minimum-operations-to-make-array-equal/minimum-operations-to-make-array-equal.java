// sum of n even number = n(n+1);
//sum of n odd number = n^2;
class Solution {
    public int minOperations(int n) {
        if(n % 2 == 0){
            return (n/2) * (n/2);
        }
        else{
            return (n/2)*((n/2)+1);
        }
    }
}
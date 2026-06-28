class Solution {
    public int mySqrt(int x) {
        int left = 0;
        int right = x;
        int mid = left + ((right-left)/2);
        int ans = mid;
        while(left <= right){
            if(1L*mid*mid == x){
                return mid;
            }
            else if(1L*mid*mid > x){
                right = mid - 1;
            }
            else if(1L*mid*mid < x){
                left = mid +1;
                ans = mid;
            }
            mid = left + ((right-left)/2);
        }
        return ans;
    }
}
/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int left = 1;
        int right = n;
        int mid = left +((right - left)/2);
        while(left <= right){
            if(isBadVersion(mid) == false){
                left = mid+1;
            }
            else{
                right = mid-1;
            }
            mid = left +((right - left)/2);
        }
        return left;
    }
}
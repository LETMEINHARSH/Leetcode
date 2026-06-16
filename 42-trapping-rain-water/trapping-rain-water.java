class Solution {
    public int trap(int[] height) {
        int i = 0;
        int lmax = 0;
        int rmax = 0;
        int j = height.length-1;
        int water = 0;
        while(i<j){
            if(height[i]<lmax){
                water += lmax-height[i];
            }
            else if(height[i]>lmax){
                lmax=height[i];
            }
            if(height[j]<rmax){
                water += rmax-height[j];
            }
            else if(height[j]>rmax){
                rmax=height[j];
            }
            if(height[i]<height[j]){
                i++;
            }
            else j--;
        }
        return water;
    }
}
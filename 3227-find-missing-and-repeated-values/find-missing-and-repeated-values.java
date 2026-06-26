//not optimized do in O(1) space
//time :: O(n^2)
//space :: O(n^2)

class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;
        int[] arr = new int[n*n];
        int[] ans = new int[2];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(arr[grid[i][j]-1] == 0 ){
                    arr[grid[i][j]-1] = grid[i][j];
                }
                else{
                    ans[0] = grid[i][j];
                }
            }
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i] == 0){
                ans[1] = i+1;
            }
        }
        return ans;
    }
}
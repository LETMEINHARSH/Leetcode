class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int i = 0;
        for(;i<matrix.length;i++){
            if(target < matrix[i][0]){
                break;
            }
        }
        if(i == 0){
            return false;
        }
        int left = 0;
        int right = matrix[i-1].length - 1;
        int mid = left + (right - left)/2;
        while(left <= right){
            if(matrix[i-1][mid] == target){
                return true;
            }
            else if(matrix[i-1][mid] < target){
                left = mid + 1;
            }
            else{
                right = mid - 1;
            }
            mid = left + (right - left)/2;
        }
        return false;
    }
}
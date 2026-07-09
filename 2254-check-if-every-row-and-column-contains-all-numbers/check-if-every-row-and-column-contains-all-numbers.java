class Solution {
    public boolean checkValid(int[][] matrix) {
        for(int i=0;i<matrix.length;i++){
            if(!isValid(matrix[i])){
                return false;
            }
        }//row

        for(int i=0;i<matrix.length;i++){
            int[] arr =new int[matrix.length];
            for(int j=0;j<matrix.length;j++){
                arr[j] = matrix[j][i];
            }
            if(!isValid(arr)){
                return false;
            }
        }
        return true;
    }//checkValid

    public boolean isValid(int[] arr){
        Set<Integer> set = new HashSet<>();
        for(int i=0;i<arr.length;i++){
            if(set.contains(arr[i])){
                return false;
            }
            else{
                set.add(arr[i]);
            }
        }
        return true;
    }//isValid
}
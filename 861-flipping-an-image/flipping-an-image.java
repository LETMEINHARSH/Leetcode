class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        for(int i=0;i<image.length;i++){
            int left= 0;
            int right = image[i].length-1;
            while(left<=right){
                int temp = image[i][right];
                image[i][right] = image[i][left];
                image[i][left] = temp;
                if(image[i][left]==0){
                    image[i][left]=1;
                }
                else{
                    image[i][left]=0;
                }
                if(left<right || image[i].length%2==0){
                    if(image[i][right]==0){
                        image[i][right]=1;
                    }
                    else{
                        image[i][right]=0;
                    }
                }
                left++;
                right--;
            }
        }
        return image;
    }
}
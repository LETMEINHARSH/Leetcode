class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        int temp = 0;
        int max = 0;
        for(int i=0;i<heights.length;i++){
            max = heights[i];
            for(int j=i;j<heights.length;j++){
                if(heights[j]>heights[i]){
                    temp = heights[j];
                    heights[j] = heights[i];
                    heights[i] = temp;
                    String stemp = names[j];
                    names[j] = names[i];
                    names[i] = stemp;
                }
            }
        }
        return names;
    }
}
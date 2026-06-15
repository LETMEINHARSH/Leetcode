class Solution {
    public int[] minBitwiseArray(List<Integer> nums) {
        int n = nums.size();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            for(int j=0;j<=nums.get(i);j++){
                if((j | j+1) == nums.get(i)){
                    arr[i]=j;
                    break;
                }
            }//forj
            if(arr[i]==0){
                arr[i]=-1;
            }
        }//fori
        return arr;
    }//public
}//class
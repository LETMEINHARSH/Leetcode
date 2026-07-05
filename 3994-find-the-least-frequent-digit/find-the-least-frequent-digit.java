class Solution {
    public int getLeastFrequentDigit(int n) {
        int[] arr = new int[10];
        while(n > 0){
            arr[n%10]++;
            n /= 10;
        }
        int min = Integer.MAX_VALUE;
        int num = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] == 0){
                continue;
            }
            if(arr[i] < min){
                min = arr[i];
                num = i;
            }
        }
        return num;
    }
}
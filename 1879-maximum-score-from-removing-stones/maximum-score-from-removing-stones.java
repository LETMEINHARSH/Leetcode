class Solution {
    public int maximumScore(int a, int b, int c) {
        int[] arr = {a,b,c};
        Arrays.sort(arr);
        if(arr[0] + arr[1] <= arr[2]){
            return arr[0] + arr[1];
        }
        else{
            return (a+b+c)/2;
        }
    }
}
class Solution {
    public int numberOfBeams(String[] bank) {
        int[] arr = new int[bank.length];
        for(int i=0;i<bank.length;i++){
            int count = 0;
            for(int j=0;j<bank[i].length();j++){
                if(bank[i].charAt(j) == '1'){
                    count++;
                }
            }//forj
            arr[i] = count;
        }//fori
        int sum = 0;
        int i = 0;
        int j = 1;
        while(j<arr.length){
            if(arr[j] == 0){
                j++;
                continue;
            }
            else{
                sum += (arr[j] * arr[i]);
                i = j;
                j++;
            }
        }
        return sum;
    }//numberOfBeams
}//class
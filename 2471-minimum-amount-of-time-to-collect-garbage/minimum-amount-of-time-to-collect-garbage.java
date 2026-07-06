class Solution {
    public int garbageCollection(String[] garbage, int[] travel) {
        int[] index = new int[3];
        for(int i=garbage.length -1;i>=0;i--){
            if(index[2] == 0 && garbage[i].contains("G")){
                index[2] = i;
            }
            if(index[1] == 0 && garbage[i].contains("P")){
                index[1] = i;
            }
            if(index[0] == 0 && garbage[i].contains("M")){
                index[0] = i;
            }
        }
        int m = 0;
        int p = 0;
        int g = 0;
        for(int i=0;i<garbage.length;i++){
            if(i <= index[0]){
                if(i > 0){
                    m += travel[i-1];
                }
                if(garbage[i].contains("M")){
                    int count = 0;
                    for(int j=0;j<garbage[i].length();j++){
                        if(garbage[i].charAt(j) == 'M'){
                            count++;
                        }
                    }
                    m += count;
                }
            }
            if(i <= index[1]){
                if(i > 0){
                    p += travel[i-1];
                }
                if(garbage[i].contains("P")){
                    int count = 0;
                    for(int j=0;j<garbage[i].length();j++){
                        if(garbage[i].charAt(j) == 'P'){
                            count++;
                        }
                    }
                    p += count;
                }
            }
            if(i <= index[2]){
                if(i > 0){
                    g += travel[i-1];
                }
                if(garbage[i].contains("G")){
                    int count = 0;
                    for(int j=0;j<garbage[i].length();j++){
                        if(garbage[i].charAt(j) == 'G'){
                            count++;
                        }
                    }
                    g += count;
                }
            }
        }
        return m+p+g;
    }
}
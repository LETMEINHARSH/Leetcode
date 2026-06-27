class Solution {
    public List<String> buildArray(int[] target, int n) {
        List<String> lst = new ArrayList<>();
        int i = 1;
        int j = 0;
        while(j < target.length){
            if(i != target[j]){
                lst.add("Push");
                lst.add("Pop");
                i++;
            }
            else{
                lst.add("Push");
                j++;
                i++;
            }
        }
        return lst;
    }
}
class Solution {
    public int countBalls(int lowLimit, int highLimit) {
        Map<Integer,Integer> map = new HashMap<>();
        int max = 0;
        for(int i=lowLimit;i<=highLimit;i++){
            String s = String.valueOf(i);
            int sum = 0;
            for(int j=0;j<s.length();j++){
                sum += s.charAt(j) - '0';
            }
            map.put(sum,map.getOrDefault(sum,0)+1);
            max = Math.max(max,map.get(sum));
        }
        return max;
    }
}
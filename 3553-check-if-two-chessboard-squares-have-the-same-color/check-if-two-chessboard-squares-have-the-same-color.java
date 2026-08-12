class Solution {
    public boolean checkTwoChessboards(String coordinate1, String coordinate2) {
        int coor1 = (coordinate1.charAt(0) - 'a' + coordinate1.charAt(1) - '0')%2;
        int coor2 = (coordinate2.charAt(0) - 'a' + coordinate2.charAt(1) - '0')%2;

        return coor1 == coor2;
    }
}
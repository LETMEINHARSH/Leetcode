class Solution {
    public int maxContainers(int n, int w, int maxWeight) {
        int cell = n*n;
        int weight = cell*w;
        int maxcontainer = maxWeight/w;
        return (weight>maxWeight)?maxcontainer:cell;
    }
}
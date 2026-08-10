//Complexity
//Time: O(n)
//Space: O(n)

class Solution {
    public long calculateScore(String[] instructions, int[] values) {
        boolean[] visited = new boolean[values.length];
        long score = 0;
        for(int i=0;i>=0 && i<values.length;){
            if(visited[i] == true){
                break;
            }
            visited[i] = true;
            if(instructions[i].equals("jump")){
                i += values[i];
            }
            else{
                score += values[i];
                i++;
            }
        }
        return score;
    }
}
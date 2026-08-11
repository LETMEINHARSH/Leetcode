class Solution {
    public int missingInteger(int[] A) {
        Set<Integer> seen = new HashSet<>();

        for (int i=0;i<A.length;i++)
            seen.add(A[i]);
        int sum = A[0];

        for (int i=1;i<A.length;i++) {
            if (A[i] == A[i - 1] + 1)
                sum += A[i];
            else break;
        }

        while (seen.contains(sum))
            sum++;

        return sum;
    }
}
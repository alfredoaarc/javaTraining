class Solution {
    public int solution(int X, int[] A) {
        boolean[] positions = new boolean[X+1];
        int count = 0;
        for (int r = 0; r < A.length; r++) {
            int position = A[r];
            if (!positions[position]) {
                positions[position] = true;
                count++;
                if (count == X) {
                    return r;
                }
            }
        }
        return -1;
    }
}
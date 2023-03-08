public class Solution {
    public int solution(int[] A) {
        int result = 0;
        for (int x = 0; x < A.length; x++) {
            result ^= A[x];
        }
        return result;
    }
}
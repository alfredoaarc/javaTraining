class Solution {
    public int solution(int N) {
        int maxGap = 0;
        int currentGap = -1;
        
        while (N > 0) {
            if (N % 2 == 0) {
                if (currentGap != -1) {
                    currentGap++;
                }
            } else {
                if (currentGap != -1) {
                    maxGap = Math.max(maxGap, currentGap);
                    currentGap = 0;
                } else {
                    currentGap = 0;
                }
            }
            N /= 2;
        }
        
        return maxGap;
    }
}
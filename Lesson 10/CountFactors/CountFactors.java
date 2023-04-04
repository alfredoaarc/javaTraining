//use sqrt

class Solution {
    private int solution(int N) {
        int count = 0;
        for (int i = 1; i <= Math.sqrt(N); i++) {
            if (N % i == 0) {
                if (i * i == N) {
                    count++; 
                } else {
                    count += 2; 
                }
            }
        }
        return count;
    }
}

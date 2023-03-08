// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");





class Solution {
    public int solution(int[] A) {
        int n = A.length;
        int totalSum = (n+1)*(n+2)/2;
        int arraySum = 0;
        
        for (int x = 0; x < n; x++) {
            arraySum += A[x];
        }
        
        return totalSum - arraySum;
    }
}

// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {
        int N = A.length;
        boolean[] isPresent = new boolean[N + 1];

        for (int a : A) {
            if (a < 1 || a > N || isPresent[a]) {
                return 0;
            }
            isPresent[a] = true;
        }
        
        return 1;
    }
}
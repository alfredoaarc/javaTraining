// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");


import java.util.*;

class Solution {
    public int solution(int[] A, int[] B) {
        int numSurvivingFishes = A.length;
        if (numSurvivingFishes == 0) return 0;

        Stack<Integer> upFishes = new Stack<>();
        for (int i = 0; i < A.length; i++) {
            if (B[i] == 0) {
                if (upFishes.isEmpty()) continue;
                while (!upFishes.isEmpty() && upFishes.peek() < A[i]) {
                    numSurvivingFishes--;
                    upFishes.pop();
                }
            } else {
                upFishes.push(A[i]);
            }
        }
        return numSurvivingFishes;
    }
}
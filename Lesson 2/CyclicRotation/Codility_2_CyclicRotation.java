// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    // Implement your solution here
public int[] solution(int[] A, int K) {
    int N = A.length;
    if (N == 0 || K % N == 0) {
        return A;
    }
    int shift = K % N;
    int[] result = new int[N];
    for (int i = 0; i < N; i++) {
        result[(i + shift) % N] = A[i];
    }
    return result;
}
}

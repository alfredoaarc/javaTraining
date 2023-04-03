import java.util.Stack;

public class Solution {
    public int N;
    public int[] A;

    public int solution(int[] A) {
        this.N = A.length;
        this.A = A;

        int[] maxDoubleSliceEndings = calculateMaxDoubleSliceEndingsPublic();

        int maxDoubleSliceSum = findMaxDoubleSliceSumPublic(maxDoubleSliceEndings);

        return maxDoubleSliceSum;
    }

    public int[] calculateMaxDoubleSliceEndingsPublic() {
        int[] maxEndings = new int[N];
        Stack<Integer> maxEndingsStack = new Stack<>();
        for (int i = 1; i < N - 1; i++) {
            while (!maxEndingsStack.isEmpty() && A[i] > A[maxEndingsStack.peek()]) {
                maxEndingsStack.pop();
            }
            int maxEnding = Math.max(maxEndings[i-1] + A[i], 0);
            maxEndings[i] = maxEnding;
            if (!maxEndingsStack.isEmpty()) {
                int prevMaxEndingIndex = maxEndingsStack.peek();
                maxEndings[i] = Math.max(maxEndings[i], maxEndings[prevMaxEndingIndex]);
            }
            maxEndingsStack.push(i);
        }
        return maxEndings;
    }

    public int findMaxDoubleSliceSumPublic(int[] maxDoubleSliceEndings) {
        int maxDoubleSliceSum = 0;
        for (int i = 1; i < maxDoubleSliceEndings.length - 1; i++) {
            int doubleSliceSum = maxDoubleSliceEndings[i-1] + maxDoubleSliceEndings[i+1];
            maxDoubleSliceSum = Math.max(maxDoubleSliceSum, doubleSliceSum);
        }
        return maxDoubleSliceSum;
    }
}

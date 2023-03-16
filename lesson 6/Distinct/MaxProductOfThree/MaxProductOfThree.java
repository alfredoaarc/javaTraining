// empezar de 0

import java.util.Arrays;

public class Solution {
    public int solution(int[] arr) {
        Arrays.sort(arr);

        final int n = arr.length;
        final int last = arr[n - 1];

        final int first = arr[0];
        final int second = arr[1];

        int maxProduct1 = first * second * last;
        int maxProduct2 = arr[n - 3] * arr[n - 2] * last;

        return Math.max(maxProduct1, maxProduct2);
    }
}


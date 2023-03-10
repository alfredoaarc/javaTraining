import java.util.stream.IntStream;

class Solution {
    public int countDivisibleNumbersInRange(int start, int end, int divisor) {
        int[] range = createRange(start, end);
        return countDivisibleTimes(range, divisor);
    }

    public int[] createRange(int start, int end) {
        return IntStream.rangeClosed(start, end).toArray();
    }

    public int countDivisibleTimes(int[] range, int divisor) {
        int count = 0;
        for (int number : range) {
            if (number % divisor == 0) {
                count++;
            }
        }
        return count;
    }
}

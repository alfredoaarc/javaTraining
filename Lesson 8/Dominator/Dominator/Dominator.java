import java.util.Optional;
import java.util.stream.*;

public class Solution {
    public int solution(int[] array) {
        Optional<Integer> candidate = findCandidate(array);
        long count = candidate.map(c -> countOccurrences(array, c)).orElse(0L);
        return isDominator(count, array.length) ? findIndex(array, candidate.get()) : -1;
    }

    public Optional<Integer> findCandidate(int[] array) {
        return IntStream.of(array)
                .boxed()
                .distinct()
                .findFirst();
    }

    public long countOccurrences(int[] array, int candidate) {
        return IntStream.of(array)
                .filter(c -> c == candidate)
                .count();
    }

    public boolean isDominator(long count, int length) {
        return count > length / 2;
    }

    public int findIndex(int[] array, int candidate) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == candidate) {
                return i;
            }
        }
        return -1;
    }
}

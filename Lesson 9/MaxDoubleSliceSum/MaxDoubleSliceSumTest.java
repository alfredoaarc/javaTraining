import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class SolutionTest {
    
    private Solution solution = new Solution();

    @ParameterizedTest
    @MethodSource("doubleSliceScenarios")
    void testDoubleSlice(List<Integer> input, int expected) {
        int[] A = input.stream().mapToInt(i -> i).toArray();
        int result = solution.solution(A);
        assertEquals(expected, result);
    }

    private static Stream<Arguments> doubleSliceScenarios() {
        return Stream.of(
            Arguments.of(Arrays.asList(1, 2, 3, 4, 5), 0),
            Arguments.of(Arrays.asList(1, 2, 3, 0, 4, 5, 0, 6, 7), 18),
            Arguments.of(Arrays.asList(5, 0, 3, 0, 6, 0, 1, 2), 6),
            Arguments.of(Arrays.asList(3, 2, 6, -1, 4, 5, -1, 2), 17)
        );
    }

    @ParameterizedTest
    @MethodSource("maxDoubleSliceEndingsScenarios")
    void testMaxDoubleSliceEndings(List<Integer> input, int[] expected) {
        int[] A = input.stream().mapToInt(i -> i).toArray();
        int[] result = solution.calculateMaxDoubleSliceEndingsPublic(A);
        assertArrayEquals(expected, result);
    }

    private static Stream<Arguments> maxDoubleSliceEndingsScenarios() {
        return Stream.of(
            Arguments.of(Arrays.asList(1, 2, 3, 4, 5), new int[] {0, 0, 0, 0, 0}),
            Arguments.of(Arrays.asList(1, 2, 3, 0, 4, 5, 0, 6, 7), new int[] {0, 0, 0, 0, 4, 9, 0, 6, 13}),
            Arguments.of(Arrays.asList(5, 0, 3, 0, 6, 0, 1, 2), new int[] {0, 0, 3, 0, 6, 0, 1, 3}),
            Arguments.of(Arrays.asList(3, 2, 6, -1, 4, 5, -1, 2), new int[] {0, 3, 9, 8, 12, 17, 16, 18})
        );
    }

    @ParameterizedTest
    @MethodSource("maxDoubleSliceSumScenarios")
    void testMaxDoubleSliceSum(int[] maxDoubleSliceEndings, int expected) {
        int result = solution.findMaxDoubleSliceSumPublic(maxDoubleSliceEndings);
        assertEquals(expected, result);
    }

    private static Stream<Arguments> maxDoubleSliceSumScenarios() {
        return Stream.of(
            Arguments.of(new int[] {0, 0, 0, 0, 0}, 0),
            Arguments.of(new int[] {0, 0, 0, 0

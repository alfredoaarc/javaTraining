import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;


class SolutionTest {

    @Test
    void testOneNucleotide() {
        Solution solution = new Solution();
        String dnaSequence = "A";
        int[] startPositions = {0};
        int[] endPositions = {0};
        int[] expected = {2};
        int[] result = solution.dnaImpact(dnaSequence, startPositions, endPositions);
        assertArrayEquals(expected, result);
    }

    @Test
    void testAllNucleotides() {
        Solution solution = new Solution();
        String dnaSequence = "AGTA";
        int[] startPositions = {0, 1, 2, 3};
        int[] endPositions = {0, 1, 2, 3};
        int[] expected = {4, 3, 2, 1};
        int[] result = solution.dnaImpact(dnaSequence, startPositions, endPositions);
        assertArrayEquals(expected, result);
    }

    @Test
    void testOneQuery() {
        Solution solution = new Solution();
        String dnaSequence = "AGTAGAT";
        int[] startPositions = {2};
        int[] endPositions = {4};
        int[] expected = {3};
        int[] result = solution.dnaImpact(dnaSequence, startPositions, endPositions);
        assertArrayEquals(expected, result);
    }

    @Test
    void testDifferentQueries() {
        Solution solution = new Solution();
        String dnaSequence = "AGTTTA";
        int[] startPositions = {1, 2, 5};
        int[] endPositions = {2, 4, 6};
        int[] expected = {2, 3, 3};
        int[] result = solution.dnaImpact(dnaSequence, startPositions, endPositions);
        assertArrayEquals(expected, result);
    }



}

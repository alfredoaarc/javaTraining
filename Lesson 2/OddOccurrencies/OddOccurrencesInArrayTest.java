import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;

public class SolutionTest {

    @Test
    public void OneElementArray() {
        Solution solution = new Solution();
        int[] input = new int[] {3};
        int expectedOutput = 3;
        int actualOutput = solution.solution(input);
        assertEquals(expectedOutput, actualOutput);
    }


    @Test
    public void ArrayOddOccurrences() {
        Solution solution = new Solution();
        int[] input = new int[] {5, 8, 9, 1, 3, 2, 4};
        int expectedOutput = 5;
        int actualOutput = solution.solution(input);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void EmptyArray() {
        Solution solution = new Solution();
        int[] input = new int[] {};
        int expectedOutput = 0;
        int actualOutput = solution.solution(input);
        assertEquals(expectedOutput, actualOutput);
    }


}



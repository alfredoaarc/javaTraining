import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;


class SolutionTest {

    private Solution solution = new Solution();

    @Test
    void testIncreasing() {
        int[] H = {2, 3, 5, 8, 13, 21};
        int expected = 6;

        int result = solution.solution(H);

        assertEquals(expected, result);
    }

    @Test
    void testDecreasing() {
        int[] H = {34, 21, 13, 8, 5, 2};
        int expected = 6;

        int result = solution.solution(H);

        assertEquals(expected, result);
    }

    @Test
    void testConstantWall() {
        int[] H = {5, 5, 5, 5, 5};
        int expected = 1;

        int result = solution.solution(H);

        assertEquals(expected, result);
    }


}

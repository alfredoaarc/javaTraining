import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;

public class SolutionTest {

    @Test
    public void testSolutionOnePosition() {
        Solution solution = new Solution();
        int[] A = {1};
        int X = 1;
        int expected = 0;
        int result = solution.solution(X, A);
        assertEquals(expected, result);
    }

    @Test
    public void testSolutionEqualPosition() {
        Solution solution = new Solution();
        int[] A = {2, 2, 2, 2, 2};
        int X = 1;
        int expected = -1;
        int result = solution.solution(X, A);
        assertEquals(expected, result);
    }
}

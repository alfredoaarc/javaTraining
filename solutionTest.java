import java.util.Arrays;
import org.junit.Ignore;
import org.junit.Test;
//ask @Ignore
public class SolutionTest {
    private Solution solution = new Solution();

    @Ignore
    @Test
    public void testlInput() {
        int[] expectedOutput = {3, 2, 2, 4, 2};
        int[] input = {3, 4, 4, 6, 1, 4, 4};
        int N = 5;
        int[] output = solution.solution(N, input);
        assertArrayEquals(expectedOutput, output);
    }
    @Ignore
    @Test
    public void testPlusOne() {
        int[] input = {N+1, N+1, N+1, N+1};
        int[] expectedOutput = {0, 0, 0, 0, 0};
        int[] output = solution.solution(N, input);
        assertArrayEquals(expectedOutput, output);
    }

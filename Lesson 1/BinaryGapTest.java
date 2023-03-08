import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SolutionTest {
    
    @Test
    public void testSolutionWithBrecha() {
        Solution solution = new Solution();
        assertEquals(7, solution.solution(354));
        assertEquals(1, solution.solution(6));
        assertEquals(3, solution.solution(589));
    }
    
    @Test
    public void testSolutionWithNoBrecha() {
        Solution solution = new Solution();
        assertEquals(0, solution.solution(13));
        assertEquals(0, solution.solution(17));
    }
    
}

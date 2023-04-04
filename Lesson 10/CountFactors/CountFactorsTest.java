import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;


public class SolutionTest {
    
    
    @Test
    public void testSolution_withNEquals16() {
        Solution sol = new Solution();
        int result = sol.solution(16);
        assertEquals(5, result);
    }
    
    @Test
    public void testSolution_withNEquals21() {
        Solution sol = new Solution();
        int result = sol.solution(21);
        assertEquals(4, result);
    }
    
    @Test
    public void testSolution_withNEquals27() {
        Solution sol = new Solution();
        int result = sol.solution(27);
        assertEquals(4, result);
    }
}

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;


public class SolutionTest {

    @Test
    public void testSolutionFormsTriangle() {
        Solution solution = new Solution();
        int[] input = {3, 4, 5, 6, 7, 8};
        int expected = 1;
        
        int result = solution.solution(input);
        
        assertEquals(expected, result);
    }
    
    @Test
    public void testSolutionNotFormTriangle() {
        Solution solution = new Solution();
        int[] input = {1, 2, 4, 5, 8, 10};
        int expected = 0;
        
        int result = solution.solution(input);
        
        assertEquals(expected, result);
    }
    
}

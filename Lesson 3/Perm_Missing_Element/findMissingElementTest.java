import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;




public class SolutionTest {

    @Test
    public void testSolutionNegativeElements() {
        int[] A = {1, 2, 3, -1, 5, 6, 7, 8, -3, 11, 12, 13, 14};
        Solution solution = new Solution();
        
        int result = solution.solution(A);
        
        assertEquals(4, result);
    }

    @Test
    public void testSolutionOneElement() {
        int[] A = {10};
        Solution solution = new Solution();
        
        int result = solution.solution(A);
        
        assertEquals(2, result);
    }
    
    @Test
    public void testSolutionDifferentElements() {
        int[] A = {1, 8, 4, 5, 9, 6};
        Solution solution = new Solution();
        
        int result = solution.solution(A);
        
        assertEquals(2, result);
    }
}
    


    

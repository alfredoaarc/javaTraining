import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;

public class SolutionTest {
    @Test
    public void testSolutionWithBeginningDominator() {
        Solution s = new Solution();
        int[] array = {7, 3, 3, 2, 3, -1, 3, 3};
        assertEquals(0, s.solution(array));
    }
    
    @Test
    public void testSolutionWithMidDominator() {
        Solution s = new Solution();
        int[] array2 = {1, 2, 3, 4, 4, 4, 5};
        assertEquals(2, s.solution(array2));
    }
    
    
    @Test
    public void testSolutionWithoutDominator() {
        Solution s = new Solution();
        int[] array4 = {1, 1, 2, 2, 3, 3};
        assertEquals(-1, s.solution(array4));
    }
}

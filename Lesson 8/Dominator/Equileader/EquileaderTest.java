import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;


public class SolutionTest {
    

    
    @Test
    public void returnOne_GivenArrayWithOneEquiLeader() {
        int[] A = { 4, 4, 4, 4, 4, 1, 1, 1 };
        Solution solution = new Solution();
        int expected = 1;
        int result = solution.solution(A);
        assertEquals(expected, result);
    }
    
    @Test
    public void returnZero_GivenArrayWithNonValidEquiLeaders() {
        int[] A = { 1, 1, 1, 2, 2, 2, 3, 3, 3 };
        Solution solution = new Solution();
        int expected = 0;
        int result = solution.solution(A);
        assertEquals(expected, result);
    }
    
    @Test
    public void returnOne_GivenArrayWithValidEquiLeaders() {
        int[] A = { 2, 1, 2 };
        Solution solution = new Solution();
        int expected = 1;
        int result = solution.solution(A);
        assertEquals(expected, result);
    }

}

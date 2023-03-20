import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;


public class SolutionTest {
    
    @Test
    public void testSolutionBalanced() {
        Solution solution = new Solution();
        
        String input = "([])(){}";
        int expectedOutput = 1;
        
        int actualOutput = solution.solution(input);
        
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testSolutionUnbalanced() {
        Solution solution = new Solution();
        
        String input = "[(])";
        int expectedOutput = 0;
        
        int actualOutput = solution.solution(input);
        
        assertEquals(expectedOutput, actualOutput);
    }


    @Test
    public void testSolutionEmptyInput() {
        Solution solution = new Solution();
        
        String input = "";
        int expectedOutput = 1;
        
        int actualOutput = solution.solution(input);
        
        assertEquals(expectedOutput, actualOutput);
    }
}

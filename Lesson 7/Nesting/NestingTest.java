import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;


public class SolutionTest {

    @Test
    public void testBalancedBrackets() {
        Solution solution = new Solution();
        String input = "(){}[]";
        int result = solution.solution(input);
        assertEquals(1, result);
    }


    @Test
    public void testUnbalancedBrackets() {
        Solution solution = new Solution();
        String input = "({[)]}";
        int result = solution.solution(input);
        assertEquals(0, result);
    }



}

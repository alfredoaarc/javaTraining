import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;



@Test
public class SolutionTest {
    
    @Test
    public void testZeroDistance() {
        int X = 20;
        int Y = 20;
        int D = 3;
        Solution solution = new Solution();

        int jumps = solution.solution(X, Y, D);

        assertEquals(0, jumps);
    }
    
    

    @Test
    public void testExactDistance() {
        int X = 10;
        int Y = 40;
        int D = 5;
        Solution solution = new Solution();

        int jumps = solution.solution(X, Y, D);

        assertEquals(6, jumps);
    }




    @Test
    public void testNegativeDistance() {
        int X = 50;
        int Y = 20;
        int D = 6;
        Solution solution = new Solution();

        int jumps = solution.solution(X, Y, D);

        assertEquals(6, jumps);
    }
}

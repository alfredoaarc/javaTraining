import org.junit.Ignore;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void testCountDivisibleNumbers() {
        Solution solution = new Solution();

        assertEquals(0, solution.countDivisibleNumbers(2, 4, 6));

        assertEquals(1, solution.countDivisibleNumbers(2, 6, 5));

        assertEquals(2, solution.countDivisibleNumbers(5, 10, 1));
    }
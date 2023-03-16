import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;

public class SolutionTest {

    @Test
    public void testMaximalProductOfTriplet() {
        Solution solution = new Solution();
        int[] inputNumbers = {-10, -5, 0, 2, 4, 6, 8, 10};
        int expectedMaximalProduct = 800;

        int actualMaximalProduct = solution.solution(inputNumbers);

        assertEquals(expectedMaximalProduct, actualMaximalProduct);
    }
}

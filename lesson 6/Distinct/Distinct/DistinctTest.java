import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;


public class SolutionTest {

    @Test
    public void testDistinctValuesReturningTheCorrectOnes() {
        Solution solution = new Solution();
        int[] inputNumbers = {2, 4, 6, 8, 10, 12};
        int expectedDistinctValuesCount = 6;

        int actualDistinctValuesCount = solution.countDistinctValues(inputNumbers);

        assertEquals(expectedDistinctValuesCount, actualDistinctValuesCount);
    }
}

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;

public class SolutionTest {
    
    @Test
    public void testSolutionPositiveProfit() {
        int[] stockPrices = {10, 7, 15, 8, 12};
        int expectedProfit = 8;
        Solution stockProfit = new Solution();
        int resultProfit = stockProfit.calculateMaxProfit(stockPrices);
        assertEquals(expectedProfit, resultProfit);
    }
    
    @Test
    public void testSolutionNoProfit() {
        int[] stockPrices = {10, 8, 6, 4, 2};
        int expectedProfit = 0;
        Solution stockProfit = new Solution();
        int resultProfit = stockProfit.calculateMaxProfit(stockPrices);
        assertEquals(expectedProfit, resultProfit);
    }
    
}

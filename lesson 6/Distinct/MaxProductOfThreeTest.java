import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;

public class SolutionTest {

    @Test
    public void getMaximalProduct() {
        Solution solution = new Solution();
        int[] inputNumbers = {1, 2, 3, 4, 5};
        int expectedMaximalProduct = 60;

        int actualMaximalProduct = solution.getMaximalProduct(inputNumbers);

        assertEquals(expectedMaximalProduct, actualMaximalProduct);
    }



}

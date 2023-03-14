import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;

public class SolutionTest {
    
    
    @Test
    public void testArrayOneElement() {
        int[] nums = {1};
        int expectedIndex = 0;
        int actualIndex = new Solution().solution(nums);

        Assertions.assertEquals(expectedIndex, actualIndex);
    

    }


    @Test
    void TestIncreasingOrder() {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int expected = 0;

        int actual = new Solution().solution(nums);

        Assertions.assertEquals(expected, actual);
    }



    @Test
    void testMinimalAverageIndex() {
        int[] nums = {4, 2, 2, 5, 1, 5, 8};
        int expectedIndex = 1;
        int actualIndex = new Solution().solution(nums);

        Assertions.assertEquals(expectedIndex, actualIndex);
    }
}

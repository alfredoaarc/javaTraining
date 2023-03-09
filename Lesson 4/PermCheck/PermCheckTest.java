import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;

public class SolutionTest {
    Solution result = new Solution();

    
    @Test
    public void testRepeatElement() {
        int[] arr = {2, 2};
        int expected = 0;
        int actual = result.solution(arr);
        assertEquals(expected, actual);
    }
    
    @Test
    public void testPermutation() {
        int[] arr = {1, 2, 3, 4}; 
        int expected = 1;
        int actual = result.solution(arr);
        assertEquals(expected, actual);
    }
    
    @Test
    public void testNotPermutation() {
        int[] arr = {5, 8, 9}; 
        int expected = 0;
        int actual = result.solution(arr);
        assertEquals(expected, actual);
    }
    

}

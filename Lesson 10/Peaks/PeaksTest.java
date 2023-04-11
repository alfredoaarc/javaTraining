import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;


class SolutionTest {

    @Test
    void testEmptyArray() {
        int[] A = {};
        int expected = 0;
        int result = new Solution().solution(A);
        assertEquals(expected, result);
    }
    
    @Test
    void testOnePeak() {
        int[] A = {1, 5, 2};
        int expected = 1;
        int result = new Solution().solution(A);
        assertEquals(expected, result);
    }
    
    @Test
    void testDifferentPeaks() {
        int[] A = {3, 1, 5, 2, 7, 4, 6};
        int expected = 2;
        int result = new Solution().solution(A);
        assertEquals(expected, result);
    }
    
    @Test
    void testNoPeaks() {
        int[] A = {1, 2, 3, 4, 5};
        int expected = 0;
        int result = new Solution().solution(A);
        assertEquals(expected, result);
    }
    

    

}

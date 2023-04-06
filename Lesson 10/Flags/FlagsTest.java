import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;

public class SolutionTest {

 

    @Test
    public void givenArrayWithoutPeaks_whenSolution_thenReturnsZero() {
        int[] A = {1, 2, 3, 4, 5};
        int expectedFlags = 0;
        int resultFlags = new Solution().solution(A);
        assertEquals(expectedFlags, resultFlags);
    }

    @Test
    public void givenArrayWithOnePeak_whenSolution_thenReturnsOne() {
        int[] A = {3, 1, 5};
        int expectedFlags = 1;
        int resultFlags = new Solution().solution(A);
        assertEquals(expectedFlags, resultFlags);
    }

    @Test
    public void givenArrayWithMultiplePeaks_whenSolution_thenReturnsTwo() {
        int[] A = {2, 6, 3, 7, 5, 1, 8};
        int expectedFlags = 2;
        int resultFlags = new Solution().solution(A);
        assertEquals(expectedFlags, resultFlags);
    }

        
    @Test
    public void givenEmptyArray_whenSolution_thenReturnsZero() {
        int[] A = {};
        int expectedFlags = 0;
        int resultFlags = new Solution().solution(A);
        assertEquals(expectedFlags, resultFlags);
    
    }

    

}

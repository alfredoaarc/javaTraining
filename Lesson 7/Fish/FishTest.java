import org.junit.Test;
import static org.junit.Assert.*;

public class SolutionTest {

    private Solution s = new Solution();

    @Test
    public void empty() {
        int[] A = {};
        int[] B = {};
        int expected = 0;
        int actual = s.solution(A, B);
        assertEquals(expected, actual);
    }


    @Test
    public void sameDirection() {
        int[] A = {4, 3, 2, 1};
        int[] B = {1, 1, 1, 1};
        int expected = 4;
        int actual = s.solution(A, B);
        assertEquals(expected, actual);
    }

    @Test
    public void eatEachOther() {
        int[] A = {4, 3, 2, 1, 5};
        int[] B = {0, 1, 0, 0, 0};
        int expected = 2;
        int actual = s.solution(A, B);
        assertEquals(expected, actual);
    }

    @Test
    public void notEatEachOther() {
        int[] A = {4, 3, 2, 1, 5};
        int[] B = {0, 1, 1, 0, 0};
        int expected = 5;
        int actual = s.solution(A, B);
        assertEquals(expected, actual);
    }
}

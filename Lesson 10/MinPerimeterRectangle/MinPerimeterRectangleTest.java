import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SolutionTest {
    @Test
    public void testAreaTwo() {
        Solution solution = new Solution();

        int area = 2;
        int expectedPerimeter = 6;

        int actualPerimeter = solution.getMinPerimeterForArea(area);

        Assertions.assertEquals(expectedPerimeter, actualPerimeter);
    }

    @Test
    public void testAreaNine() {
        Solution solution = new Solution();

        int area = 9;
        int expectedPerimeter = 12;

        int actualPerimeter = solution.getMinPerimeterForArea(area);

        Assertions.assertEquals(expectedPerimeter, actualPerimeter);
    }

    @Test
    public void testTwentyFour() {
        Solution solution = new Solution();

        int area = 24;
        int expectedPerimeter = 20;

        int actualPerimeter = solution.getMinPerimeterForArea(area);

        Assertions.assertEquals(expectedPerimeter, actualPerimeter);
    }
}

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.assertEquals;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
@Test
@DisplayName("smallest positive integer with negative int")
public void smallestpositiveintegerwithnegativeint() {
    Solution solution = new Solution();
    int[] A = {-2, -4};
    int expectedResult = 1;
    int actualResult = solution.solution(A);
    assertEquals(expectedResult, actualResult);
}


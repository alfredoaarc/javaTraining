import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;

public class SolutionTest {
  
  @Test
  public void ShiftFactor_whenSolution_ArrayShifted() {
    Solution solution = new Solution();
    
    int K = 2;
    int[] A = {4, 1, 3, 7, 9};
    int[] expected = {5, 8, 9, 1, 3};
    
    int[] result = solution.solution(A, K);
    
    assertArrayEquals(result, expected);
  }
  
  @Test
  public void EmptyArray_whenSolution_ArrayNotShifted() {
    Solution solution = new Solution();
    
    int[] A = {};
    int K = 3;
    int[] expected = {};
    
    int[] result = solution.solution(A, K);
    
    assertArrayEquals(expected, result);
  }
  
  @Test
  public void ArrayWithOneElement_whenSolution_ArrayNotShifted() {
    Solution solution = new Solution();
    
    int[] A = {5};
    int K = 8;
    int[] expected = {9};
    
    int[] result = solution.solution(A, K);
    
    assertArrayEquals(expected, result);
  }
  
}

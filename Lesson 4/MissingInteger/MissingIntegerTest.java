import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

public class SmallestPositiveIntegerTest {

    @Test
    public void testSmallestPositiveIntegerNegative() {
        int[] numbers = {-5, -8, -9, -1};
        int expected = 1;

        SmallestPositiveInteger smallestPositiveInteger = new SmallestPositiveInteger();
        int actual = smallestPositiveInteger.smallestPositiveInteger(numbers);

        assertEquals(expected, actual);
    }
    
    
    @Test
    public void testSmallestPositiveInteger() {
        int[] numbers = {5, 8, 9, 4, 1, 2};
        int expected = 3;

        SmallestPositiveInteger smallestPositiveInteger = new SmallestPositiveInteger();
        int actual = smallestPositiveInteger.smallestPositiveInteger(numbers);

        assertEquals(expected, actual);
    }



}

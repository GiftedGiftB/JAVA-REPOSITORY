package arraysTest;

import Arrays.SmallestNumber;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SmallestNumberTest {

    @Test
    public void testThatYouCanGetSmallestNumber() {
        SmallestNumber smallestNumber = new SmallestNumber();
        int[] numbers = {23,42,10,5};
        int[] result = smallestNumber.smallestNumberInArray(numbers);
        int expected = 5;
        assertEquals(expected,result[0]);
    }
}

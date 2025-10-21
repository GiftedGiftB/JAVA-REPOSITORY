package arraysTest;

import Arrays.SumArray;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SumArrayTest {

    @Test
    public void testThatArrayReturnsSum(){
        SumArray sumArray = new SumArray();
        int[] numbers = {1,2,3,4,5};
        int[] result = sumArray.sumAllArrayElement(numbers);
        int outCome = 0;
        for (int value : result) {
            outCome = value;
        }
        int expected = 15;
        assertEquals(expected, outCome);
    }
}

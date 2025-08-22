package calculatorTest;
import org.junit.Test;
import calculatorPack.Calculator;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


public class CalculatorTest {

//    @Test
//    public void testThatCalculatorCanAdd_2(){
//        Calculator calculator = new Calculator();
//        calculator.add(10, 20);
//        assertEquals(30, calculator.add(10, 20));
//    }

    @Test
    public void testThatCalculatorCanAdd(){
        int result = Calculator.add(3, 7);
        assertEquals(10, result);
    }

    @Test
    public void testThatCalculatorCanSubtract(){
        int result = Calculator.subtract(10,2);
        assertEquals(8, result);
    }
    @Test
    public void testThatCalculatorCanMultiply(){
        int result = Calculator.multipply(10,2);
        assertEquals(20, result);
    }
    @Test
    public void testThatCalculatorCanDivide(){
        int result = Calculator.divide(10, 2);
        assertEquals(5, result);
    }

    @Test
    public void testThatCalculator_returnsTrueIfNumberIsEven(){
        boolean result = Calculator.evenNumber(4);
        assertTrue(result);
    }

}

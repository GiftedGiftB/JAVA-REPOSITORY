package calculatorTest;
import org.junit.Test;
import calculatorPack.Calculator;

import static org.junit.Assert.assertEquals;


public class CalculatorTest {

//    @Test
//    public void testThatCalculatorCanAdd(){
//        int result = Calculator.add(3, 7);
//        assertEquals(10, result);
//    }

    @Test
    public void testThatCalculatorCanAdd_2(){
        Calculator calculator = new Calculator();
        calculator.add(10, 20);
        assertEquals(30, calculator.add(10, 20));
    }

}

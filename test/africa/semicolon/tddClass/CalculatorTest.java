package africa.semicolon.tddClass;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    @Test
    public void testThatCalculatorCanAdd(){
        //given
        Calculator myCalculator = new Calculator();
        //when
        int result = myCalculator.add(11,10);

        //check / assert
        assertEquals(21, result);

    }
    @Test
    public void testThatCalculatorMultiply(){
        //given
        Calculator myCalculator = new Calculator();
        //when
        int product = myCalculator.multiply(4,5);
        //confirm
        assertEquals(20, product);
    }
    @Test
    public void testThatCalculatorSubtract(){
        //given
        Calculator myCalculator = new Calculator();
        //when
        int subtract = myCalculator.subtract(7,3);
        //check
        assertEquals(4, subtract);
    }
    @Test
    public void testThatCalculatorDivide(){
        //given
        Calculator myCalculator = new Calculator();
        //when
        int divide = myCalculator.divide(9,3);
        //check
        assertEquals(3, divide);


    }



}

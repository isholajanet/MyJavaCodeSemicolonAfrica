package africa.semicolon.chapterFour;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FactorialTest {
    Factorial factorial;
    @BeforeEach
    public void runBeforeEachTest(){
        factorial = new Factorial();
    }
    @Test
    public void testThatSystemCanAcceptANumber(){
        factorial.setNumber(12);
        assertEquals(12, factorial.getNumber());
    }
    @Test
    public void testThatSystemCanDisplayTheFactorialOfANonNegativeInteger(){
        assertEquals(720, factorial.getTheFactorialOf(6));
    }
}

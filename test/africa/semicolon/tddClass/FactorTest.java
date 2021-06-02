package africa.semicolon.tddClass;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FactorTest {
    Factor factor;
    @BeforeEach
    public void runBeforeEachTest(){
        factor = new Factor();
    }
    @Test
    public void testThatSystemCanGetFactorsOfNumbers(){
        assertEquals("1,2,3,4,6,12,", factor.getFactorsOfNumbers(12));
    }
}

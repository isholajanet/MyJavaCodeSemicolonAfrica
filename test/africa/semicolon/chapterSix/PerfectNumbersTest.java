package africa.semicolon.chapterSix;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PerfectNumbersTest {

    @Test
    public void testThatMySystemCanGetFactors(){
        assertEquals("1 2 3 4 6 8 12 ", PerfectNumbers.getFactor(24));
    }
    @Test
    public void testToGetSumOfAllFactors(){
        assertEquals(36, PerfectNumbers.sumOfFactors(24));
    }
    @Test
    public void testToCheckIfANumberIsPerfect(){
        assertEquals(true, PerfectNumbers.isPerfect(6));
    }


}

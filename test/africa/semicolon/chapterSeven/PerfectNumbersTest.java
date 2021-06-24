package africa.semicolon.chapterSeven;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PerfectNumbersTest {
    @Test
    void testThatSystemCanGetFactors(){
        assertEquals("2 3 4 6 8 12 ", PerfectNumbers.getFactorsOf(24));
    }

    @Test
    void testThatSystemCanAddUpFactorsOfANumber(){
        assertEquals(36, PerfectNumbers.addFactorsOf(24));
    }
    @Test
    void testThatSystemCanCheckIfANumberIsAPerfectNumber(){
        assertTrue(PerfectNumbers.checkIfItsAPerfectNumber(6));
    }
    @Test
    void testThatSystemCanCheckIfANumberIsNotAPerfectNumber(){
        assertFalse(PerfectNumbers.checkIfItsAPerfectNumber(26));
    }
    @Test
    void testThatSystemCanCheckForThePerfectNumbersBetween1And1000(){
        assertEquals("6 28 496 ", PerfectNumbers.perfectNumbersBetween1And1000());
    }
}

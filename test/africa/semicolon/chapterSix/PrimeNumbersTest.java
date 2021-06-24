package africa.semicolon.chapterSix;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PrimeNumbersTest {
    @Test
    void testThatSystemCanCheckWhetherANumberIsAPrimeNumber(){
        assertTrue(PrimeNumbers.isPrimeNumber(7));
    }

    @Test
    void testThatSystemCanCheckWhetherANumberIsNotAPrimeNumber(){
        assertFalse(PrimeNumbers.isPrimeNumber(8));
    }
}

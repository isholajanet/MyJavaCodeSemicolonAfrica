package africa.semicolon.chapterSix;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ExponentTest {
    @Test
    void testThatSystemCanCalculateIntegerPower(){
        assertEquals(81, Exponent.calculateExponent(3, 4));
    }
}

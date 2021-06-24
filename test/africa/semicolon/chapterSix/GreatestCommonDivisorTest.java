package africa.semicolon.chapterSix;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GreatestCommonDivisorTest {
    @Test
    void testThatSystemCanGetGreatestCommonDivisor(){
        assertEquals(4, GreatestCommonDivisor.getGreatestCommonDivisor(12,16));
    }
}

package africa.semicolon.chapterSix;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SeparatingDigitTest {
    @Test
    void testThatSystemCanGetTheIntegerPartOfADivision(){
        assertEquals(6, SeparatingDigit.getTheIntegerPart(63, 10));
    }

    @Test
    void testThatSystemCanGetTheRemainderPartOfADivision(){
        assertEquals(3, SeparatingDigit.getTheRemainderPart(63, 10));
    }
    @Test
    void testThatSystemCanSeparateDigits(){
        assertEquals("9 8 5 6 7 ", SeparatingDigit.displayDigits(98567));
    }

    @Test
    void testThatSystemCannotSeparateDigitsGreaterThan999999(){
        assertEquals("0", SeparatingDigit.displayDigits(985679));
    }

}

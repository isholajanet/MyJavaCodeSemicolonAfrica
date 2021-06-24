package africa.semicolon.chapterSix;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReverseDigitTest {
    @Test
    void testThatSystemCanReverseADigit(){
        assertEquals("78091", ReverseDigit.reverseDigit(19087));
    }
}

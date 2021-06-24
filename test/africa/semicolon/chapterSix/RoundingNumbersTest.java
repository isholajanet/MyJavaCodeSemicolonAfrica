package africa.semicolon.chapterSix;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RoundingNumbersTest {
    @Test
    public void testThatSystemCanRoundUpNumbers(){
        assertEquals(30, RoundingNumbers.RoundUpToInteger(29.5));
    }
}

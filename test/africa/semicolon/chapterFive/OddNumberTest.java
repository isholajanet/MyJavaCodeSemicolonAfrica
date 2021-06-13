package africa.semicolon.chapterFive;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OddNumberTest {
    OddNumber oddNumber;
    @BeforeEach
    public void runBeforeEachTest(){
        oddNumber = new OddNumber();
    }

    @Test
    public void testToCalculateTheResultOfProductOfOddNumbersBetween1To15(){
        assertEquals(2027025, oddNumber.getProduct());
    }
}

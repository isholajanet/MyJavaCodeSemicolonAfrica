package africa.semicolon.chapterSix;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class EvenOrOddTest {
    @Test
    void testThatSystemCanCheckIfAnIntegerIsAnEvenNumber(){
        assertTrue(EvenOrOdd.isEven(6));
    }

    @Test
    void testThatSystemCanCheckIfAnIntegerIsAnOddNumber(){
        assertFalse(EvenOrOdd.isEven(9));
    }

}

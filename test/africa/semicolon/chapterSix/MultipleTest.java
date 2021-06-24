package africa.semicolon.chapterSix;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MultipleTest {
    @Test
    void testThatSystemCanGetTheMultiplesOfANumber(){
        assertEquals("2 4 6 8 10 ", Multiple.getMultipleOf(2));
    }
    @Test
    void testThatSystemCanCheckIfANumberIsAMultipleOfTheOtherNumber(){
        assertEquals(true, Multiple.checkIfItIsAMultiple(5, 15));
    }
    @Test
    void testThatSystemCanCheckIfANumberIsNotAMultipleOfTheOtherNumber(){
        assertEquals(false, Multiple.checkIfItIsAMultiple(2, 15));
    }
}

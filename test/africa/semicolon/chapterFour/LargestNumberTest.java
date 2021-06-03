package africa.semicolon.chapterFour;

import africa.semicolon.chapterFour.deitelExercises.LargestNumber;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LargestNumberTest {
    LargestNumber largestNumber;
    @BeforeEach
    public void runThisBeforeEachTest(){
        largestNumber = new LargestNumber();
    }
    @Test
    public void testThatSystemCanSetNumber(){
        largestNumber.setNumber(12);
        assertEquals(12,largestNumber.getNumber());
    }
    @Test
    public void testThatSystemCanGetTheHighestNumberBetween10Numbers(){

        assertEquals(98, largestNumber.getTheLargestNumberBetweenTenNumbers(76,34,78,12,78,98,23,23,54,3,45,23,43,2,34,21,54,45));

    }
}


package africa.semicolon.chapterFive;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SmallestValueTest {
    SmallestValue smallestValue;
    @BeforeEach
    public void runThisBeforeEachTest(){
        smallestValue = new SmallestValue();
    }
    @Test
    public void testThatSystemCanCheckTheSmallestNumber(){
        assertEquals(10, smallestValue.smallestValueIs(50,70,94,89,10,34,28,18,15,32,85));
    }
}

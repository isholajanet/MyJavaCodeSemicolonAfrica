package africa.semicolon.chapterFour;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class InfiniteTest {
    Infinite infinite;
    @BeforeEach
    public void runThisBeforeEachTest(){
        infinite = new Infinite();
    }
    @Test
    public void testThatSystemCanSetInteger(){
        infinite.setInteger(2);
        assertEquals(2, infinite.getInteger());
    }

    @Test
    public void testThatSystemCanGetMultiplesOf2(){
        assertEquals("2 4 6 8 10 12 14 16 18 20 22 24 26 28 30 ", infinite.getMultiples(2));
    }
}

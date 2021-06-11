package africa.semicolon.chapterFour;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SideOfATriangleTest {
    SideOfATriangle sideOfATriangle;
    @BeforeEach
    public void runBeforeEachTest(){
        sideOfATriangle = new SideOfATriangle();
    }
    @Test
    public void testThatSystemCanSetNumber(){
        sideOfATriangle.setNumber(3);
        assertEquals(3, sideOfATriangle.getNumber());
    }
    @Test
    public void testThatSystemCanSetOnlyPositiveNumber(){
        sideOfATriangle.setNumber(-3);
        assertEquals(0,sideOfATriangle.getNumber());
    }
    @Test
    public void testThatSystemCanCountTheNumberOfDigit(){
        assertEquals(3, sideOfATriangle.getTheCountOfDigit(123));
    }
}

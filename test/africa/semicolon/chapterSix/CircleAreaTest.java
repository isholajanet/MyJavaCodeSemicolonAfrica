package africa.semicolon.chapterSix;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CircleAreaTest {
    @Test
    void testThatSystemCanCalculateTheAreaOfACircle(){
        assertEquals(154.0, CircleArea.calculateAreaOf(7.0));
    }
}

package africa.semicolon.chapterSix;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HypotenuseTest {
    @Test
    void testThatSystemCanCalculateHypotenuse(){
        assertEquals(5.0, Hypotenuse.calculateHypotenuse(3.0, 4.0));
    }
    @Test
    void testThatSystemCanCalculateHypotenuseForTriangle2(){
        assertEquals(13.0, Hypotenuse.calculateHypotenuse(5.0, 12.0));
    }
    @Test
    void testThatSystemCanCalculateHypotenuseForTriangle3(){
        assertEquals(17.0, Hypotenuse.calculateHypotenuse(8.0, 15.0));
    }
}

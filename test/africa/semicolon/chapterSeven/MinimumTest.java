package africa.semicolon.chapterSeven;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MinimumTest {
    @Test
    void testThatSystemToReturnTheSmallest(){
        assertEquals(234.85f, Minimum.getSmallestOf(234.85f, 342.45f, 569.12f));
    }

}

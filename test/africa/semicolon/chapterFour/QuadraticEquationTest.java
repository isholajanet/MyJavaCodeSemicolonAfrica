package africa.semicolon.chapterFour;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class QuadraticEquationTest {
    QuadraticEquation quadraticEquation;
    @BeforeEach
    public void RunThisBeforeTest(){
        quadraticEquation = new QuadraticEquation(2, 3,4);
    }
    @Test
    public void testToCalculateQuadraticEquation(){
        assertEquals(-1.0, quadraticEquation.calculateQuadraticEquationFirstValue(2, 4, 2));

    }
    @Test
    public void testToCalculateQuadraticEquationSecondValue(){
        assertEquals(-1.0, quadraticEquation.calculateQuadraticEquationSecondValue(2, 4, 2));

    }

}

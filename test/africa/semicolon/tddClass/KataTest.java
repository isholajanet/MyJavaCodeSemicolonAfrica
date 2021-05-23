package africa.semicolon.tddClass;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class KataTest {
    @Test
    public void testThatGradeCanBeSet(){
        Kata myGrade = new Kata();
        myGrade.setGrade(90);
        assertEquals(90, myGrade.getGrade());
    }
    @Test
    public void testThatGradeWillBeDisplayedIfTheGradeNumberIsSet(){
        Kata myGrade =  new Kata();
        myGrade.setGrade(50);
        myGrade.displayGrade();
        assertEquals(50, myGrade.getGrade());

    }
}

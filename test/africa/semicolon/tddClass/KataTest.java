package africa.semicolon.tddClass;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class KataTest {
    @Test
    public void testThatGradeIsAIfScoreIsGreaterThanOrEqualTo90(){
        Kata myGrade = new Kata();
        assertEquals("A", myGrade.displayGrade(90));
    }
    @Test
    public void testThatGradeIsBIfScoreIsGreaterThanOrEqualTo80(){
        Kata myGrade = new Kata();
        assertEquals("B", myGrade.displayGrade(80));
    }
    @Test
    public void testThatGradeIsCIfScoreIsGreaterThanOrEqualTo70(){
        Kata myGrade = new Kata();
        assertEquals("C", myGrade.displayGrade(70));
    }
    @Test
    public void testThatGradeIsDIfScoreIsGreaterThanOrEqualTo60(){
        Kata myGrade = new Kata();
        assertEquals("D", myGrade.displayGrade(60));
    }
    @Test
    public void testThatGradeIsFIfScoreIsLessThan60(){
        Kata myGrade = new Kata();
        assertEquals("F", myGrade.displayGrade(50));
    }



    }


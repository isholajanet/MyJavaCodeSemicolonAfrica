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

    @Test
    public void testThatUnitPriceIs1500IfTheNumbersOfCopiesIsInBetween1To4(){
        Kata price = new Kata();
        assertEquals(1500, price.displayTotalPrice(2));
    }
    @Test
    public void testThatUnitPriceIs1400IfTheNumbersOfCopiesIsBetween5To9(){
        Kata price = new Kata();
        assertEquals(1400, price.displayTotalPrice(5));
    }
    @Test
    public void testThatUnitPriceIs1200IfTheNumbersOfCopiesIsBetween10To29(){
        Kata price = new Kata();
        assertEquals(1200, price.displayTotalPrice(28));
    }
    @Test
    public void testThatUnitPriceIs1100IfTheNumbersOfCopiesIsBetween30To49(){
        Kata price = new Kata();
        assertEquals(1100, price.displayTotalPrice(40));
    }
    @Test
    public void testThatUnitPriceIs1000IfTheNumbersOfCopiesIsBetween50To99(){
        Kata price = new Kata();
        assertEquals(1000, price.displayTotalPrice(90));
    }
    @Test
    public void testThatUnitPriceIs900IfTheNumbersOfCopiesIsBetween100To199(){
        Kata price = new Kata();
        assertEquals(900, price.displayTotalPrice(100));
    }
    @Test
    public void testThatUnitPriceIs800IfTheNumbersOfCopiesIs200AndAbove(){
        Kata price = new Kata();
        assertEquals(800, price.displayTotalPrice(203));
    }



    }


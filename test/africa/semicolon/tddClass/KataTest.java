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
        assertEquals(3000, price.displayTotalPrice(2));
    }
    @Test
    public void testThatUnitPriceIs1400IfTheNumbersOfCopiesIsBetween5To9(){
        Kata price = new Kata();
        assertEquals(7000, price.displayTotalPrice(5));
    }
    @Test
    public void testThatUnitPriceIs1200IfTheNumbersOfCopiesIsBetween10To29(){
        Kata price = new Kata();
        assertEquals(33600, price.displayTotalPrice(28));
    }
    @Test
    public void testThatUnitPriceIs1100IfTheNumbersOfCopiesIsBetween30To49(){
        Kata price = new Kata();
        assertEquals(44000, price.displayTotalPrice(40));
    }
    @Test
    public void testThatUnitPriceIs1000IfTheNumbersOfCopiesIsBetween50To99(){
        Kata price = new Kata();
        assertEquals(80000, price.displayTotalPrice(80));
    }
    @Test
    public void testThatUnitPriceIs900IfTheNumbersOfCopiesIsBetween100To199(){
        Kata price = new Kata();
        assertEquals(90000, price.displayTotalPrice(100));
    }
    @Test
    public void testThatUnitPriceIs800IfTheNumbersOfCopiesIs200AndAbove(){
        Kata price = new Kata();
        assertEquals(162400, price.displayTotalPrice(203));
    }

    @Test
    public void testToGetTheProfitForNumberOfCopiesInBetween1To4(){
        Kata price = new Kata();
        assertEquals(2000, price.displayProfit(4));
    }

    @Test
    public void testToGetTheProfitForNumberOfCopiesInBetween5To9(){
        Kata price = new Kata();
        assertEquals(4800, price.displayProfit(8));
    }

    @Test
    public void testToGetTheProfitForNumberOfCopiesInBetween10To29(){
        Kata price = new Kata();
        assertEquals(8000, price.displayProfit(10));
    }

    @Test
    public void testToGetTheProfitForNumberOfCopiesInBetween30To49(){
        Kata price = new Kata();
        assertEquals(36000, price.displayProfit(40));
    }

    @Test
    public void testToGetTheProfitForNumberOfCopiesInBetween50To99(){
        Kata price = new Kata();
        assertEquals(60000, price.displayProfit(60));
    }

    @Test
    public void testToGetTheProfitForNumberOfCopiesInBetween100To199(){
        Kata price = new Kata();
        assertEquals(132000, price.displayProfit(120));
    }
    @Test
    public void testToGetTheProfitForNumberOfCopiesFor200AndAbove(){
        Kata price = new Kata();
        assertEquals(242400, price.displayProfit(202));
    }
    @Test
    public void testToReturnFactorCount(){
        Kata factor = new Kata();
        assertEquals(4, factor.returnFactorCount(10));
    }
    @Test
    public void testToReverseNumbers(){
        Kata kata = new Kata();
        assertEquals("56789", kata.getReverse(98765));
    }
    @Test
    public void testToReverseNumbersUsingLoop(){
        Kata kata = new Kata();
        assertEquals("456789", kata.getReverseUsingLoop(987654));
    }
    @Test
    public void testToGetFactorial(){
        Kata kata = new Kata();
        assertEquals(720, kata.findFactorialOf(6));
    }

    }


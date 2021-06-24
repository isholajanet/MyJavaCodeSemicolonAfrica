package africa.semicolon.tddClass;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class KataTest {
    @Test
    public void testThatGradeIsAIfScoreIsGreaterThanOrEqualTo90() {
        assertEquals("A", Kata.displayGrade(90));
    }

    @Test
    public void testThatGradeIsBIfScoreIsGreaterThanOrEqualTo80() {
        assertEquals("B", Kata.displayGrade(80));
    }

    @Test
    public void testThatGradeIsCIfScoreIsGreaterThanOrEqualTo70() {
        assertEquals("C", Kata.displayGrade(70));
    }

    @Test
    public void testThatGradeIsDIfScoreIsGreaterThanOrEqualTo60() {
        assertEquals("D", Kata.displayGrade(60));
    }

    @Test
    public void testThatGradeIsFIfScoreIsLessThan60() {
        assertEquals("F", Kata.displayGrade(50));
    }

    @Test
    public void testThatUnitPriceIs1500IfTheNumbersOfCopiesIsInBetween1To4() {
        assertEquals(3000, Kata.displayTotalPrice(2));
    }

    @Test
    public void testThatUnitPriceIs1400IfTheNumbersOfCopiesIsBetween5To9() {
        assertEquals(7000, Kata.displayTotalPrice(5));
    }

    @Test
    public void testThatUnitPriceIs1200IfTheNumbersOfCopiesIsBetween10To29() {
        assertEquals(33600, Kata.displayTotalPrice(28));
    }

    @Test
    public void testThatUnitPriceIs1100IfTheNumbersOfCopiesIsBetween30To49() {
        assertEquals(44000, Kata.displayTotalPrice(40));
    }

    @Test
    public void testThatUnitPriceIs1000IfTheNumbersOfCopiesIsBetween50To99() {
        assertEquals(80000, Kata.displayTotalPrice(80));
    }

    @Test
    public void testThatUnitPriceIs900IfTheNumbersOfCopiesIsBetween100To199() {
        assertEquals(90000, Kata.displayTotalPrice(100));
    }

    @Test
    public void testThatUnitPriceIs800IfTheNumbersOfCopiesIs200AndAbove() {
        assertEquals(162400, Kata.displayTotalPrice(203));
    }

    @Test
    public void testToGetTheProfitForNumberOfCopiesInBetween1To4() {
        assertEquals(2000, Kata.displayProfit(4));
    }

    @Test
    public void testToGetTheProfitForNumberOfCopiesInBetween5To9() {
        assertEquals(4800, Kata.displayProfit(8));
    }

    @Test
    public void testToGetTheProfitForNumberOfCopiesInBetween10To29() {
        assertEquals(8000, Kata.displayProfit(10));
    }

    @Test
    public void testToGetTheProfitForNumberOfCopiesInBetween30To49() {
        assertEquals(36000, Kata.displayProfit(40));
    }

    @Test
    public void testToGetTheProfitForNumberOfCopiesInBetween50To99() {
        assertEquals(60000, Kata.displayProfit(60));
    }

    @Test
    public void testToGetTheProfitForNumberOfCopiesInBetween100To199() {
        assertEquals(132000, Kata.displayProfit(120));
    }

    @Test
    public void testToGetTheProfitForNumberOfCopiesFor200AndAbove() {
        assertEquals(242400, Kata.displayProfit(202));
    }

    @Test
    public void testToReturnFactorCount() {
        assertEquals(4, Kata.returnFactorCount(10));
    }

    @Test
    public void testToReverseNumbers() {
        assertEquals("56789", Kata.getReverse(98765));
    }

    @Test
    public void testToReverseNumbersUsingLoop() {
        assertEquals("456789", Kata.getReverseUsingLoop(987654));
    }

    @Test
    public void testToGetFactorial() {
        assertEquals(720, Kata.findFactorialOf(6));
    }

    @Test
    public void testToGetBinary() {
        assertEquals("1010", Kata.findBinaryOf(10));
    }

    @Test
    public void testToConvertToAnyBase() {
        assertEquals("12", Kata.ConvertNumberToBase(10, 8));
    }

    @Test
    public void testToGetMaximumNumberInAnArrayList(){
        int[] numbers = {12,34,56,78,90,32,54,65,76,98};
        assertEquals(98, Kata.getMaximumNumber(numbers));
    }

    @Test
    public void testToGetMinimumNumberInAnArrayList(){
        int[] numbers = {12,34,56,78,90,32,54,65,76,98};
        assertEquals(12, Kata.getMinimumNumber(numbers));
    }
    @Test
    public void testToGetAverageOfAnArrayList(){
        int[] numbers = {12,34,56,78,90,32,54,65,76,98};
        assertEquals(59.5, Kata.getAverage(numbers));
    }

    @Test
    void testThatSystemCanGetTheSumOfAnArray(){
        int[] numbers = {12,34,56,78,90,32,54,76,98};
        assertEquals(530, Kata.sumOf(numbers));
    }

    @Test
    void testThatSystemCanGetMaximumOfTheSumOfElementInAnArray(){
        int[] numbers = {12,34,56,78,32,45,67,65,11,23};
        assertEquals(412, Kata.maximumOfSum(numbers));
    }

    @Test
    void testThatSystemCanGetMinimumOfTheSumOfElementInAnArray(){
        int[] numbers = {12,34,56,78,32,45,67,65,11,23};
        assertEquals(345, Kata.minimumOfSum(numbers));
    }

}


package africa.semicolon.chapterFour;

import africa.semicolon.chapterFour.deitelExercises.SalaryCalculator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SalaryCalculatorTest {
    SalaryCalculator employeeSalaryCalculator;
    @BeforeEach
    public void runThisBeforeEachTest(){
        employeeSalaryCalculator = new SalaryCalculator();
    }

    @Test
    public void testThatSystemCanCalculateSalary(){
        int hourlyWork = 2;
        int hourlyPayRate = 200;
        assertEquals(400.00, employeeSalaryCalculator.calculateGrossPay(hourlyWork, hourlyPayRate));
    }

}

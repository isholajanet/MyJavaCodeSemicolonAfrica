package africa.semicolon.chapterThree;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EmployeeTest {
    Employee myEmployee;
    @BeforeEach
    public void RunThisBeforeAllTest(){
        myEmployee = new Employee("Janet", "Ishola", 3000.00);
    }
    @Test
    public void testThatEmployeeCanSetEmployeeFirstName(){
        myEmployee.setEmployeeFirstName("Janet");
        assertEquals("Janet", myEmployee.getEmployeeFirstName());
    }
    @Test
    public void testThatEmployeeCanSetEmployeeLastName(){
        myEmployee.setEmployeeLastName("Ishola");
        assertEquals("Ishola", myEmployee.getEmployeeLastName());
    }
    @Test
    public void testThatEmployeeBalanceCanBeSet(){
        myEmployee.setEmployeeSalary(4000.00);
        assertEquals(4000.00, myEmployee.getEmployeeSalary());

    }
    @Test
    public void testThatIfMonthlySalaryIsNegativeItShouldNotBeSet(){
        myEmployee.setEmployeeSalary(-4000.00);
        assertEquals(0.0, myEmployee.getEmployeeSalary());
    }
    @Test
    public void testToDisplayTwoEmployeeYearlySalary(){
        myEmployee = new Employee("Janet", "Ishola", 3000.00);
        myEmployee.yearlySalary();
        assertEquals(36000, myEmployee.getEmployeeSalary());
        myEmployee = new Employee("Oladunni", "Olayemi", 4000.00);
        myEmployee.yearlySalary();
        assertEquals(48000, myEmployee.getEmployeeSalary());

    }
    @Test
    public void testToGiveEachEmployeeATenPercentRaise(){
        myEmployee = new Employee("Janet", "Ishola", 3000.00);
        myEmployee.yearlySalary();
        myEmployee.BonusSalary();
        assertEquals(39600, myEmployee.getEmployeeSalary());
        myEmployee = new Employee("Oladunni", "Olayemi", 4000.00);
        myEmployee.yearlySalary();
        myEmployee.BonusSalary();
        assertEquals(52800, myEmployee.getEmployeeSalary());

    }

}

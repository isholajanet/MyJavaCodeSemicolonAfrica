package africa.semicolon.chapterNine.Employee;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {
    private CommissionEmployee comEmployee;


    @BeforeEach
    void setUp() {

    }
    @Test
    void getCommissionEmployee(){
        comEmployee = new CommissionEmployee("janet","ishola", "22344555", 20.0, 1.0);
        System.out.println(comEmployee);
    }

    @Test
    void getBasePlusCommissionEmployee(){
        BasePlusCommissionEmployee comEmployee = new BasePlusCommissionEmployee("janet","ishola", "22344555", 20.0, 1.0, 2.5);
        System.out.println(comEmployee);
    }
}
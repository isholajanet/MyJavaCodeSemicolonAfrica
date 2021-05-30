package africa.semicolon.chapterThree;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HeartRatesTest {
    HeartRate myHeartRate;
    Date myDate;
    @BeforeEach
    public void runThisBeforeEachTest(){
        myHeartRate = new HeartRate("Janet","Ishola", new Date(12, 12, 1999));
    }



    @Test
    public void testThatUserCanSetFirstName(){
        myHeartRate.setFirstName("Janet");
        assertEquals("Janet", myHeartRate.getFirstName());

    }
    @Test
    public void testThatUserCanSetLastName(){
        myHeartRate.setLastName("Ishola");
        assertEquals("Ishola", myHeartRate.getLastName());
    }
    @Test
    public void testThatUserCanSetDateOfBirth(){
        Date myDate = new Date(12, 12, 1998);
        assertEquals("12/12/1998", myDate.displayDate());


    }
    @Test
    public void testThatHeartRatesCanDisplayBothNameTogether(){
        myHeartRate.setFirstName("Janet");
        myHeartRate.setLastName("Ishola");
        myHeartRate.displayName();
    }

    @Test
    public void testThatHeartRatesCanCalculatePatientAge(){
       myDate = new Date(12,12,1998);
       // myHeartRate.getAge();
        assertEquals(22, myHeartRate.getAge());
    }

    @Test
    public void testThatHeartRatesCanCalculatePatientMaximumHeartRate(){
        myDate = new Date(12, 12,1998);
        assertEquals(198, myHeartRate.getMaximumHeartRate());
    }
    @Test
    public void testThatHeartRatesCanCalculateMinimumTargetHeartRate(){
        myDate = new Date(12, 12,1998);
        myHeartRate.getMaximumHeartRate();
        assertEquals(99, myHeartRate.getMinimumTargetHeartRate());
    }
    @Test
    public void testThatHeartRatesCanCalculateMaximumTargetHeartRate(){
        myDate = new Date(12, 12,1998);
        myHeartRate.getMaximumHeartRate();
        assertEquals(168, myHeartRate.getMaximumTargetHeartRate());
    }
    @Test
    public void testThatHeartRatesCanDisplayTargetHeartRates(){
        myDate = new Date(12, 12,1998);
        myHeartRate.getMaximumHeartRate();
        myHeartRate.getMinimumTargetHeartRate();
        myHeartRate.getMaximumTargetHeartRate();
        myHeartRate.displayTargetHeartRate();
    }
    }




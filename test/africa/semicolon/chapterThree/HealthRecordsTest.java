package africa.semicolon.chapterThree;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HealthRecordsTest {
    HealthRecords myHealthRecords;
    @BeforeEach
    public void runBeforeEachTest(){
        myHealthRecords = new HealthRecords("Janet", "Ishola", "Female", new Date(12, 12,1998),
                145, 50);
    }

    @Test
    public void testThatHealthRecordsCanSetFirstName(){
        myHealthRecords.setFirstName("Oladunni");
        assertEquals("Oladunni", myHealthRecords.getFirstName());
    }
    @Test
    public void testThatHealthRecordsCanSetLastName(){
        myHealthRecords.setLastName("Olayemi");
        assertEquals("Olayemi", myHealthRecords.getLastName());
    }
    @Test
    public void testThatHealthRecordsCanSetGender(){
        myHealthRecords.setGender("Female");
        assertEquals("Female", myHealthRecords.getGender());
    }
    @Test
    public void testThatHealthRecordsCanSetDateOfBirth(){
        new Date(12,12,1998);
        assertEquals("12/12/1998", myHealthRecords.getDateOfBirth());
    }
    @Test
    public void testThatHealthRecordsCanSetHeight(){
        myHealthRecords.setHeight(145);
        assertEquals(145, myHealthRecords.getHeight());
    }
    @Test
    public void testThatHealthRecordsCanSetWeight(){
        myHealthRecords.setWeight(50);
        assertEquals(50, myHealthRecords.getWeight());
    }
    @Test
    public void testThatHealthRecordsCanCalculatePatientAge(){
        new Date(12,5,1998);
        assertEquals(23, myHealthRecords.getAge());
    }

    @Test
    public void testThatHealthRecordsCanCalculatePatientMaximumHeartRate(){
        new Date(12, 5,1998);
        assertEquals(197, myHealthRecords.getMaximumHeartRate());
    }
    @Test
    public void testThatHealthRecordsCanCalculateMinimumTargetHeartRate(){
        new Date(12, 5,1998);
        myHealthRecords.getMaximumHeartRate();
        assertEquals(98, myHealthRecords.getMinimumTargetHeartRate());
    }
    @Test
    public void testThatHealthRecordsCanCalculateMaximumTargetHeartRate(){
        new Date(12, 5,1998);
        myHealthRecords.getMaximumHeartRate();
        assertEquals(167, myHealthRecords.getMaximumTargetHeartRate());
    }
    @Test
    public void testThatHealthRecordsCanCalculateBMI(){
        myHealthRecords.setWeight(200);
        myHealthRecords.setHeight(150);
        assertEquals(6, myHealthRecords.getBMI());
    }

}

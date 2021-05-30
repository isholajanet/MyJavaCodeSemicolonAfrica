package africa.semicolon.chapterThree;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HeartRatesTest {
    HeartRate myHeartRate;
    Date myDate;
    @BeforeEach
    public void runThisBeforeEachTest(){
        myHeartRate = new HeartRate("Janet","Ishola");
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
    public void testThatSystemCanDisplayUserDetails(){
        Date myDate = new Date(13, 12, 2010);
        myHeartRate.setFirstName("Kelvin");
        myHeartRate.setLastName("Okoro");
        myDate.setDay(13);
        myDate.setMonth(12);
        myDate.setYear(2010);
        myHeartRate.displayDateOfBirth();

    }


}

package africa.semicolon.chapterThree;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.nio.charset.StandardCharsets;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HeartRatesTest {
    HeartRate myHeartRate;
    @BeforeEach
    public void runThisBeforeEachTest(){
        myHeartRate = new HeartRate("Janet", "Ishola");
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
    public void testThatHeartRatesCanDisplayBothNameTogether(){
        myHeartRate.setFirstName("Janet");
        myHeartRate.setLastName("Ishola");
        myHeartRate.DisplayName();
    }


    @Test
    void testUserHasDateOfBirth(){
        myHeartRate.setDate(12, 7, 2002);
        assertEquals(myHeartRate.getDate().getDay(), 7);
        assertEquals(myHeartRate.getDate().displayDate(),"12/7/2002");

        System.out.println(myHeartRate.toString());

    }



}

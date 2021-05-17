package africa.semicolon.tddClass;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AirConditionerTest {
    private AirConditioner myAc;
    @BeforeEach
    public void RunAlongsideWithEachMethod(){

        myAc = new AirConditioner("LG");
    }
    @Test
    public void testThatYourAcCanComeOn(){

        myAc.setOn(true);
        assertTrue(myAc.isOn());
        //assertEquals(true, acName.getIsAcOn());
    }

    @Test
    public void testThatTemperatureCannotBeIncreasedWhenAcIsOff(){
        //when
        myAc.setOn(true);
        assertTrue(myAc.isOn());
        //given
        myAc.setTemperature(17);
        assertEquals(17, myAc.getTemperature());

    }


}

package africa.semicolon.chapterThree;

//import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BikeTest {
    private Bike okada;
//    @BeforeEach
//    public void startEachTestWithThis(){
//        okada = new Bike(false, 45);
//    }
    @BeforeEach
    public void startEachTestWithThis(){
        okada = new Bike(false, 45);
    }

    @Test
    public void testThatSpeedCanBeSet(){
        //given
        Bike okada =  new Bike(false, 45);
        assertFalse(okada.isOn());
        Bike janetBike = new Bike(true, 63);
        assertTrue(janetBike.isOn());
        Bike loveBike = new Bike(false, 200);
        assertTrue((!loveBike.isOn() && loveBike.getSpeedInKmPerHour() == 200));
        assertEquals(true, (!loveBike.isOn() && loveBike.getSpeedInKmPerHour() == 200));
        //when
//        okada.setSpeedInKmPerHour(15);
//        //confirm
//        assertEquals(15, okada.getSpeedInKmPerHour());
    }

    @Test
    public void testThatSpeedCannotBeSetWhenBikeIsOff(){
        //when
        okada.setOn(false);
        assertFalse(okada.isOn());

        okada.setSpeedInKmPerHour(45);

        assertEquals(45, okada.getSpeedInKmPerHour());

    }

}

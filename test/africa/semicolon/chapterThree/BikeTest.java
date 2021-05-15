/** The requirement for my bike is: it has 5 gears, the maximum speed is 300km/h it should change to gear 2
 * if the speed is above 60km/h / change to gear 3 is the speed is above 120km/h / change to gear 4 is above 180km
 * /change to gear 5 if the speed is above 240km/h
 * i.e gear 1 - 1km/h - 60km/h
 * gear 2 - 61km/h - 120km/h
 * gear 3 - 121km/h - 180km/h
 * gear 4 - 181km/h - 240km/h
 * gear 5 - 241km/h - 300km/h  **/
package africa.semicolon.chapterThree;

//import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BikeTest {
    private Bike okada;

    @BeforeEach
    public void startEachTestWithThis(){
        okada = new Bike();
    }

    @Test
    public void testThatSpeedCanBeSet(){
        //given
        Bike okada =  new Bike();
        okada.setOn(false);
        assertFalse(okada.isOn());
        Bike janetBike = new Bike();
        janetBike.setOn(true);
        assertTrue(janetBike.isOn());
        //Bike loveBike = new Bike();
        //loveBike.setOn(true);
       // loveBike.setSpeedInKmPerHour(200);
        //assertTrue((!loveBike.isOn() && loveBike.getSpeedInKmPerHour() == 200));
       // assertEquals(true, (!loveBike.isOn() && loveBike.getSpeedInKmPerHour() == 200));
        //when
//        okada.setSpeedInKmPerHour(15);
//        //confirm
//        assertEquals(15, okada.getSpeedInKmPerHour());
    }

    @Test
    public void testThatSpeedCannotBeSetWhenBikeIsOff(){
        //when
        okada.setOn(true);
        assertTrue(okada.isOn());

        okada.setSpeedInKmPerHour(45);

        assertEquals(45, okada.getSpeedInKmPerHour());

    }
    @Test
    public void testThatBikeCanChangeGearWhenTheSpeedIncreases(){
        //when
        //The bike should be on
        okada.setOn(true);
        assertTrue(okada.isOn());
        //set our speed in kilometre per hour
        okada.setSpeedInKmPerHour(300);
        assertEquals(300, okada.getSpeedInKmPerHour());
        //set our initial gear
        okada.setGear(5);
        assertEquals(5,okada.getGear());
//        //speed up our bike
//        okada.speedUpBike();
//        assertEquals(3, okada.getGearInMotion());
    }

}

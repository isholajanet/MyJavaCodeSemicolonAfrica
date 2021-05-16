/** The requirement for my bike is: it has 5 gears, the maximum speed is 300km/h it should change to gear 2
 * if the speed is above 60km/h / change to gear 3 is the speed is above 120km/h / change to gear 4 is above 180km
 * /change to gear 5 if the speed is above 240km/h
 * i.e gear 1 - 1km/h - 60km/h
 * gear 2 - 62km/h - 120km/h
 * gear 3 - 123km/h - 180km/h
 * gear 4 - 184km/h - 240km/h
 * gear 5 - 245km/h - 300km/h  **/
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
    public void testThatBikeCanChangeToGearTwoWhenTheSpeedIncreases(){
        //when
        //The bike should be on
        okada.setOn(true);
        assertTrue(okada.isOn());
        //set our speed in kilometre per hour
        okada.setSpeedInKmPerHour(60);
        assertEquals(60, okada.getSpeedInKmPerHour());
        //set our initial gear
//       //
        //when
        okada.accelerate();
//        assertEquals(okada.accelerate());
        //speed up our bike
//        okada.speedUpBike();
//        assertEquals(3, okada.getGearInMotion());
        //assert
//                    assertTrue(okada.getGear()==2);
                    assertEquals(2, okada.getGear());
                    assertEquals(62, okada.getSpeedInKmPerHour());
    }
    @Test
    public void testThatBikeCanChangeToGearThreeWhenTheSpeedIncreases(){
        //when
        okada.setOn(true);
        assertTrue(okada.isOn());
        //set our speed in kilometre per hour
        okada.setSpeedInKmPerHour(120);
        assertEquals(120, okada.getSpeedInKmPerHour());
        okada.accelerate();
        assertEquals(3, okada.getGear());
        assertEquals(123, okada.getSpeedInKmPerHour());
    }
    @Test
    public void testThatBikeCanChangeToGearFourWhenTheSpeedIncreases(){
        //when
        okada.setOn(true);
        assertTrue(okada.isOn());
        okada.setSpeedInKmPerHour(180);
        assertEquals(180, okada.getSpeedInKmPerHour());
        okada.accelerate();
        assertEquals(4, okada.getGear());
        assertEquals(184, okada.getSpeedInKmPerHour());
    }

    @Test
    public void testThatBikeCanChangeToGearFiveWhenTheSpeedIncreases(){
        //when
        okada.setOn(true);
        assertTrue(okada.isOn());
        okada.setSpeedInKmPerHour(280);
        assertEquals(280, okada.getSpeedInKmPerHour());
        okada.accelerate();
        assertEquals(5, okada.getGear());
        assertEquals(285, okada.getSpeedInKmPerHour());
    }


}

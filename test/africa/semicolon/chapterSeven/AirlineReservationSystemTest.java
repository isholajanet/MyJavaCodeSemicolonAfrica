package africa.semicolon.chapterSeven;

import africa.semicolon.Exceptions.AirlineReservationException;
import africa.semicolon.chapterSeven.dietelExercises.AirlineReservationSystem;
import africa.semicolon.chapterSeven.dietelExercises.FlightType;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class AirlineReservationSystemTest {
    AirlineReservationSystem airlineReservationSystem;
    @BeforeEach
    void setUp(){

        airlineReservationSystem = new AirlineReservationSystem();
    }
    @Test
    void testThatSystemCanGetFlightTypeIfTheUserEnters1(){
        airlineReservationSystem.setFlightType(1);
        assertEquals(FlightType.FIRST_CLASS, airlineReservationSystem.getFlightType());
    }
    @Test
    void testThatSystemCanGetFlightTypeIfTheUserEnters2(){
        airlineReservationSystem.setFlightType(2);
        assertEquals(FlightType.SECOND_CLASS, airlineReservationSystem.getFlightType());
    }
    @Test
    void testThatSystemChoosesASeatBetween1And5WhenUserEnter1(){
        airlineReservationSystem.setFlightType(1);
        airlineReservationSystem.setSeat();
        assertTrue(airlineReservationSystem.getSeat() >= 1 && airlineReservationSystem.getSeat() <= 5);
    }
    @Test
    void testThatSystemChoosesASeatBetween6And10WhenUserEnter2(){
        airlineReservationSystem.setFlightType(2);
        airlineReservationSystem.setSeat();
        assertTrue(airlineReservationSystem.getSeat() >= 6 && airlineReservationSystem.getSeat() <= 10);
    }
    @Test
    void testThatSystemCanDisplayBoardingPass(){
        airlineReservationSystem.setFlightType(2);
        airlineReservationSystem.setSeat();
        System.out.println(airlineReservationSystem.displayBoardingPass());
    }
    @Test
    void testThatSystemHasListOfSeats(){
        assertEquals(false, airlineReservationSystem.getSeatList()[0]);
    }
    @Test
    void testThatListOfSeatsAreInitializedToFalse(){
        Boolean[] seatList = {false, false,false,false,false,false,false,false,false,false};
        assertEquals(Arrays.toString(seatList), Arrays.toString(airlineReservationSystem.getSeatList()));
    }
    @Test
    void testThatAsEachSeatIsAssignedTheCorrespondingArrayIsTrue() throws AirlineReservationException {
        //using method overloading because of my test
        int seat = 1;
        airlineReservationSystem.setFlightType(1);
        airlineReservationSystem.setSeat(seat);
        System.out.println(Arrays.toString(airlineReservationSystem.getSeatList()));
        airlineReservationSystem.setSeatList();
        assertTrue(airlineReservationSystem.isSeatTaken());
        System.out.println(Arrays.toString(airlineReservationSystem.getSeatList()));
    }
    @Test
    void testThatSystemCannotAssignASeatThatHasAlreadyBeenAssigned() throws AirlineReservationException {
        int seat = 1;
        airlineReservationSystem.setFlightType(1);
        airlineReservationSystem.setSeat(seat);
        System.out.println(Arrays.toString(airlineReservationSystem.getSeatList()));
        airlineReservationSystem.setSeatList();
        assertTrue(airlineReservationSystem.isSeatTaken());



        //Book the same seat again
        airlineReservationSystem.setFlightType(1);
        airlineReservationSystem.setSeat(seat);
        airlineReservationSystem.setSeatList();
        airlineReservationSystem.setSeatList();
        assertThrows(AirlineReservationException.class, ()-> airlineReservationSystem.checkSeatList());
        System.out.println(Arrays.toString(airlineReservationSystem.getSeatList()));

    }


}

package africa.semicolon.chapterSix;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ParkingChargesTest {
    @Test
    public void testThatSystemCanSetHours(){
        ParkingCharges parkingCharges = new ParkingCharges();
        parkingCharges.setHours(2);
        assertEquals(2, parkingCharges.getHours(2));
    }

    @Test
    public void testThatSystemCanCalculateParkingChargesForEachCustomer(){
        assertEquals(20.00, ParkingCharges.calculateParkingChargesForEachCustomer(2));

    }
}

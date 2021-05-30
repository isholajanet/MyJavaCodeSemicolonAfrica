package africa.semicolon.chapterFour;

import africa.semicolon.chapterFour.deitelExercises.GasMileage;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GasMileageTest {
    GasMileage gasMileage;
    @BeforeEach
    public void RunThisBeforeEachTest(){
        gasMileage = new GasMileage(45, 5);
    }
    @Test
    public void testThatGasMileageCanAcceptMilesDriven(){
        gasMileage.setMilesDriven(40);
        assertEquals(40, gasMileage.getMilesDriven());
    }
    @Test
    public void testThatGasMileageCanAcceptGallonsUsedForEachTrip(){
        gasMileage.setGallons(2);
        assertEquals(2, gasMileage.getGallons());
    }
    @Test
    public void testToCalculateMilesPerGallonForEachTrip(){
        gasMileage.setMilesDriven(312);
        gasMileage.setGallons(5);
        assertEquals(62.4, gasMileage.milesPerGallon());
    }


}

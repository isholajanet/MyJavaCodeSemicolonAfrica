package africa.semicolon.chapterEight.EmergencyResponse;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmergencyTest {
    Emergency emergency;
    Caller caller;

    @BeforeEach
    void setUp() {
        caller = new Caller("Yaba, Lagos", "09028283344", "Fire");
        emergency = new Emergency(caller);
    }

    @AfterEach
    void tearDown() {
    }
    @Test
    void systemCanAddANewCallerToTheEmergencyList(){
        assertNotNull(emergency.getCallerInfo());
    }
    @Test
    void systemCanGetTheLengthOfEmergencyList(){
        assertEquals(1, emergency.getCallerInfo().size());
    }
}
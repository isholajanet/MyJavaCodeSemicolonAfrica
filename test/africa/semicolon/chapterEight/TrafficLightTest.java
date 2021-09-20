package africa.semicolon.chapterEight;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TrafficLightTest {

    private TrafficLight trafficLight;
    @BeforeEach
    void setUp() {
        trafficLight = TrafficLight.RED;
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testToGetTimeForLightRed(){
        assertEquals("30sec", TrafficLight.RED.getTime());
    }

    @Test
    void testToGetTimeForLightGreen(){
        assertEquals("20sec", TrafficLight.GREEN.getTime());
    }
    @Test
    void testToGetTimeForLightYellow(){
        assertEquals("30sec", TrafficLight.YELLOW.getTime());
    }
    @Test
    void testToSetTime(){
        TrafficLight.RED.setTime("50sec");
        assertEquals("50sec", TrafficLight.RED.getTime());
    }
}
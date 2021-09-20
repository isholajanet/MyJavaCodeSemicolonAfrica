package africa.semicolon.chapterEight.Time;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TimeTest {
    private Time time;

    @BeforeEach
    void setUp(){
        time = new Time();
    }
    @Test
    void testThatSystemCanSetHour(){
        time.setHour(12);
        assertEquals(12, time.getHour());
    }
    @Test
    void testThatSystemCannotSetHourLesserThan0OrGreaterThanOrEqualsTo24(){
        assertThrows(IllegalArgumentException.class, () -> time.setHour(24));
    }
    @Test
    void testThatSystemCanSetMinute(){
        time.setMinute(59);
        assertEquals(59, time.getMinute());
    }
    @Test
    void testThatSystemCannotSetMinuteLessThan0OrGreaterThanOrEqualsTo60(){
        assertThrows(IllegalArgumentException.class, () -> time.setMinute(61));
    }
    @Test
    void testThatSystemCanSetSeconds(){
        time.setSecond(59);
        assertEquals(59, time.getSecond());
    }
    @Test
    void testThatSystemCannotSetSecondsLessThan0OrGreaterThanOrEqualsTo60(){
        assertThrows(IllegalArgumentException.class, () -> time.setSecond(61));
    }
    @Test
    void testThatSystemCanDisplayTime(){
        Time newTime = new Time(4, 30, 55);
        System.out.println(newTime);
    }
    @Test
    void testThatSystemHasASystemCanIncrementHour(){
        Time newTime= new Time(13, 30,45);
        newTime.incrementHour();
        System.out.println(newTime);
    }
    @Test
    void testThatSystemCanOIncrementMinute(){
        Time newTime = new Time(13, 30, 45);
        newTime.incrementMinute();
        System.out.println(newTime);
    }
    @Test
    void testThatSystemCanIncrementSecond(){
        Time newTime = new Time(13,30,48);
        newTime.incrementSecond();
        System.out.println(newTime);
    }
    @Test
    void testThatSystemCanTick(){
        Time newTime = new Time(13, 30, 59);
        newTime.tick();
        System.out.println(newTime);
    }
    @Test
    void testThatSystemCanIncrementIntoTheNextMinute(){
        Time newTime = new Time(13, 30, 59);
        newTime.tick();
        System.out.println(newTime);
    }
    @Test
    void testThatSystemCanIncrementIntoTheNextHour(){
        Time newTime = new Time(2, 59, 59);
        newTime.tick();
        System.out.println(newTime);
    }
    @Test
    void testThatSystemCanIncrementIntoTheNextDay(){
        Time newTime = new Time(23, 59,59);
        newTime.tick();
        System.out.println(newTime);
    }

}

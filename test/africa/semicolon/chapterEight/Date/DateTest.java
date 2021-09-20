package africa.semicolon.chapterEight.Date;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class DateTest {
    Date date;
    @BeforeEach
    void setUp(){
        date = new Date(6, 20, 1998);
    }
    @Test
    void testThatSystemCannotSetMonthLessThan1AndGreaterThan12(){
        assertThrows(IllegalArgumentException.class, () -> date.setMonth(13));
    }
    @Test
    void testThatSystemCannotSetDayNotWithinRange(){
        date.setMonth(12);
        assertThrows(IllegalArgumentException.class, ()-> date.setDay(32));
    }
    @Test
    void testThatSystemCanSetYear(){
        date.setYear(1998);
        assertEquals(1998, date.getYear());
    }
    @Test
    void testThatSystemCanIncrementDay(){
        date.setDay(29);
        date.nextDay();
        assertEquals(30, date.getDay());
    }

}

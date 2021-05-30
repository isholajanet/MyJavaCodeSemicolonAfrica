package africa.semicolon.chapterThree;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class DateTest {
    Date myDate;
    @BeforeEach
    public void RunBeforeEachTest(){

        myDate = new Date(1, 1, 1950);
    }
    @Test
    public void testToShowThatICanGetMyDay(){

        assertEquals(0, myDate.getDay());
    }
    @Test
    public void testThatICanGetMyMonth(){

        assertEquals(00, myDate.getMonth());
    }
    @Test
    public void testThatICanGetYear(){

        assertEquals(0000, myDate.getYear());
    }
    @Test
    public void testThatDayCanBeSet(){
        myDate.setDay(27);
        assertEquals(27, myDate.getDay());
    }
    @Test
    public void testThatMonthCanBeSet(){
        myDate.setMonth(5);
        assertEquals(5, myDate.getMonth());
    }
    @Test
    public void testThatYearCanBeSet(){
        myDate.setYear(2021);
        assertEquals(2021, myDate.getYear());
    }
    @Test
    public void testThatDateCanBeDisplayed(){
        myDate.setDay(28);
        myDate.setMonth(4);
        myDate.setYear(2021);
        assertEquals("28/4/2021", myDate.displayDate());
    }
    @Test
    public void testThatMonthWith31DaysWillNotAcceptMoreThanAnyValueGreaterThan31(){
        myDate.setMonth(4);
        myDate.setDay(32);
        myDate.setYear(1998);
        assertEquals("1/4/1998", myDate.displayDate());
    }
    @Test
    public void testThatMonthWith30DaysWillNotAcceptMoreThanAnyValueGreaterThan30(){
        myDate.setMonth(9);
        myDate.setDay(31);
        myDate.setYear(2020);
        assertEquals("1/9/2020",myDate.displayDate());
    }
    @Test
    public void testThatChecksForALeapYear(){
        myDate.setYear(2020);
        assertEquals(true, myDate.checkLeapYear());
    }
    @Test
    public void testThatFebruaryCannotBeSetTo29IfTheYearIsNotALeapYear(){
        myDate.setYear(2021);
        myDate.setMonth(2);
        myDate.setDay(29);
        assertEquals(false, myDate.checkLeapYear());
        assertEquals("1/2/2021", myDate.displayDate());
    }
    @Test
    public void testThatFebruaryCanBeSetTo29DaysIfYearIsALeapYear(){
        myDate.setYear(2020);
        myDate.setMonth(2);
        myDate.setDay(29);
        assertEquals(true, myDate.checkLeapYear());
        assertEquals("29/2/2020", myDate.displayDate());
    }

}

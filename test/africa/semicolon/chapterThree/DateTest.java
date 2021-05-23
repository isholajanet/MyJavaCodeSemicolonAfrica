package africa.semicolon.chapterThree;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DateTest {
    Date myDate;
    @BeforeEach
    public void runBeforeAllTest(){
        myDate = new Date(10, 20, 1998);
    }


    @Test
    public void testThatMyMonthCanBeSet(){
        myDate.setMonth(13);
        assertEquals(0, myDate.getMonth());
    }
    @Test
    public void testThatMyDayCanBeSet(){
        myDate.setDay(28);
        assertEquals(28, myDate.getDay());
    }
    @Test
    public void testThatMyYearCanBeSet(){
        myDate.setYear(1999);
        assertEquals(1999, myDate.getYear());

    }
    @Test
    public void testToDisplayTheYear(){
        myDate.setMonth(12);
        myDate.setDay(25);
        myDate.setYear(2014);
        myDate.displayDate();
//
//        System.out.printf("%d / %d / %d", myDate.getMonth(), myDate.getDay(), myDate.getYear() );
    }
}

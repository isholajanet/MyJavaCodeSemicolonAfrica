package africa.semicolon.chapterSix;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StudentGradeTest {
    @Test
    void testThatSystemCanReturn0IfStudentGradeIsLowerThan60(){
        assertEquals(0, StudentGrade.getStudentGrade(50));
    }
    @Test
    void testThatSystemCanReturn0IfStudentGradeIsWithin60To69(){
        assertEquals(1, StudentGrade.getStudentGrade(65));
    }
    @Test
    void testThatSystemCanReturn0IfStudentGradeIsWithin70To79(){
        assertEquals(2, StudentGrade.getStudentGrade(75));
    }
    @Test
    void testThatSystemCanReturn0IfStudentGradeIsWithin80To89(){
        assertEquals(3, StudentGrade.getStudentGrade(85));
    }
    @Test
    void testThatSystemCanReturn0IfStudentGradeIsWithin90To100(){
        assertEquals(4, StudentGrade.getStudentGrade(100));
    }
}

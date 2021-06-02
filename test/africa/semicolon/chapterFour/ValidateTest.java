package africa.semicolon.chapterFour;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ValidateTest {
    Validate validate;
    @BeforeEach
    public void runThisBeforeEachTest(){

        validate = new Validate();
    }
    @Test
    public void testThatSystemCanSetStudentNumber(){
        validate.setStudentNumber(10);
        assertEquals(10, validate.getStudentNumber());
    }
    @Test
    public void testThatSystemCanSetResult(){
       validate.setResult(1);
       assertEquals(1, validate.getResult());
    }
    @Test
    public void testThatSystemWillDisplayPrintPassedIfStudentResultIs1(){
        assertEquals("Passed", validate.getStudentResult(1));
    }
    @Test
    public void testThatResultDisplayWillBeFailedIfStudentResultIs2(){
        assertEquals("Failed", validate.getStudentResult(2));
    }
    @Test
    public void testThatSystemCanCheckTheNumberOfStudentThatPassed(){
        assertEquals(5, validate.getTheNumbersOfStudentThatPassed(97,56,100,45,32,54,90,98,84,47));
    }
    @Test
    public void testThatSystemCanCheckTheNumberOfStudentThatFailed(){
        assertEquals(7, validate.getTheNumbersOfStudentThatFailed(12,34,56,77,55,43,89,97,44,50));
    }
    @Test
    public void testThatSystemKeepLoopingTillACorrectValueIsEntered(){
        validate.checkThatLoopContinuesTillAValidInputIsEntered();
    }




}

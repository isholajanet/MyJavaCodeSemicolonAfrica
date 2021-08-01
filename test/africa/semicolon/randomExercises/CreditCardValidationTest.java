package africa.semicolon.randomExercises;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CreditCardValidationTest {
    CreditCardValidation creditCardValidation;

    @BeforeEach
    void setUp() {
        creditCardValidation = new CreditCardValidation();
    }
    @Test
    public void systemCanSetNumberTest(){
        creditCardValidation.setNumber("12345678901");
        assertEquals("12345678901", creditCardValidation.getNumber());
    }
    @Test
    public void systemCanCountTheDigitInTheNumberTest(){
        assertEquals(11, creditCardValidation.getDigit("12345678901"));
    }
    @Test
    public void systemCanGetSumOfOddPlacedDigitsTest(){
        assertEquals(42, creditCardValidation.sumOfDoubleEvenPlace("79927398713"));
    }
    @Test
    public void systemCanGetSumOfEvenPlacedDigitsTest(){
        assertEquals(28, creditCardValidation.sumOfOddPlace("79927398713"));
    }
    @Test
    public void systemCanGetSumOfBothEvenAndOldPaceDigitTest(){
        assertEquals(70, creditCardValidation.sumOfBothEvenAndOddPlace("79927398713"));
    }
    @Test
    public void systemCanCheckIfACreditCardNumberIsValid(){
        assertEquals(true, creditCardValidation.IsValid("79927398713"));
    }
    @Test
    public void systemCanCheckIfADigitIsAPrefixOfTheNumber(){
        assertEquals(true, creditCardValidation.isItAPrefixOf("79927398713", 7));
    }
    @Test
    public void systemCanGetTheNumberOfDigitsFromNumber(){
        assertEquals("799", creditCardValidation.getPrefix("79927398713", 15));
    }




}
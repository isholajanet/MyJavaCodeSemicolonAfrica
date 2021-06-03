package africa.semicolon.chapterFour;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PalindromeTest {
    Palindrome palindrome;
    @BeforeEach
    public void RunBeforeEachTest(){
        palindrome = new Palindrome();
    }
    @Test
    public void testThatUserCanSetNumber(){
        palindrome.setNumber(55555);
        assertEquals(55555, palindrome.getNumber());
    }
    @Test
    public void testThatUserCanCountDigits(){
        assertEquals(5, palindrome.countNumbers(17868));
        System.out.println(palindrome.getCounter());
    }
    @Test
    public void testThatSystemCanOnlyAcceptNumbersWith5Digits(){
        palindrome.setNumber(17888);
        assertEquals(17888, palindrome.getNumber());
    }
    @Test
    public void testThatSystemCanReturnFalseIfItIsNotAPalindrome(){
        assertEquals(true, palindrome.checkWhetherItsPalindrome(101));
    }
}

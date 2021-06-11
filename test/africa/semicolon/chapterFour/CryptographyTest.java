package africa.semicolon.chapterFour;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CryptographyTest {
    Cryptography cryptography;
    @BeforeEach
    public void runThisBeforeEachTest(){
        cryptography = new Cryptography();
    }
    @Test
    public void testThatSystemCanSetNumber(){
        cryptography.setNumber(1234);
        assertEquals(1234, cryptography.getNumber());
    }
    @Test
    public void testThatSystemCanCountNumber(){
        assertEquals(4, cryptography.getNumberCount(1234));
    }
}

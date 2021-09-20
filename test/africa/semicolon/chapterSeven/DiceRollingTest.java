package africa.semicolon.chapterSeven;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class DiceRollingTest {
    Dice dice;
    DiceRoll diceRoll;

    @BeforeEach
    void setUp(){
        dice = new Dice();
        diceRoll = new DiceRoll();
    }
    @Test
    void SystemCanGetDiceFaceTest(){
        dice.setFace(4);
        assertEquals(4, dice.getFace());
    }
    @Test
    void SystemCanRollDiceTwiceTest(){
        SecureRandom random = new SecureRandom();
        Dice dice1 = new Dice();
        dice1.setFace(random.nextInt(6));
        Dice dice2 = new Dice();
        dice2.setFace(random.nextInt(6));
        assertTrue(dice1.getFace() > 0 && dice2.getFace() < 7);
    }
    @Test
    void systemCanGetTheFrequencyTest(){
        SecureRandom random = new SecureRandom();
        int firstDiceFace = random.nextInt(6);
        int secondDiceFace = random.nextInt(6);
        Dice dice1 = new Dice();
        dice1.setFace(firstDiceFace);
        Dice dice2 = new Dice();
        dice2.setFace(secondDiceFace);
        diceRoll.setFirstRoll(dice1);
        diceRoll.setSecondRoll(dice2);
        diceRoll.setFrequency();
        assertEquals(1, diceRoll.getDiceFaceFrequency()[firstDiceFace + secondDiceFace]);
    }


}

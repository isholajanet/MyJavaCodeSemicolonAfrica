package africa.semicolon.chapterSeven.gameOfCrap;

import africa.semicolon.chapterSeven.DiceRollMain;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class GameOfCrapTest {
    @Test
    void testThatSystemCanGetDiceFace(){
        Dice dice = new Dice();
        dice.setFace(4);
        assertEquals(4, dice.getFace());
    }
    @Test
    void testThatSystemCanGetTheFirstDiceRoll(){
        Dice dice1 = new Dice();
        dice1.setFace(4);

        DiceRoll firstDiceRoll = new DiceRoll();
        firstDiceRoll.setFirstRoll(dice1);
        assertEquals(dice1, firstDiceRoll.getFirstRoll());
    }
    @Test
    void testThatSystemCanGetSecondDiceRoll(){
        Dice dice1 = new Dice();
        DiceRoll diceRoll = new DiceRoll();
        dice1.setFace(6);
        diceRoll.setSecondRoll(dice1);
        assertEquals(dice1, diceRoll.getSecondRoll());
    }
//    @Test
//    void testThatSystemCanGetThirdDiceRoll(){
//        Dice dice1 = new Dice();
//        DiceRoll diceRoll = new DiceRoll();
//        dice1.setFace(6);
//        diceRoll.setThirdRoll(dice1);
//        assertEquals(dice1, diceRoll.getThirdRoll());
//    }
//    @Test
//    void testThatSystemCanGetFourthDiceRoll(){
//        Dice dice1 = new Dice();
//        dice1.setFace(6);
//        DiceRoll diceRoll = new DiceRoll();
//        diceRoll.setFourthRoll(dice1);
//        assertEquals(dice1, diceRoll.getFourthRoll());
//    }

    @Test
    void testThatSystemCanGetTheSumOfTheFirstAndSecondDiceRoll(){
        Dice dice1 = new Dice();
        dice1.setFace(4);

        DiceRoll firstDiceRoll = new DiceRoll();
        firstDiceRoll.setFirstRoll(dice1);
        firstDiceRoll.setSecondRoll(dice1);

        assertEquals(8, firstDiceRoll.sumOfDiceRoll());
    }
//    @Test
//    void testThatSystemCanGetTheSumOfThirdAndFourthDiceRoll(){
//        Dice dice1 = new Dice();
//        dice1.setFace(4);
//
//        DiceRoll firstDiceRoll = new DiceRoll();
//        firstDiceRoll.setThirdRoll(dice1);
//        firstDiceRoll.setFourthRoll(dice1);
//
//        assertEquals(8, firstDiceRoll.sumOfOtherDiceRoll());
//    }

    @Test
    void testThatSystemReturnWinWhenTheSumOfDiceRollIs7(){
        Dice dice1 = new Dice();
        Dice dice2 = new Dice();
        dice1.setFace(4);
        dice2.setFace(3);

        DiceRoll firstDiceRoll = new DiceRoll();
        firstDiceRoll.setFirstRoll(dice1);
        firstDiceRoll.setSecondRoll(dice2);

        firstDiceRoll.sumOfDiceRoll();
        firstDiceRoll.checkResult();
        assertEquals(Result.WIN, firstDiceRoll.getResult());

    }
    @Test
    void testThatSystemResultCanBeLose(){
        Dice dice1 = new Dice();
        Dice dice2 = new Dice();
        dice1.setFace(1);
        dice2.setFace(1);

        DiceRoll firstDiceRoll = new DiceRoll();
        firstDiceRoll.setFirstRoll(dice1);
        firstDiceRoll.setSecondRoll(dice2);

        firstDiceRoll.sumOfDiceRoll();
        firstDiceRoll.checkResult();
        assertEquals(Result.LOSE, firstDiceRoll.getResult());
    }
    @Test
     void testThatResultCanBeContinue(){
        Dice dice1 = new Dice();
        Dice dice2 = new Dice();
        dice1.setFace(2);
        dice2.setFace(3);

        DiceRoll firstDiceRoll = new DiceRoll();
        firstDiceRoll.setFirstRoll(dice1);
        firstDiceRoll.setSecondRoll(dice2);

        firstDiceRoll.sumOfDiceRoll();
        firstDiceRoll.checkResult();
        assertEquals(Result.CONTINUE, firstDiceRoll.getResult());
    }
//    @Test
//    void testThatIfResultIsContinueTheGameCanBePlayedAgain(){
//        System.out.println("I am in this method");
//        DiceRoll firstDiceRoll = new DiceRoll();
//        Dice dice1 = new Dice();
//        Dice dice2 = new Dice();
//        dice1.setFace(2);
//        dice2.setFace(3);
//
//        System.out.println("I am also in this method");
//        firstDiceRoll.setFirstRoll(dice1);
//        firstDiceRoll.setSecondRoll(dice2);
//
//        firstDiceRoll.sumOfDiceRoll();
//        firstDiceRoll.checkResult();
//        System.out.println("Look at where I am");
//        Dice dice3 = new Dice();
//        Dice dice4 = new Dice();
//        dice3.setFace(2);
//        dice4.setFace(3);
//        System.out.println("I am also here");
//        firstDiceRoll.setThirdRoll(dice3);
//        System.out.println(firstDiceRoll.getThirdRoll());
//        firstDiceRoll.setFourthRoll(dice4);
//
//        firstDiceRoll.sumOfOtherDiceRoll();
//
//        assertTrue(firstDiceRoll.isScoreTheSame());
//    }
    @Test
    void testThatIfTheGameIsPlayedAgainTheResultCanBeWon(){
        Dice dice1 = new Dice(2);
        Dice dice2 = new Dice(3);

        DiceRoll firstDiceRoll = new DiceRoll(dice1,dice2);
        System.out.println(firstDiceRoll.sumOfDiceRoll());

        firstDiceRoll.sumOfDiceRoll();
        firstDiceRoll.checkResult();
        System.out.println(firstDiceRoll.getResult());
        assertEquals(Result.CONTINUE, firstDiceRoll.getResult());

//        Dice dice3 = new Dice(2);
//        Dice dice4 = new Dice(3);
//        DiceRoll secondDiceRoll = new DiceRoll(dice3, dice4);
//        secondDiceRoll.sumOfDiceRoll();
//        secondDiceRoll.checkResult();
//        secondDiceRoll.isScoreTheSame();
//        assertEquals(Result.WIN, secondDiceRoll.getResult());
    }
}

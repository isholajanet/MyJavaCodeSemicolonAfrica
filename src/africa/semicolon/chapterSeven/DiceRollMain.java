package africa.semicolon.chapterSeven;

import java.security.SecureRandom;
import java.util.Arrays;

public class DiceRollMain {
    public static void main(String[] args) {
        DiceRoll diceRoll = new DiceRoll();
        SecureRandom random = new SecureRandom();
        Dice dice1 = new Dice();
        Dice dice2 = new Dice();

        for (int i = 0; i < 3600; i++) {
            dice1.setFace(1 + random.nextInt(6));
            diceRoll.setFirstRoll(dice1);
            dice2.setFace(1 + random.nextInt(6));
            diceRoll.setSecondRoll(dice2);
            diceRoll.setFrequency();
        }
        System.out.println(Arrays.toString(diceRoll.getDiceFaceFrequency()));

    }
}

package africa.semicolon.chapterSeven;

import java.util.Random;

public class DiceRolling {
    public static void main(String[] args) {
        Random random = new Random();
        int firstDie = random.nextInt(6);
        int secondDie = random.nextInt(6);

        int sum = firstDie + secondDie;
        int[] result = new int[6];

        for (int i = 0; i < result.length; i++) {

        }
    }
}

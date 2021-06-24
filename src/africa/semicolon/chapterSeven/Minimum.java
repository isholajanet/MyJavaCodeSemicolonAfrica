package africa.semicolon.chapterSeven;

public class Minimum {


    public static float getSmallestOf(float firstNumber, float secondNumber, float thirdNumber) {
        float smallest;

        smallest = Math.min(firstNumber, Math.min( secondNumber,thirdNumber));

        return smallest;
    }
}

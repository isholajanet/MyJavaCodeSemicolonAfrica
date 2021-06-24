package africa.semicolon.chapterSix;

public class RoundingNumbers {

    public static int RoundUpToInteger(double number) {
        int roundedNumber = 0;
        roundedNumber = (int) Math.floor(number + 0.5);
        System.out.println("The original number is " +number + " and the rounded number is " + roundedNumber);
        return roundedNumber;

    }
}

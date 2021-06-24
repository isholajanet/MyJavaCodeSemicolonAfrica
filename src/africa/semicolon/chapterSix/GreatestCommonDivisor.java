package africa.semicolon.chapterSix;

public class GreatestCommonDivisor {
    public static int getGreatestCommonDivisor(int firstNumber, int secondNumber) {
        int gcd;
        if(firstNumber > secondNumber){
            gcd = firstNumber % secondNumber;
        }else{
            gcd = secondNumber % firstNumber;
        }

        return gcd;
    }
}

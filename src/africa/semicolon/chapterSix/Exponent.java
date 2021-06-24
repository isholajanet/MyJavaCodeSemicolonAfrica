package africa.semicolon.chapterSix;

public class Exponent {
    public static int calculateExponent(int base, int exponent) {
        int integerPower = 1;
        for(int count = 1; count <= exponent; count++){
            integerPower *= base;
        }
        return integerPower;
    }
}

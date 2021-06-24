package africa.semicolon.chapterSix;

public class SeparatingDigit {
    public static int getTheIntegerPart(int firstInteger, int secondInteger) {
        int quotient;
        quotient = firstInteger / secondInteger;
        return quotient;
    }

    public static int getTheRemainderPart(int firstInteger, int secondInteger) {
        int remainder;
        remainder = firstInteger % secondInteger;
        return remainder;
    }

    public static String displayDigits(int number) {
        String separateDigit = "";
        if((number > 1) && (number < 99999)){
            while(number != 0){
                int remainder = number % 10;
                int quotient = number / 10;
                number = quotient;
                separateDigit = remainder +" " + separateDigit;

            }
            return separateDigit;
        } else {
            return "0";
        }
    }
}

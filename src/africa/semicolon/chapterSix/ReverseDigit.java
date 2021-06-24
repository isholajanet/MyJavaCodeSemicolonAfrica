package africa.semicolon.chapterSix;

public class ReverseDigit {

    public static String reverseDigit(int number) {
        String reverseNumber = "";
        while(number != 0){
            int remainder = number % 10;
            int quotient = number / 10;
            number = quotient;
            reverseNumber += remainder ;
        }

        return reverseNumber;
    }
}

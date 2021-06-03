package africa.semicolon.chapterFour;

import java.util.Scanner;

public class Palindrome {
    private int number;
    private int count;
    public void setNumber(int number) {
        countNumbers(number);
        if(count == 5) {
            this.number = number;
        }

    }
    public int getNumber() {

        return number;
    }

    public int countNumbers(int number){

        int remainder;
        int divisor = 10;
        int dividend;
        while (number != 0){
            remainder = number % 10;
            dividend = number / 10;
            number = dividend;
            count++;
        }
       return count;
    }
    public Boolean checkWhetherItsPalindrome(int number) {
        countNumbers(number);
        if (count == 5) {
            int reverse = 0;
            int pal = number + 0;
            while (number != 0) {
                int digit = number % 10;
                reverse = reverse * 10 + digit;
                number = number / 10;
            }

            if (pal == reverse)
                return true;
            else
                return false;
        }
        return false;
    }


    public int getCounter() {

        return count;
    }
}

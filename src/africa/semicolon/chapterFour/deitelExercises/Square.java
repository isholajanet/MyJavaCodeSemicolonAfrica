package africa.semicolon.chapterFour.deitelExercises;

import java.util.Scanner;

public class Square {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
            int count = 2;
            int number = 1;
            int quotient;
            System.out.print("Enter a number: ");
            number = input.nextInt();

            while(number/count != 1){
                if (number % count == 0) {
                    System.out.println(count);
                quotient = number / count;
                number = quotient;
                }else
                    count++;
            }

    }
}

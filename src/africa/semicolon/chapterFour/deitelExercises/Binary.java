package africa.semicolon.chapterFour.deitelExercises;

import java.util.Scanner;

public class Binary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int binaryNumber = 0;
        int binaryDecimal = 0;
        int count = 0;
        int remainder;

        System.out.println("Enter a binary number");
        binaryNumber = input.nextInt();
        while(binaryNumber != 0){
            remainder = binaryNumber % 10;
            binaryDecimal += remainder * Math.pow(2,count);
            binaryNumber = binaryNumber / 10;
            count++;

        }
        System.out.printf("The binary number %d decimal number is %d" , binaryNumber, binaryDecimal);
    }
}

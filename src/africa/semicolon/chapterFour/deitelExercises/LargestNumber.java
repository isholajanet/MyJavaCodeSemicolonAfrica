package africa.semicolon.chapterFour.deitelExercises;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count = 1;
        int number;
        int largest =0;

        while (count <= 10){
            System.out.println("Input a number");
            number = input.nextInt();
            if (number > largest){
                largest = number;
            }
            count++;
        }
        System.out.println("The largest number is " +largest);
    }
}

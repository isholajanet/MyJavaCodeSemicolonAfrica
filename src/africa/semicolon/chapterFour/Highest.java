package africa.semicolon.chapterFour;

import java.util.Scanner;

public class Highest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = 0;
//        System.out.println("Enter a number: ");
//        int number = input.nextInt();
        int largest = Integer.MIN_VALUE;
        int lowest = Integer.MAX_VALUE;
        int count = 1;
        while(count <= 10){
            System.out.println("Enter a number: ");
            number = input.nextInt();
            if(number > largest){
                largest = number;
            }
            if (number < lowest){
                lowest = number;
            }
            count++;

        }
        System.out.println("The highest number is " +largest);
        System.out.println("The lowest number is "+lowest);
    }
}

package africa.semicolon.chapterFour.deitelExercises;

import java.util.Scanner;

public class TwoLargestNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count = 1;
        int number = 0;
        int firstLargest = 0;
        int secondLargest = 0;
        while(count <= 10){

            System.out.print("Enter a number ");
            number = input.nextInt();
            if (number > firstLargest){
                firstLargest = number;
            }
            if(number < firstLargest && number > secondLargest){
                secondLargest = number;
            }
            count++;
            }




        System.out.println("The first largest number is " +firstLargest);
        System.out.println("The second largest number is " +secondLargest);
    }
}

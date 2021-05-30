/**ask a user to enter a number 15 times
 * add the numbers
 * get the sum and divide it by 15 to get the averagek
 *
 */
package africa.semicolon.chapterFour;

import java.util.Scanner;

public class StudentScore {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int score;
        int count = 0;
        double sum = 0;
        System.out.print("How many student do you have? ");
        int numberOfStudent = input.nextInt();
        while(count < numberOfStudent){
            System.out.println("Enter the student score: ");
            score = input.nextInt();
            sum = sum + score;
            count++;
        }
        double average = sum / count;
        System.out.println("The sum is : " +sum);
        System.out.println("The average is: " +average);


    }
}

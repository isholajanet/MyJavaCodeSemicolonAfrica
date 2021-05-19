package africa.semicolon.chapterFour;

import java.util.Scanner;

/** Ask the user to enter a grade
 * Collect the user input
 * Check if the grade is 90 or above, the student get an A
 * if the grade is greater than or equals to 80 and less than or equals to 89, the student get a B
 * if the grade is greater than or equals to 70 and less than or equals to 79, the student get a C
 * if the grade is greater than or equals to 60 and less than or equals to 69, the student get a D
 * if the grade is less than 60, student get a F
 *
 */

public class GradeChecker {
    public static void main(String[] args){
        System.out.print("Enter a grade: ");
        Scanner input = new Scanner(System.in);
        int grade = input.nextInt();
        if (grade >= 90){
            System.out.println("A");
        }
        if (grade >= 80 && grade <= 89 ){
            System.out.println("B");
        }
        if(grade >= 70 && grade <= 79){
            System.out.println("C");
        }
        if (grade >= 60 && grade <= 69){
            System.out.println("D");
        }
        if (grade < 60){
            System.out.println("F");
        }

    }

}

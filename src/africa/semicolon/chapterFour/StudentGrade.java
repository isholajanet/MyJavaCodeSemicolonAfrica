/**enter the student score
 * add the scores
 * get the average of the scores by dividing the sum  by the number of student score entered
 * if the user enters -1, the user should not be able to enter another score;
 */

package africa.semicolon.chapterFour;

import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int score = 1;
        int count = 0;
        int sum = 0;

            while (score != -1) {
                System.out.print("Enter the student score: ");
                score = input.nextInt();
                if (score != -1) {
                    sum = sum + score;
                    count++;

                }
            }

        int average = sum / count;
        System.out.println(sum);
        System.out.println(average);
    }
}

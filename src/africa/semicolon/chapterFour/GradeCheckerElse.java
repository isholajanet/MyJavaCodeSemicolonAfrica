package africa.semicolon.chapterFour;

import java.util.Scanner;

public class GradeCheckerElse {
    public static void main(String[] args) {

        System.out.print("Enter a grade: ");
        Scanner input = new Scanner(System.in);
        int grade = input.nextInt();
        if (grade >= 90) {
            System.out.println("A");
        }else
            if(grade >= 80) {
            System.out.println("B");
        }else
            if (grade >= 70) {
            System.out.println("C");
        }else
            if (grade >= 60) {
            System.out.println("D");
        }else
            if (grade < 60) {
            System.out.println("F");
        }

    }
}

package africa.semicolon.chapterSeven;

import java.util.Scanner;

public class ArrayScore {
    public static Scanner input = new Scanner(System.in);
    private static int numberOfStudent;
    private static int numberOfSubject;
    private static int[][] score;
    public static void getArray() {
        System.out.println("Enter the number of student: ");
        numberOfStudent = input.nextInt();
        System.out.println("Enter the number of subject: ");
        numberOfSubject = input.nextInt();
        score = new int[numberOfStudent][numberOfSubject];
        for (int student = 0; student < numberOfStudent; student++) {
            System.out.println("Enter the score for student " + (student + 1));
            for (int subject = 0; subject < numberOfSubject; subject++) {
                System.out.println("Entering score for subject " + (subject + 1));
                score[student][subject] = input.nextInt();
            }
        }
    }

    public static void displayHeader(){
            for(int subject = 0; subject < numberOfSubject; subject++){
                System.out.print("\t\t\tSubject " +(subject+1));
            }
        System.out.println();

    }


    public static void main(String[] args) {
       getArray();
       displayHeader();

        for(int student = 0; student < numberOfStudent; student++){
            System.out.print("Student " +(student+1));
            for(int subject = 0; subject < numberOfSubject; subject++){
                System.out.print("\t\t\t" + score[student][subject]);
            }
            System.out.println();
        }

    }
}

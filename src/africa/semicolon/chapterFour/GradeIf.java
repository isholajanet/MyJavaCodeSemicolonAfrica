package africa.semicolon.chapterFour;

import java.util.Scanner;

public class GradeIf {

    public static void main(String[] args){
        int userInput;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        userInput = input.nextInt();
        if(userInput >= 60)
            System.out.println("Passed");

        if(userInput < 60)
            System.out.println("Failed");

    }
}

package africa.semicolon.chapterFour;

import java.util.Scanner;

public class Grade {
    public static void main(String[] args){
        int userInput;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        userInput = input.nextInt();
        if(userInput >= 60){
            System.out.println("Passed");
        }else{
            System.out.println("Failed");
        }
    }
}

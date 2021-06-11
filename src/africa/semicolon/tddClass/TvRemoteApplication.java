package africa.semicolon.tddClass;

import africa.semicolon.chapterThree.Television;

import java.util.Scanner;

public class TvRemoteApplication {
    public static void main(String[] args) {
        Television television = new Television("Samsung");
        Scanner input = new Scanner(System.in);
        int userInput;
        String userPrompt = """
                --> Enter 1 To Turn On
                --> Enter 2 To Set Channel
                --> Enter 3 To Set Volume
                --> Enter 4 To Set Brightness
                --> Enter 5 To Turn Off / Exit
                """;
        do{
            System.out.println(userPrompt);
            userInput = input.nextInt();

            switch(userInput){
                case 1:
                    System.out.println(userPrompt);
                    System.out.println("The TV is " +television.isOn());
                    System.out.println("The TV Channel Number is " +television.getChannel());
                    System.out.println("The TV volume number is " +television.getVolume());
                    break;

            }


        }while(userInput != 5);
    }
}

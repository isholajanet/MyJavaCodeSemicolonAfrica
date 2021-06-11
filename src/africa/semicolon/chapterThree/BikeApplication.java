package africa.semicolon.chapterThree;

import java.util.Scanner;

public class BikeApplication {
    public static void main(String[] args) {
        Bike bike = new Bike();
        Scanner input = new Scanner(System.in);
        int userInput;

        String prompt = """
                --> Enter 1 for Turn On
                --> Enter 2 for Accelerate
                --> Enter 3 for Decelerate
                --> Enter 4 To Turn Off / Exit Application
                """;
        do{
            System.out.println(prompt);
            userInput = input.nextInt();

            switch (userInput){
                case 1:
                    System.out.println(prompt);
                    System.out.println("The Bike is  " +bike.isOn());
                    System.out.println("The Bike gear Number is: " +bike.getGear());
                    System.out.println("The Bike speed is " +bike.getSpeedInKmPerHour());
                    break;
                case 2:
                    System.out.println(prompt);
                    System.out.println("The Bike is  " +bike.isOn());
                    System.out.println("The Bike gear Number is: " +bike.getGear());
                    System.out.println("The Bike speed is " +bike.getSpeedInKmPerHour());
                    break;


            }


        }while(userInput != 4);

    }
}

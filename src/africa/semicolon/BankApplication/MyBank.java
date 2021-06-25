package africa.semicolon.BankApplication;

import java.util.Scanner;

import static africa.semicolon.BankApplication.BankApp.mainMenuFunction;

public class MyBank {
    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            BankApp bankApp = new BankApp();
            System.out.println(mainMenuFunction());
            int options = input.nextInt();
            while (options != 3){
                switch (options){
                    case 1:
                        System.out.println("Enter pin:");
                        int pin = input.nextInt();
                        bankApp.staffLogin(options, pin);
                        break;
                    case 2:
                        String prompt = """
                                Enter 1 to Login
                                Enter 2 to register
                                """;
                        System.out.println(prompt);
                        int userInput = input.nextInt();
                        switch (userInput){
                            case 1:
                                System.out.println("Enter first name: ");
                                String firstName = input.next();
                                System.out.println("Enter last name: ");
                                String lastName = input.next();
                                System.out.println("Enter password: ");
                                int password = input.nextInt();
                                bankApp.registerCustomer(firstName,lastName,password);
                                bankApp.customerLogin(10001, 1234);
                        }




                }


                options = input.nextInt();;
            }




        }
    }

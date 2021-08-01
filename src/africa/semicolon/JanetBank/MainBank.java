package africa.semicolon.JanetBank;

import java.util.ArrayList;
import java.util.Scanner;

public class MainBank {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Bank bank = new Bank();
        ArrayList<Account> account = new ArrayList<>();
        Account myAccount = new Account();

        String mainOption = """
                Enter 1 to Register
                Enter 2 to Login
                Enter 3 to exit
                """;
        System.out.println("Welcome to my bank");
        System.out.println(mainOption);
        System.out.print("Enter a valid option: ");
        int userInput = input.nextInt();
        switch(userInput){
            case 1: {
                System.out.print("Enter your first name: ");
                String firstName = input.next();
                System.out.print("Enter your last name: ");
                String lastName = input.next();
                System.out.print("Enter your email address: ");
                String emailAddress = input.next();
                System.out.print("Enter phone number: ");
                String phoneNumber = input.next();
                bank.createAccount(firstName,lastName,emailAddress,phoneNumber);
                System.out.println("Successful");
            }

        }
    }
}

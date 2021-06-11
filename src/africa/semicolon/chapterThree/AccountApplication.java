package africa.semicolon.chapterThree;

import java.util.Scanner;

public class AccountApplication {
    public static void main(String[] args) {

    Account account = new Account("Ishola Janet", 5000.00);
    Scanner input = new Scanner(System.in);
    int userInput;

    String userPrompt = """
            --> Enter 1 to deposit
            --> Enter 2 to withdraw
            --> Enter 3 to exit
            """;

    do{
        System.out.println(userPrompt);
        userInput = input.nextInt();
        switch(userInput){
            case 1:
                System.out.println("Enter deposit amount ");
                System.out.println("My account balance is "+account.getAccountBalance());
                int depositAmount = input.nextInt();
                account.deposit(depositAmount);
                System.out.println("Successful");
                System.out.println("My new Account Balance is " +account.getAccountBalance());
                break;
            case 2:
                System.out.println("Enter withdrawal amount: ");
                System.out.println("My account balance is: " +account.getAccountBalance());
                double withdrawalAmount = input.nextInt();
                account.withdraw(withdrawalAmount);
                System.out.println("My account balance is: " +account.getAccountBalance());
                System.out.println("Withdrawal successful");
                break;
            case 3:
                System.out.println("Thank you for banking with us");
                break;
            default:
                System.out.println("Enter a valid input:");
                userInput = input.nextInt();
        }

    }while(userInput != 3);
}
}

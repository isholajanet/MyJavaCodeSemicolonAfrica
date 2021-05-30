package africa.semicolon.chapterFive;

import java.util.Scanner;

public class transaction {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int userOption = 0;
        String userPrompt = """
                ->Enter 1 for deposit;
                ->Enter 2 for withdraw;
                ->Enter 3 for view all account;
                ->Enter 4 for transfer;
                ->Enter 5 to view your details;
                ->Enter 6 to exit;
                ->Enter 7 to logout;
                """;
        do {
            System.out.printf(userPrompt);
            System.out.println("----->Enter a valid option");
            userOption = input.nextInt();
            if (userOption == 1) {
                System.out.println("Deposit");
            }else
                if(userOption == 2){
                    System.out.println("Withdraw");
                }else
                    if(userOption == 3){
                        System.out.println("View all account");
                    }else
                        if(userOption == 4){
                            System.out.println("Transfer");
                        }else
                            if(userOption == 5){
                                System.out.println("Account details");
                            }else
                                if(userOption == 6){
                                    System.out.println("Exit");
                                }else
                                    if(userOption == 7){
                                    System.out.println("Log out");
                                }else
                                    if(userOption < 7 || userOption > 1){
                                        System.out.println("Invalid input\nPlease, enter a valid input ");
                                    }
            System.out.println();
        } while (userOption != 6);
                userOption++;
        System.out.println();


        }
    }








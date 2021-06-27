package africa.semicolon.BankApplication;

import java.util.Arrays;
import java.util.Scanner;

import static africa.semicolon.BankApplication.BankApp.mainMenuFunction;

public class MainBankApp {
    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            BankApp bankApp = new BankApp();
            BankAccount bankAccount = new BankAccount();
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
                                Enter 1 to Register
                                Enter 2 to Log-in
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

                                if((firstName != null) && (lastName != null ) && (password != 0)){
                                    System.out.println("Account created successfully");
                                    System.out.println(bankApp.bankCustomers.get(0).getFirstName());
                                    System.out.println(prompt);
                                    userInput = input.nextInt();
                                        if(userInput == 2){
                                            System.out.println("Enter your account number: ");
                                            int accountNumber = input.nextInt();
                                            System.out.println("Enter your password: ");
                                            password = input.nextInt();
                                            bankApp.customerLogin(accountNumber,password);
                                       }

                                }else
                                    throw new IllegalArgumentException("Account not created successfully");
                                break;
                            case 2:
                                System.out.println("Enter your account number: ");
                                int accNumber = input.nextInt();
                                System.out.println("Enter your password: ");
                                int userPassword = input.nextInt();
                                bankApp.customerLogin(11001, 1234);
                                if((bankApp.bankAccount.getAccountNumber() == accNumber) && (bankApp.bankAccount.getPin() == userPassword)){
                                    bankApp.customerLogin(accNumber,userPassword);
                                    System.out.println("Choose an options: ");
                                    int userOptions = input.nextInt();
                                    switch (userOptions){
                                        case 1:
                                            System.out.println("Enter deposit amount ");
                                            System.out.println("My account balance is "+bankAccount.getAccountBalance());
                                            int depositAmount = input.nextInt();
                                            bankAccount.deposit(depositAmount);
                                            System.out.println("Successful");
                                            System.out.println("My new Account Balance is " +bankAccount.getAccountBalance());
                                            break;
                                        case 2:
                                            System.out.println("Enter withdrawal amount: ");
                                            System.out.println("My account balance is: " +bankAccount.getAccountBalance());
                                            double withdrawalAmount = input.nextInt();
                                            bankAccount.withdraw(withdrawalAmount);
                                            System.out.println("My account balance is: " +bankAccount.getAccountBalance());
                                            System.out.println("Withdrawal successful");
                                            break;
                                        case 3:
                                            System.out.println("Enter account number: ");
                                            int accountNumber = input.nextInt();
                                            System.out.println("Enter withdrawal amount: ");
                                            double transferAmount = input.nextDouble();
                                            bankAccount.withdraw(transferAmount);
                                            System.out.println("Amount transferred successfully");
                                            break;
                                        case 4:
                                            System.out.println("Enter phone number: ");
                                            long phoneNumber = input.nextLong();
                                            System.out.println("Enter the airtime amount: ");
                                            int airtimeAmount = input.nextInt();
                                            bankAccount.loadAirtime(airtimeAmount);
                                            System.out.println("Airtime transferred successfully");
                                            break;
                                        case 5:
                                            break;
                                    }

                                    }


                                }

                        }




                }


                options = input.nextInt();;
            }




        }


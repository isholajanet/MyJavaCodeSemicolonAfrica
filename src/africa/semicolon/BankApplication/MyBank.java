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
                        System.out.println("Create account: ");



                }


                options = input.nextInt();;
            }




        }
    }

package africa.semicolon.tddClass;

import java.util.Scanner;

public class Account {
    private double myAccountBalance;
    private double myAccountPin;
    private int pin = 1234;

    public void deposit(double amountToDeposit) {
        myAccountBalance = myAccountBalance + amountToDeposit;
        if (amountToDeposit < 0) {
            myAccountBalance = myAccountBalance;
        }

    }


    public double getAccountBalance() {

        return myAccountBalance;
    }

    public void withdraw(double amountToWithdraw) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your 4-digit pin: ");
        int enteredPin = input.nextInt();

        if(enteredPin != pin){
            System.out.print("Incorrect Pin");
            myAccountBalance = myAccountBalance;

        }else if (amountToWithdraw < 0) {
            myAccountBalance = myAccountBalance;
        } else if(amountToWithdraw > myAccountBalance){
            myAccountBalance = myAccountBalance;


            
        }else {
            myAccountBalance = myAccountBalance - amountToWithdraw;

        }


    }
    public void setAccountPin(int pin){
        this.myAccountPin = pin;

    }


    public double getMyAccountPin() {
        return myAccountPin;
    }
}

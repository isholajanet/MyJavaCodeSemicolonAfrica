package africa.semicolon.JanetBank;

import java.math.BigInteger;
import java.security.SecureRandom;

public class Account {
    private Customer customer;
    private SecureRandom random = new SecureRandom();
    private double accountBalance;
    private int accountNumber;


    public void setAccountBalance(double accountBalance) {

        this.accountBalance = accountBalance;
    }

    public double getAccountBalance() {
        return accountBalance;
    }
    public void setAccountNumber(int accountNumber){
        this.accountNumber = accountNumber;
    }

    public void deposit(double amountToDeposit) {
        if (amountToDeposit > 0.0) {
            accountBalance = accountBalance + amountToDeposit;
        }
    }

    public void withdraw(double amountToWithdraw) {
        if(amountToWithdraw > 0.0 && amountToWithdraw < accountBalance){
            accountBalance = accountBalance - amountToWithdraw;
        }

    }
}

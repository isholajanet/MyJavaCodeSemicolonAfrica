package africa.semicolon.JanetBank;

import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.ArrayList;

public class Bank {
    private ArrayList<Customer> newCustomer = new ArrayList<>();
    private Customer customer;
    private Account account;
    private static int numbersOfCustomer;
    private int accountNumber;
    private final int pin = 1234;
    public void createAccount(String firstName, String lastName, String emailAddress, String phoneNumber) {
        customer = new Customer(firstName,lastName,emailAddress,phoneNumber);
        newCustomer.add(customer);
        numbersOfCustomer = newCustomer.size();
        accountNumber = 10000 + numbersOfCustomer;
    }
    public ArrayList<Customer> getCustomer(){
        return newCustomer;
    }

    public int getNumberOfCustomer(){
        return newCustomer.size();
    }
    public int getAccountNumber(){
        return accountNumber;
    }


    public void transfer(int senderAccountNumber, int recipientAcctNumber, double amountToTransfer, int pin) {
        if(this.pin == pin){


        }
    }

    public Boolean login(int accountNumber, int pin) {
        for(Customer customer: newCustomer) {
            if (this.accountNumber != accountNumber && this.pin != pin) {
                return false;
            }
        }
        return true;
    }

}

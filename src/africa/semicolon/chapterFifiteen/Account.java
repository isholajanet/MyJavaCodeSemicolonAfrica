package africa.semicolon.chapterFifiteen;

import africa.semicolon.chapterFifteen.dietelExercises.TransactionRecord;

public class Account {
    private String firstName;
    private String lastName;
    private double balance;
    private int accountNumber;

    public Account(String firstName, String lastName, double balance, int accountNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.balance = balance;
        this.accountNumber = accountNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void combine(TransactionRecord record) {
        this.balance = record.getAmount() + this.balance;
    }
}

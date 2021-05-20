package africa.semicolon.chapterThree;

public class Account {
    private String name;
    private double balance;

    public Account(String accountName, double accountBalance) {
        name = accountName;

        if (accountBalance > 0.0){
            balance = accountBalance;
        }
    }

    public String getAccountName() {
        return name;
    }

    public void setAccountBalance(double accountBalance) {
        balance = accountBalance;
    }

    public double getAccountBalance() {
        return balance;
    }

    public void deposit(double depositAmount) {
        if (depositAmount > 0.0)
            balance = depositAmount + balance;
    }

    public void withdraw(double withdrawAmount) {
        if (withdrawAmount > balance){
            System.out.println("Withdrawal amount exceeded account balance");
            balance = balance;
        }else {
            balance = balance - withdrawAmount;
        }
    }
}

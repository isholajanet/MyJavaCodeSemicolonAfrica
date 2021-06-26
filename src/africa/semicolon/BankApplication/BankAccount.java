package africa.semicolon.BankApplication;

public class BankAccount {
    private String customerName;
    private int accountNumber;
    private int pin;
    private static int numbersOfAccount;
    private double accountBalance;

    public BankAccount() {

    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        int numberOfCustomers = 0;
        numberOfCustomers++;
        accountNumber = 10000 + numberOfCustomers;
        this.accountNumber = accountNumber;

    }

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public BankAccount(String customerName, int pin) {
        this.customerName = customerName;
        this.pin = pin;
        accountNumber = 10000 + numbersOfAccount;
        numbersOfAccount++;
    }
    public void getBankAccount(){

    }

    public void deposit(double amountToBeDeposit) {
        if(amountToBeDeposit < 0){
            accountBalance = accountBalance;
        }else {
            accountBalance = accountBalance + amountToBeDeposit;
        }

    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public double withdraw(double amountToWithdraw) {
        if(amountToWithdraw > 0){
            if(amountToWithdraw <= accountBalance) {
                accountBalance = accountBalance - amountToWithdraw;
            }
        }

        return amountToWithdraw;
    }

    public void loadAirtime(int phoneNumber, int amountToLoad) {
        withdraw(amountToLoad);

    }

}

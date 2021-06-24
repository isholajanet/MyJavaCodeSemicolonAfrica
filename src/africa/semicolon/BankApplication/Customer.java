package africa.semicolon.BankApplication;


public class Customer {
    private String firstName;
    private String lastName;
    private int password;
    private int accountNumber;
    private static int numberOfCustomers;
    private double accountBalance;

    public void setPassword(int password) {
        this.password = password;
    }

    public int getPassWord() {
        return password;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public Customer(String firstName, String lastName, int password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
        accountNumber = 10000+numberOfCustomers;
        numberOfCustomers++;
    }
    public Customer(){

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

    public int getAccountNumber() {
        return accountNumber;
    }
}

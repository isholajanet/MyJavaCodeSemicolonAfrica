package africa.semicolon.BankApplication;

public class Customer {
    private String name;
    private int password;
    private double accountBalance;
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public int getPassWord() {
        return password;
    }

    public void login(String name, int password) {

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

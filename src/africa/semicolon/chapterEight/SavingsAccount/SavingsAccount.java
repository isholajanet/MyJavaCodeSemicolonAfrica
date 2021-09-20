package africa.semicolon.chapterEight.SavingsAccount;

public class SavingsAccount {
    private static int annualInterestRate;
    private double savingsBalance;
    private double monthlyInterestRate;

    public SavingsAccount(double savingsBalance) {
        this.savingsBalance = savingsBalance;
    }

    public void setSavingsBalance(double savingsBalance) {
        this.savingsBalance = savingsBalance;
    }

    public double getSavingsBalance() {
        return savingsBalance;
    }

    public static int getAnnualInterestRate() {
        return annualInterestRate;
    }

    public static void setAnnualInterestRate(int annualInterestRate) {
        SavingsAccount.annualInterestRate = annualInterestRate;
    }

    public double calculateMonthlyInterest() {
        monthlyInterestRate = (savingsBalance * annualInterestRate) / 12;
        return monthlyInterestRate;
    }

    public void updateSavingsBalance() {

        savingsBalance += monthlyInterestRate;
    }
}

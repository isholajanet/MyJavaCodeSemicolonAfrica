package africa.semicolon.BankApplication;


public class Customer {
    private String firstName;
    private String lastName;
    private int password;
    private BankAccount bankAccount;

    public Customer(String firstName, String lastName, int password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
    }

    public BankAccount getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
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

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }
    public String displayName(){
        return getLastName() + " " + getFirstName();
    }



}
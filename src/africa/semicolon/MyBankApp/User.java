package africa.semicolon.MyBankApp;

public class User {
    private String firstName;
    private String lastName;
    private String address;
    private String mobileNumber;
    private int pin;
    private Account account;
    private boolean hasAccount;
    private UserType userType;



    public Account getAccount() {

        return account;
    }

    public void setAccount(Account account) {
        if(hasAccount){
            throw new IllegalArgumentException("User already has an account");
        }
        this.account = account;
        hasAccount = true;
        System.out.println();
    }

    public User(String firstName, String lastName, int pin) {
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public void IsDigitMoreThan11(String mobileNumber) {
        if(mobileNumber.length() != 11){
            this.mobileNumber = null;
        }else{
            this.mobileNumber = mobileNumber;
        }
    }

    public UserType getUserType(UserType customer) {
        return userType;
    }

    public void setUserType(UserType userType) {
        this.userType = userType;
    }

    public void setPin(int pin) {
        if(this.pin == pin){
            throw new IllegalArgumentException("New pin cannot be the same as the old pin");
        }
        this.pin = pin;
    }
    public int getPin() {

        return pin;
    }
    public int getAccountNumber() {
        return account.getAccountNumber();
    }
}

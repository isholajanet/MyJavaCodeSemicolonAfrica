package africa.semicolon.BankApplication;



public class BankApp {
    BankAccount bankAccount;
    Customer[] bankCustomers;
    Staff bankStaff;

    public void staffLogin(int option, int pin) {
        bankStaff = new Staff("admin", 1234);
        if(bankStaff.getPassWord() == pin){
           String prompt = """
                    Enter 1 to view all account
                    Enter 2 to delete account
                    Enter 3 to logout
                    """;
            System.out.println(prompt);

            switch (option){
                case 1:{
                    viewAllAccount();
                    break;
                }
                case 2: {
                    deleteAccount();
                    break;
                }
                case 3:
                    break;
            }
        }
    }

    private void deleteAccount() {
        bankCustomers = new Customer[0];
    }

    private void viewAllAccount() {
        for(Customer customer: bankCustomers){
            System.out.println(customer.displayName() + " " + customer.getBankAccount().getAccountNumber()
            + " " + customer.getBankAccount().getAccountBalance());
        }
    }

    public BankAccount getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }



    public Staff getBankStaff() {
        return bankStaff;
    }

    public void setBankStaff(Staff bankStaff) {
        this.bankStaff = bankStaff;
    }

    public static String mainMenuFunction() {
        return """
                ********************************************
                Welcome to our bank.
                Enter 1 to access app as a staff
                Enter 2 to access app as a customer
                Enter 3 to exit
                *********************************************
                """;
    }
}


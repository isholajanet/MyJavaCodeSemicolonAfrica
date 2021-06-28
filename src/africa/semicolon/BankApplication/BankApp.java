package africa.semicolon.BankApplication;

import java.util.ArrayList;
import java.util.Scanner;

public class BankApp {
    private ArrayList<Customer> bankCustomers = new ArrayList<>();
    private Staff bankStaff;

    public void staffLogin(int options, int pin) {
        bankStaff = new Staff("admin", 1234);
        Scanner input = new Scanner(System.in);
        if(bankStaff.getPassWord() == pin){
           String prompt = """
                    Enter 1 to view all account
                    Enter 2 to delete account
                    Enter 3 to logout
                    """;
            System.out.println(prompt);
            int option = input.nextInt();

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
        bankCustomers.remove(0);
    }

    private void viewAllAccount() {
        for(Customer customer: bankCustomers){
            if(customer!=null) {
                System.out.println(customer.displayName() + " " + customer.getBankAccount().getAccountNumber()
                        + " " + customer.getBankAccount().getAccountBalance());
            }else{
                System.out.println("Customer is null");
            }
        }
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

    public void customerLogin(int accountNumber, int password) {
        String prompt = """
                Enter 1 to deposit
                Enter 2 to withdraw
                Enter 3 to transfer
                Enter 4 to load airtime
                Enter 5 to log out
                """;
           System.out.println(prompt);

    }

    public void registerCustomer(String firstName, String lastName, int password) {

        Customer customer = new Customer(firstName, lastName, password);
        bankCustomers.add(customer);
    }

    public ArrayList<Customer> getBankCustomers() {
        return bankCustomers;
    }

    public void setBankCustomers(ArrayList<Customer> bankCustomers) {
        this.bankCustomers = bankCustomers;
    }
}


package africa.semicolon.MyBankApp;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    private List <User> customers = new ArrayList<>();
    public void createCustomer(User customer) {
        User newUser = new User(customer.getFirstName(), customer.getLastName(), customer.getPin());
        newUser.getUserType(UserType.CUSTOMER);
        customers.add(newUser);

    }

    public List<User> getCustomers() {
        return customers;
    }
}

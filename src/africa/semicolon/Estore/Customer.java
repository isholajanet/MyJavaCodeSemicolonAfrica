package africa.semicolon.Estore;

import java.util.ArrayList;

public class Customer extends User {
    private ArrayList <BillingInformation> billingInformations;

public Customer(){
    billingInformations = new ArrayList<>();
}

    public void addBillingInformation(BillingInformation billingInformation) {
        billingInformations.add(billingInformation);
    }

    public int getNumbersOfBillingInformation() {
        return billingInformations.size();
    }
}

package africa.semicolon.Estore;

import java.util.ArrayList;

public class Customer extends User {
    private ArrayList <BillingInformation> billingInformations;
    private ArrayList <ShoppingCart> shoppingCarts;

public Customer(){
    billingInformations = new ArrayList<>();
}

    public void addBillingInformation(BillingInformation billingInformation) {
        billingInformations.add(billingInformation);
    }

    public ArrayList<BillingInformation> getBillingInformations() {
        return billingInformations;
    }

    public void setBillingInformations(ArrayList<BillingInformation> billingInformations) {
        this.billingInformations = billingInformations;
    }

    public ArrayList<ShoppingCart> getShoppingCarts() {
        return shoppingCarts;
    }

    public void setShoppingCarts(ArrayList<ShoppingCart> shoppingCarts) {
        this.shoppingCarts = shoppingCarts;
    }

    public int getNumbersOfBillingInformation() {
        return billingInformations.size();
    }
}

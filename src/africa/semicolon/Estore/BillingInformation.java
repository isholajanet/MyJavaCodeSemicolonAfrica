package africa.semicolon.Estore;

public class BillingInformation {
    private String receiverName;
    private String phoneNumber;
    private Address deliveryAddress;
    private CreditCardInformation creditCardInformation;

    public String getReceiverName() {
        return receiverName;
    }

    public void setReceiverName(String receiverName) {
        this.receiverName = receiverName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Address getDeliveryAddress() {
        return deliveryAddress;
    }

    public void setDeliveryAddress(Address deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

    public void setCreditCardInformation(CreditCardInformation creditCardInformation) {
        this.creditCardInformation = creditCardInformation;
    }

    public CreditCardInformation getCreditCardInformation() {
        return creditCardInformation;
    }

}

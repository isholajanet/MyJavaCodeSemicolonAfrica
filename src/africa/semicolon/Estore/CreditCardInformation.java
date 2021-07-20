package africa.semicolon.Estore;

public class CreditCardInformation {
    private int cvv;
    private int cardExpirationYear;
    private int month;
    private String creditCardNumber;
    private String cardName;
    private CardType cardType;


    public int getCvv() {
        return cvv;
    }

    public void setCvv(int cvv) {
        this.cvv = cvv;
    }

    public int getCardExpirationYear() {
        return cardExpirationYear;
    }

    public void setCardExpirationYear(int cardExpirationYear) {
        this.cardExpirationYear = cardExpirationYear;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public String getCreditCardNumber() {
        return creditCardNumber;
    }

    public void setCreditCardNumber(String creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }

    public String getCardName() {
        return cardName;
    }

    public void setCardName(String cardName) {
        this.cardName = cardName;
    }

    public CardType getCardType() {
        return cardType;
    }

    public void setCardType(CardType cardType) {
        this.cardType = cardType;
    }
}

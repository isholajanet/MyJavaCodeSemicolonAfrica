package africa.semicolon.chapterSeven.TotalSales;

public class Slip {

    private Product product;
    private int quantity;

    public Slip(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public Product getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }
}

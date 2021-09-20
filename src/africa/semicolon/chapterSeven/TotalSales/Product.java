package africa.semicolon.chapterSeven.TotalSales;

public class Product {
    private int productNumber;
    private double productPrice;
    public Product(int productNumber, double productPrice) {
        this.productNumber = productNumber;
        this.productPrice = productPrice;
    }

    public int getProductNumber() {
        return productNumber;
    }

    public double getProductPrice() {
        return productPrice;
    }
}

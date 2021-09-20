package africa.semicolon.chapterSeven.TotalSales;

public class SalesPerson {
    private int number;
    private int[] products = new int[5];
    public SalesPerson(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void insertSalesForEachProduct(Slip slip){
        products[slip.getProduct().getProductNumber()-1] = slip.getQuantity();
    }

    public int[] getProducts() {
        return products;
    }
}


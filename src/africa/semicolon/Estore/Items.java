package africa.semicolon.Estore;

import java.util.ArrayList;

public class Items {
    private int quantity;
    private ArrayList <Product> products;

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }
}


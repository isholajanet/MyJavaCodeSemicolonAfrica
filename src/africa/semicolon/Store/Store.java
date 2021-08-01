package africa.semicolon.Store;


import java.util.ArrayList;

public class Store {
    private ArrayList<Products> myProduct = new ArrayList<>();

    public void setProducts(String productName, double productPrice, int productQuantity){
        Products products = new Products(productName,productPrice,productQuantity);
        myProduct.add(products);
    }
    public ArrayList<Products> getProducts(){
        return myProduct;
    }
}

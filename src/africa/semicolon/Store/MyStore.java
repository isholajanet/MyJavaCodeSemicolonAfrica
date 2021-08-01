package africa.semicolon.Store;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class MyStore {
    private static Store myStore = new Store();
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String header = """
                LIZMAT STORE
                MAIN BRANCH
                LOCATION:   YABA
                Vat Reg No.:
                """;
        int totalPrice = 0;
        int userOption = 1;
        while(userOption != 2) {
            System.out.print("What did the customer get: ");
            String productName = input.next();
            System.out.print("How much is the product: ");
            double productPrice = input.nextDouble();
            System.out.print("How many did the customer get: ");
            int productQuantity = input.nextInt();
            myStore.setProducts(productName,productPrice,productQuantity);

            System.out.print("Enter 1 to continue and 2 to exit");
            userOption = input.nextInt();

        }
        System.out.println();

        System.out.println("**************************INVOICE****************************");
        System.out.println("Product-Name\tProduct-Price\tProduct-Quantity\tTotal-Price");
        for (Products product: myStore.getProducts()) {
            System.out.println(product.getProductName() + "\t\t\t\t" + product.getProductPrice() + "\t\t\t\t" + product.getProductQuantity() + "\t\t\t\t" + product.getTotalPriceOfGoods());
            totalPrice+= product.getTotalPriceOfGoods();
        }
        System.out.println("**************************************************************");
        System.out.println("Total price is " +totalPrice);


    }
}

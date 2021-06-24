package africa.semicolon.chapterFive;

import java.util.Scanner;

public class CalculatingSales {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int productNumber = 1;
        int quantity = 1;
        double productPrice = 1;
        double totalPrice = 0.0;
            while (productNumber != 0 && quantity != 0){
                System.out.println("Enter the product number: ");
                productNumber = input.nextInt();
                if(productNumber != 0) {
                    System.out.println("Enter the quantity sold: ");
                    quantity =
                            input.nextInt();
                }
                switch (productNumber) {
                    case 1 -> productPrice = 2.98;
                    case 2 -> productPrice = 4.50;
                    case 3 -> productPrice = 9.98;
                    case 4 -> productPrice = 4.49;
                    case 5 -> productPrice = 6.87;
                    default -> System.out.println("Enter a valid input: ");
                }
                double price = quantity * productPrice;
                totalPrice = price + totalPrice;
            }

        System.out.println("The total price is " +totalPrice);
    }
}

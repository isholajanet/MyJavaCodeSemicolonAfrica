package africa.semicolon.tddClass;
import java.util.Scanner;

public class Kata {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int number;
        System.out.print("Enter a 3-digit number: ");
        number = input.nextInt();
        if(number/100 == number % 10 ){
            System.out.println("Number is palindrome");
        }else{
            System.out.println("Number is not palindrome");

        }


    }
    private String grade;
    public String displayGrade(int score) {

        if (score >= 90) {
            grade = "A";
        }else
        if(score >= 80) {
            grade = "B";
        }else
        if (score >= 70) {
            grade = "C";
        }else
        if (score >= 60) {
            grade = "D";
        }else
        if (score < 60) {
            grade = "F";
        }
        return grade;
    }
    private int sellerPrice;
    private int price;
    public int displayTotalPrice(int numberOfCopies) {
        //int price;
        if(numberOfCopies >= 1 && numberOfCopies <=4){
            price = 1500;
            sellerPrice = numberOfCopies * price;
        }
        else
            if(numberOfCopies >= 5 &&  numberOfCopies <=9){
                price = 1400;
                sellerPrice = numberOfCopies * price;
            }
            else
                if(numberOfCopies >=10 && numberOfCopies <=29){
                    price = 1200;
                    sellerPrice = numberOfCopies * price;
                }
                else
                    if(numberOfCopies >= 30 && numberOfCopies <= 49){
                        price = 1100;
                        sellerPrice = numberOfCopies * price;
                }
                    else
                        if(numberOfCopies >= 50 && numberOfCopies <= 99){
                            price = 1000;
                            sellerPrice = numberOfCopies * price;
                        }
                        else
                            if(numberOfCopies >= 100 && numberOfCopies <=199){
                                price = 900;
                                sellerPrice = numberOfCopies * price;
                            }
                            else
                                if(numberOfCopies >= 200){
                                    price = 800;
                                    sellerPrice = numberOfCopies * price;
                                }
        return sellerPrice;
    }
    private int sellerProfit;
    public int displayProfit(int numberOfCopies){
        sellerProfit = 2000;
       // sellerProfit = (numberOfCopies * sellerProfit) - (numberOfCopies * price);
        if (numberOfCopies >= 1 && numberOfCopies <=4){
            price = 1500;
            sellerProfit = (numberOfCopies * sellerProfit) - (numberOfCopies * price);
        }
        else
        if(numberOfCopies >= 5 &&  numberOfCopies <=9){
            price = 1400;
            sellerProfit = (numberOfCopies * sellerProfit) - (numberOfCopies * price);
        }
        else
        if(numberOfCopies >=10 && numberOfCopies <=29){
            price = 1200;
            sellerProfit = (numberOfCopies * sellerProfit) - (numberOfCopies * price);
        }
        else
        if(numberOfCopies >= 30 && numberOfCopies <= 49){
            price = 1100;
            sellerProfit = (numberOfCopies * sellerProfit) - (numberOfCopies * price);
        }
        else
        if(numberOfCopies >= 50 && numberOfCopies <= 99){
            price = 1000;
            sellerProfit = (numberOfCopies * sellerProfit) - (numberOfCopies * price);
        }
        else
        if(numberOfCopies >= 100 && numberOfCopies <=199){
            price = 900;
            sellerProfit = (numberOfCopies * sellerProfit) - (numberOfCopies * price);
        }
        else
        if(numberOfCopies >= 200){
            price = 800;
            sellerProfit = (numberOfCopies * sellerProfit) - (numberOfCopies * price);
        }
        return sellerProfit;

    }
}

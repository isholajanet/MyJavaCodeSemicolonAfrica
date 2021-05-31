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
        if(numberOfCopies >= 1 && numberOfCopies <=4){
            price = 1500;
        }
        else
            if(numberOfCopies >= 5 &&  numberOfCopies <=9){
                price = 1400;
            }
            else
                if(numberOfCopies >=10 && numberOfCopies <=29){
                    price = 1200;
                }
                else
                    if(numberOfCopies >= 30 && numberOfCopies <= 49){
                        price = 1100;
                }
                    else
                        if(numberOfCopies >= 50 && numberOfCopies <= 99){
                            price = 1000;
                        }
                        else
                            if(numberOfCopies >= 100 && numberOfCopies <=199){
                                price = 900;
                            }
                            else
                                if(numberOfCopies >= 200){
                                    price = 800;
                                }
        sellerPrice = numberOfCopies * price;
        return sellerPrice;
    }
    private int sellerProfit;
    public int displayProfit(int numberOfCopies){

        sellerProfit = 2000;

        if(numberOfCopies >= 1 && numberOfCopies <=4){
            price = 1500;
        }
        else
        if(numberOfCopies >= 5 &&  numberOfCopies <=9){
            price = 1400;
        }
        else
        if(numberOfCopies >=10 && numberOfCopies <=29){
            price = 1200;
        }
        else
        if(numberOfCopies >= 30 && numberOfCopies <= 49){
            price = 1100;
        }
        else
        if(numberOfCopies >= 50 && numberOfCopies <= 99){
            price = 1000;
        }
        else
        if(numberOfCopies >= 100 && numberOfCopies <=199){
            price = 900;
        }
        else
        if(numberOfCopies >= 200){
            price = 800;
        }
        sellerProfit = (numberOfCopies * sellerProfit) - (numberOfCopies * price);
        return sellerProfit;

    }
    public int returnFactorCount(int number){
        int factor = 1;
        int count = 0;
        while (factor <= number){
           if(number % factor == 0){

               count++;
           }
           factor++;
        }
        return count;

    }

    public String getReverse(int number) {
        //number = 12345;

        int firstDigit = number / 10000;
        int firstModulo = number % 10000;
        int secondDigit = firstModulo / 1000;
        int secondModulo = firstModulo % 1000;
        int thirdDigit = secondModulo / 100;
        int thirdModulo = secondModulo % 100;
        int fourthDigit = thirdModulo / 10;
        int fourthModulo = thirdModulo % 10;
        int fifthDigit = fourthModulo;
        return fifthDigit + "" + fourthDigit + "" + thirdDigit + "" + secondDigit + "" + firstDigit;
    }
    public String getReverseUsingLoop(int number){
        int remainder;
        int dividend;
        String reverse = "";
        int divisor = 10;
        while(number != 0){
            remainder = number % divisor;
            dividend = number / divisor;
            reverse = reverse + remainder;
            number = dividend;
        }
        return reverse;
    }



    }


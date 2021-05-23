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
        return price;
    }
}

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
}

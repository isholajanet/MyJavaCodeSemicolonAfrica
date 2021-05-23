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

    private int gradeNumber;
    public void setGrade(int gradeNumber) {
        this.gradeNumber = gradeNumber;
    }

    public int getGrade() {
        return gradeNumber;

    }

    public void displayGrade() {
        if (gradeNumber >= 90) {
            System.out.println("A");
        }else
        if(gradeNumber >= 80) {
            System.out.println("B");
        }else
        if (gradeNumber >= 70) {
            System.out.println("C");
        }else
        if (gradeNumber >= 60) {
            System.out.println("D");
        }else {
            System.out.println("F");
        }
    }
}

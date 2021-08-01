package africa.semicolon.randomExercises;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a;
        int b;
        int sum;
        System.out.println("Enter first number: ");
        a = input.nextInt();
        System.out.println("Enter second number: ");
        b = input.nextInt();
        if((a > 10) && (b > 10)){
            throw new InputMismatchException("Number is greater than 10");
        }else{
            sum = a + b;
            System.out.println("Sum is " + sum);
        }
    }
}

package africa.semicolon.chapterFour;

import java.util.Scanner;

public class Factorial {
    private int number;
    public void setNumber(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public int getTheFactorialOf(int number) {

        int factorial = number;
        int totalFactorial = 1;
        while(factorial != 0){
            totalFactorial *= factorial;
            factorial--;

        }
        return totalFactorial;
    }
    public void getTheInverseOfTheFactorialOf(int number){
        int factorial = number;
        int totalFactorial = 1;
        int inverseFactorial = 1 / factorial;
        while(factorial != 0){
            totalFactorial *= factorial;

        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        System.out.println("Enter a number: ");
//        int number = input.nextInt();
        //int factorial = number;
        int factorial = 1;
        int count = 1;
        int number = 1;
        int firstFactorial;
        int dividefactorial = 1;
        System.out.println("Enter a number: ");
        number = input.nextInt();
        while(number > count) {
//            System.out.println("Enter a number: ");
//            number = input.nextInt();
            factorial = factorial * number;
//            while(factorial > 1){
//                dividefactorial = factorial / number;
                number--;
//            }
            count++;
            System.out.println(factorial);
        }




    }
}

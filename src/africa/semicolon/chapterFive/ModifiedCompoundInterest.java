package africa.semicolon.chapterFive;

import java.util.Scanner;

public class ModifiedCompoundInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the original amount invested ");
        int principal = input.nextInt();
        System.out.println("Enter the number of years: ");
        int years = input.nextInt();

        int annualRate = 5;
        int amount = 0;
        System.out.println("Annual rate \tAmount");
        while (annualRate <= 10){
            amount = (int) (principal * Math.pow(1.0 + (annualRate/100), years));
            System.out.println((annualRate/100) + "\t\t\t" + amount);
            annualRate++;
        }
    }
}

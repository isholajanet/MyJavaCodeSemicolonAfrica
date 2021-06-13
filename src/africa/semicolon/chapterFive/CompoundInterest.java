package africa.semicolon.chapterFive;

import java.util.Scanner;

public class CompoundInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the original amount invested ");
        double principal = input.nextDouble();
        System.out.println("Enter the number of years: ");
        double years = input.nextDouble();
        
        double annualRate = 5;
        double amount = 0;
        System.out.println("Annual rate \tAmount");
        while (annualRate <= 10){
            double percentageRate = annualRate / 100;
            amount = principal * Math.pow(1.0 + percentageRate, years);
            annualRate++;
            System.out.println(percentageRate + "\t\t\t" + amount);
        }
        
    }
}

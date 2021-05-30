package africa.semicolon.chapterFour.deitelExercises;

import java.util.Scanner;

public class SalaryCalculator {

    public double calculateGrossPay(int hourlyWork, int hourlyPayRate){
        double grossPay = 0.0;
        if(hourlyWork > 40){
            grossPay = hourlyPayRate * hourlyWork * 1.5;
        }else {
            grossPay = hourlyPayRate* hourlyWork;
        }
        return grossPay;
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the hourly rate for the employee");

        int numberOfHours = input.nextInt();

        System.out.println("Enter the number of hours worked last week");

       int hourlyPayRate = input.nextInt();

       SalaryCalculator calculator=new SalaryCalculator();

       double grossPay = calculator.calculateGrossPay(numberOfHours,hourlyPayRate);

        System.out.println("The gross pay of the employee is " +grossPay);
    }
}

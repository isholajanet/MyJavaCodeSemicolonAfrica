/**input account number, beginning balance, charges, credit and  credit limit
 * calculate the new balance (beginning balance + charges - credit)
 * display the new balance
 * check if the new balance is greater than credit limit
 * if it is,display "credit limit exceeded"
 */
package africa.semicolon.chapterFour.deitelExercises;

import java.util.Scanner;

public class CreditLimit {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int accountNumber;
        int beginningBalance;
        int charges;
        int credit;
        int creditLimit;

        System.out.println("Input account number");
        accountNumber = input.nextInt();
        System.out.println("Input balance at the beginning of the month");
        beginningBalance = input.nextInt();
        System.out.println("Input total of all items charged by the customer this month ");
        charges = input.nextInt();
        System.out.println("Input total of all the credits applied to the customer's account this month");
        credit = input.nextInt();
        System.out.println("Input allowed credit limit");
        creditLimit = input.nextInt();

        int newBalance = beginningBalance + charges - credit;

        System.out.println("The new balance is " + newBalance);
        if(newBalance > creditLimit){
            System.out.println("Credit limit exceeded");
        }

    }
}

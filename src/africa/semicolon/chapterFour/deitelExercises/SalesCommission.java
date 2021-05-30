/**input the value of an item
 * get the bonus of the item
 * while my item value is not zero
 * keep adding bonus to the list of item value bonus
 * then add my total bonus value to my salary
 * display the salesperson's salary
 */
package africa.semicolon.chapterFour.deitelExercises;

import java.util.Scanner;

public class SalesCommission {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int salary = 200;
        double itemValue = 1;
        double bonusOnItem;
        double totalBonusOnItem= 0;
        double totalSalary = 0;
        System.out.println("The value of the item is: ");
        itemValue = input.nextDouble();
        while(itemValue != 0){
            bonusOnItem = (9 * itemValue) / 100;
            totalBonusOnItem= totalBonusOnItem + bonusOnItem;
            System.out.println("The value of the item is: ");
            itemValue = input.nextDouble();
        }
        totalSalary = salary + totalBonusOnItem;
        System.out.println("The sales person total earning is " +totalSalary);
    }
}

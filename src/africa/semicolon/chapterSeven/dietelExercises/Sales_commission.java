package africa.semicolon.chapterSeven.dietelExercises;

import java.util.Arrays;
import java.util.Scanner;

public class Sales_commission {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int salary = 200;
        int[] commission = new int[10];
        for(int count = 0; count < commission.length; count++){
            System.out.println("Enter sales person's gross salary");
            int grossSalary = input.nextInt();
            int totalSalary = salary + ((9 * grossSalary) / 100);
            commission[count] = totalSalary;

            if (commission[count] > 200 && commission[count] < 299){

            }
        }
        System.out.println(Arrays.toString(commission));
        int numberOfSalary = 0;
        for(int count = 2; count < commission.length; count++){
            for(int counter = count; counter < commission.length; counter++){
                if(commission[count] > count*100 || commission[count] < count*100+9){
                    numberOfSalary++;
                }
            }
            if(count < 10){
                System.out.printf("$%02d - %02d  || %02d", count * 100,  count*100 + 99,numberOfSalary);
                System.out.println();
            }
        }

    }
}

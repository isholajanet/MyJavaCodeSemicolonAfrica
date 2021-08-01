package africa.semicolon.chapterFour.deitelExercises;

import java.util.Scanner;

public class car {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int gallons = 0;
        int miles = 0;
        int totalMiles = 0;
        int totalGallons = 0;

        while(miles != -1 && gallons != -1){
             totalMiles = totalMiles + miles;
             totalGallons = totalGallons + gallons;
            System.out.println("Enter the miles covered: ");
            miles = input.nextInt();

            if(miles!= -1) {
                System.out.println("Enter the gallons used: ");
                gallons = input.nextInt();
            }
        }
        double totalMilesCovered = totalMiles / totalGallons;
        System.out.println(totalMilesCovered);
    }
}

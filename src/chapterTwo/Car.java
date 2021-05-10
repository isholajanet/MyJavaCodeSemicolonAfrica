package chapterTwo;

import java.util.Scanner;
public class Car{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int totalMiles;
		int gasoline;
		int averageMiles;
		int parkingFees;
		int tolls;
		
		System.out.print("Enter the total miles driven per day: ");
		totalMiles = input.nextInt();
		System.out.print("Enter the cost per gallon of gasoline: ");
		gasoline = input.nextInt();
		System.out.print("Enter the average miles per gallon: ");
		averageMiles = input.nextInt();
		System.out.print("Enter the parking fees per day: ");
		parkingFees = input.nextInt();
		System.out.print("Enter the tolls per day: ");
		tolls = input.nextInt();

		int dailyDrivingCost = (totalMiles + gasoline + averageMiles + parkingFees + tolls) / 5;
		System.out.printf("The daily driving cost is %d%n", dailyDrivingCost);
	}
}
package chapterTwo;

import java.util.Scanner;
public class BmiCalculator{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int weightInPounds;
		int heightInInches;
		int BMI;
	System.out.print("Enter your weight in kilograms: ");
	weightInPounds = input.nextInt();
	System.out.print("Enter your height in meters: ");
	heightInInches = input.nextInt();
	BMI = (weightInPounds * 703) / (heightInInches * heightInInches);
	System.out.println("The user's body mass index is " + BMI);	
	}
	
}
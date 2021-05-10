package chapterTwo;

import java.util.Scanner;
public class Population{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	double currentPopulation;
	double growthRate;
	System.out.print("Enter the current population of the world: ");
	currentPopulation = input.nextDouble();
	System.out.print("Enter the annual world population growth rate of the world(in percent): ");
	growthRate = input.nextDouble();
	growthRate = growthRate / 100;
 	double firstYear = currentPopulation + (currentPopulation * growthRate);
	double secondYear = firstYear +	(firstYear * growthRate);
	double thirdYear = secondYear + (secondYear * growthRate);
	double fourthYear = thirdYear + (thirdYear * growthRate);
	double fifthYear = fourthYear + (fourthYear * growthRate);
	
	System.out.printf("World population after one year is: %f%n", firstYear);
	System.out.printf("World population after two year is: %f%n", secondYear);
	System.out.printf("World population after third year is: %f%n", thirdYear);
	System.out.printf("World population after fourth year is: %f%n", fourthYear);
	System.out.printf("World population after fifth year is: %f", fifthYear);
		
	}
}
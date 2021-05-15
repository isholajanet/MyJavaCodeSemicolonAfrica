package chapterTwo;

import java.util.Scanner;
public class Example{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int firstNumber;
		int secondNumber;
		int sum;
		System.out.print("Enter the first number ");
		firstNumber = input.nextInt();
		System.out.print("Enter the second number ");
		secondNumber = input.nextInt();
		sum = firstNumber + secondNumber;
		System.out.printf("The sum is %d", sum);

	}
}
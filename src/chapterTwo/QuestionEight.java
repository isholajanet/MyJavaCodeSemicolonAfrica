package chapterTwo;

import java.util.Scanner;
	public class QuestionEight{
		public static void main(String[] args){
			Scanner input = new Scanner(System.in);
			int number;
			System.out.print("Enter a number ");
			number = input.nextInt();
			if (number % 2 == 0){
				System.out.println("The number is an even number");
			}
			if (number % 2 != 0){
				System.out.println("The number is an odd number");
			}
		}
	}
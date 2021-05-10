package chapterTwo;

import java.util.Scanner;
	public class QuestionNine{
		public static void main(String[] args){
			Scanner input = new Scanner(System.in);
			int number1;
			int number2;
			System.out.print("Enter the first number ");
			number1 = input.nextInt();
			System.out.print("Enter the second number ");
			number2 = input.nextInt();
			if (number1 % number2 == 0){
				System.out.println("It is a multiple");
			}
			else{
				System.out.println("It is not a multiple");
			}

		}
	}
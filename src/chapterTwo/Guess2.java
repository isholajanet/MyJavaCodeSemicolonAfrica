package chapterTwo;

import java.util.Scanner;

public class Guess2 {
	public static void main(String... args) {
		Scanner input = new Scanner(System.in);

		int number = 0;
		int guessNumber = 100;
		System.out.println("Enter a number");
		number = input.nextInt();

		if (number == guessNumber) {
			System.out.println("Correct");
		}	

		if (number != guessNumber) {
			if (number > guessNumber) {
				System.out.println("Number is too high");
			}
			if (number < guessNumber) {
				System.out.println("Number is too low");
			}
			System.out.println("Try again");
			number = input.nextInt();

		}			

	}
}
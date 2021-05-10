package chapterTwo;

import java.util.Scanner;
public class Guess{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int mysteryNumber = 129;
		int guessNumber;
		
	System.out.print("Welcome user, guess a number ");
	guessNumber = input.nextInt();
		if (guessNumber == mysteryNumber){
			System.out.println("Well done, you got it right");
		}

		if (guessNumber != mysteryNumber){
			if (guessNumber < mysteryNumber){
				System.out.println("Wrong, It is too low");
			}

			if (guessNumber > mysteryNumber){
				System.out.println("Wrong, It is too high");
			}

				System.out.print("You have two more chance, try again ");
	
				guessNumber = input.nextInt();
			if (guessNumber == mysteryNumber){
				System.out.println("Well done, you got it right");
			}
			if (guessNumber != mysteryNumber){
				if (guessNumber < mysteryNumber){
					System.out.println("Wrong, It is too low");
				}
				if (guessNumber > mysteryNumber){
					System.out.println("Wrong, It is too high");
				}
				System.out.print("Your last chance, try again ");
				guessNumber = input.nextInt();
			}
			if(guessNumber != mysteryNumber)
				System.out.printf("All your guesses are wrong, you failed. The correct number is %d", mysteryNumber);
	
	
		}
	}
}
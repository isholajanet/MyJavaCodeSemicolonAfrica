package chapterTwo;

import java.util.Scanner;
public class QuestionThirteen{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the 5 digit integer ");
		int number = input.nextInt();

		int firstnumber = number / 10000;
		int thousandth = number % 10000;

		int secondnumber = thousandth / 1000;
		int hundredth = thousandth % 1000;

		int thirdnumber = hundredth / 100;
		int tenth = hundredth % 100;

		int fourthnumber = tenth / 10;
		int unit = tenth % 10;

		int fifthnumber = unit;
		

		System.out.printf("%d %d %d %d %d%n",firstnumber,secondnumber,thirdnumber,fourthnumber,fifthnumber);
		
		
		
	}
}
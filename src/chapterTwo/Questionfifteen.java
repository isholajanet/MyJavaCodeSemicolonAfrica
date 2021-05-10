package chapterTwo;

import java.util.Scanner;
public class Questionfifteen{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		
		System.out.print("Enter the first number ");
		int firstnumber = input.nextInt();
		System.out.print("Enter the second number ");
		int secondnumber = input.nextInt();
		System.out.print("Enter the third number ");
		int thirdnumber = input.nextInt();
		System.out.print("Enter the fourth number ");
		int fourthnumber = input.nextInt();
		System.out.print("Enter the fifth number ");
		int fifthnumber = input.nextInt();
		int negativeCount =0;
		int positiveCount = 0;
		int zeroCount = 0;
		if(firstnumber < 0)
		negativeCount = 1;
		if(firstnumber == 0)
		zeroCount = 1;
		if(firstnumber > 0)
		positiveCount = 1;
		if(secondnumber < 0 )
		negativeCount = negativeCount + 1;
		if(secondnumber == 0)
		zeroCount = zeroCount + 1;
		if(secondnumber > 0)
			positiveCount = positiveCount + 1;
		if(thirdnumber < 0 )
			negativeCount = negativeCount + 1;
		if(thirdnumber == 0)
			zeroCount = zeroCount + 1;
		if(thirdnumber > 0)
			positiveCount = positiveCount + 1;
		if (fourthnumber < 0 )
			negativeCount = negativeCount + 1;
		if(fourthnumber == 0 )
			zeroCount = zeroCount + 1;
		if(fourthnumber > 0)
			positiveCount = positiveCount + 1;
		if (fifthnumber < 0)
			negativeCount = negativeCount + 1;
		if (fifthnumber == 0)
			zeroCount = zeroCount + 1;
		if (fifthnumber > 0)
			positiveCount = positiveCount + 1;
		System.out.printf("the number of negative numbers: %d%n", negativeCount);
		System.out.printf("the number of zero:  %d%n", zeroCount);
		System.out.printf("the number of positive numbers: %d", positiveCount);   
	}
}
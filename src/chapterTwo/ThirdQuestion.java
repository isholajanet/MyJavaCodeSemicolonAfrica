package chapterTwo;

import java.util.Scanner;
	public class ThirdQuestion{
		public static void main(String[] args){
			int a;
			int b;
			int sum;
			int product;
			int difference;
			int quotient;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the value for a ");
		a = input.nextInt();
		System.out.print("Enter the value for b ");
		b = input.nextInt();
		sum = a + b;
		product = a * b;
		difference = a - b;
		quotient = a / b;
		System.out.println("Sum is " + sum);
		System.out.println("Product is " + product);
		System.out.println("Difference is " + difference);
		System.out.println("Quotient is " + quotient);
		
		
		}
}
package chapterTwo;

import java.util.Scanner;
	public class FourthQuestion{
		public static void main(String[] args){
			Scanner input = new Scanner(System.in);
			int a;
			int b;

			System.out.print("Enter the value of a ");
			a = input.nextInt();
			System.out.print("Enter the value of b ");
			b = input.nextInt();
			if (a > b)
			System.out.println("a is larger");

			if ( b > a)
			System.out.println("b is larger");
		
			if (a == b)
			System.out.println("These numbers are equal");
		
		}
	}
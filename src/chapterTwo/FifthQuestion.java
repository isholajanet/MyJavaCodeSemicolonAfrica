package chapterTwo;

import java.util.Scanner;
	public class FifthQuestion{
		public static void main(String[] args){
			Scanner input = new Scanner(System.in);
			int a;
			int b;
			int c;
			int sum;
			int average;
			int product;
			System.out.print("Enter the value for a ");
			a = input.nextInt();
			System.out.print("Enter the value for b ");
			b = input.nextInt();
			System.out.print("Enter the value for c ");
			c = input.nextInt();
			sum = a + b + c;
			average = (a + b + c) / 3;
			product = a * b * c;
			System.out.println("sum is " + sum);
			System.out.println("average is " + average);
			System.out.println("product is " + product);
			if ((a > b) && (a > c)){
				System.out.println("a is larger");
			}
			else if (b > c){
				System.out.println("b is larger");
			}
			else {
				System.out.println("c is larger");
			}
	
		}
	
	
	}
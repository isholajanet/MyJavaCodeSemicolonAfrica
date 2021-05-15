package chapterTwo;

import java.util.Scanner;
	public class SecondQuestion{
		public static void main(String[] args){
			int x;
			int y;
			int z;
			int result;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the value for x ");
		x = input.nextInt();
		System.out.print("Enter the value for y ");
		y = input.nextInt();
		System.out.print("Enter the value for z ");
		z = input.nextInt();
		result = x + y + z;
		System.out.printf("Sum is %d%n", result);
		
		
		}
}